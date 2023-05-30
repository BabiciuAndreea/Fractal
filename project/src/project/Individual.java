/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author andreea
 */
public class Individual {

    public void crossover(ArrayList<Project> parent1, ArrayList<Project> parent2) {
        ArrayList<Project> child1, child2;
        int size = parent1.size();
        Random rand = new Random();
        int crossoverPoint = rand.nextInt(size); // get a random point fot crossoverPoint

        //the each child get the first coordonates from one parent up to the crossoverPoint
        child1 = new ArrayList<>(parent1.subList(0, crossoverPoint));
        child2 = new ArrayList<>(parent2.subList(0, crossoverPoint));

        // get the rest of coordonates 
        for (int i = crossoverPoint; i < size; i++) {
            child1.add(parent2.get(i));
            child2.add(parent1.get(i));
        }

    }

    public void mutate(ArrayList<Project> childFractal) {
        Random random = new Random();

        for (Project project : childFractal) {
            switch (random.nextInt(4)) {
                case 0:
                    int newX1 = random.nextInt(100);
                    int newY1 = random.nextInt(100);
                    project.setX1(newX1);
                    project.setY1(newY1);
                    break;
                case 1:
                    int newX2 = random.nextInt(100);
                    int newY2 = random.nextInt(100);
                    project.setX2(newX2);
                    project.setY2(newY2);
                    break;
                case 2:
                    int newX3 = random.nextInt(100);
                    int newY3 = random.nextInt(100);
                    project.setX3(newX3);
                    project.setY3(newY3);
                    break;
                case 3:
                    int newX4 = random.nextInt(100);
                    int newY4 = random.nextInt(100);
                    project.setX4(newX4);
                    project.setY4(newY4);
                    break;
                default:
                    break;
            }
        }
    }

    //public ArrayList<Project> tournamentSelection(ArrayList<Project> population){
    public Project tournamentSelection(ArrayList<Project> population) {
        Random random = new Random();
        ArrayList<Project> tournamentParticipants = new ArrayList<>();

        // Select random individuals for the selection
        for (int i = 0; i < 8; i++) {
            int randomIndex = random.nextInt(population.size());
            tournamentParticipants.add(population.get(randomIndex));
        }

        // Individuals have to pas the fitness 
        double bestFitness = Double.NEGATIVE_INFINITY;
        Project bestIndividual = null;
        for (Project individual : tournamentParticipants) {
            double fitness = fitness(individual);
            if (fitness > bestFitness) {
                bestFitness = fitness;
                bestIndividual = individual;
            }
        }

        return bestIndividual;
    }

    public int fitness(Project fractal) {
        int totalArea = calculateTotalArea(fractal);
        int coveredArea = calculateCoveredArea(fractal);
        double coveragePercentage = (double) coveredArea / totalArea * 100;

        // Calculate the angles for each line
        double angle1 = calculateAngle(fractal.getX1(), fractal.getY1(), fractal.getX2(), fractal.getY2());
        double angle2 = calculateAngle(fractal.getX2(), fractal.getY2(), fractal.getX3(), fractal.getY3());
        double angle3 = calculateAngle(fractal.getX3(), fractal.getY3(), fractal.getX4(), fractal.getY4());
        double angle4 = calculateAngle(fractal.getX4(), fractal.getY4(), fractal.getX1(), fractal.getY1());

        // Calculate the distance between x1, y1 and x4, y4
        double distance = calculateDistance(fractal.getX1(), fractal.getY1(), fractal.getX4(), fractal.getY4());

        //  The allowed angles, maxim and minim 
        double minAngle = 40.0;
        double maxAngle = 120.0;

        // The minim allowed distance  between x1,y1 and x4,y4
        double minDistance = 15.0;

        int grade = 0;
        
        // Check if the coverage percentage fits the rules
        if (coveragePercentage >= 40) {
            grade += 3;
        } else if (coveragePercentage < 30) {
            grade-=2;
        }

        // Check the angles between each line and give the grade
        if (angle1 < minAngle || angle1 > maxAngle) {
            grade--;
        } else {
            grade += 2;
        }

        if (angle2 < minAngle || angle2 > maxAngle) {
            grade--;
        } else {
            grade += 2;
        }

        if (angle3 < minAngle || angle3 > maxAngle) {
            grade--;
        } else {
            grade += 2;
        }

        if (angle4 < minAngle || angle4 > maxAngle) {
            grade--;
        } else {
            grade += 2;
        }

        // Check the distance between x1, y1 and x4, y4
        if (distance < minDistance) {
            grade--;
        } else {
            grade += 3;
        }

        

        grade = Math.max(0, grade);
        return grade;
    }

    private int calculateTotalArea(Project fractal) {

        int canvasWidth = 470;
        int canvasHeight = 390;

        // Calculate the total area based on the coordinates of the fractal and the canvas dimensions
        int minX = Math.min(fractal.getX1(), Math.min(fractal.getX2(), Math.min(fractal.getX3(), fractal.getX4())));
        int minY = Math.min(fractal.getY1(), Math.min(fractal.getY2(), Math.min(fractal.getY3(), fractal.getY4())));
        int maxX = Math.max(fractal.getX1(), Math.max(fractal.getX2(), Math.max(fractal.getX3(), fractal.getX4())));
        int maxY = Math.max(fractal.getY1(), Math.max(fractal.getY2(), Math.max(fractal.getY3(), fractal.getY4())));

        // Adjust the coordinates to fit within the canvas dimensions
        minX = Math.max(minX, 0);
        minY = Math.max(minY, 0);
        maxX = Math.min(maxX, canvasWidth);
        maxY = Math.min(maxY, canvasHeight);

        int width = maxX - minX;
        int height = maxY - minY;

        int totalArea = width * height;
        return totalArea;
    }

    private int calculateCoveredArea(Project fractal) {
        // Calculate the covered area based on the coordinates of the fractal
        int minX = Math.min(fractal.getX1(), Math.min(fractal.getX2(), Math.min(fractal.getX3(), fractal.getX4())));
        int minY = Math.min(fractal.getY1(), Math.min(fractal.getY2(), Math.min(fractal.getY3(), fractal.getY4())));
        int maxX = Math.max(fractal.getX1(), Math.max(fractal.getX2(), Math.max(fractal.getX3(), fractal.getX4())));
        int maxY = Math.max(fractal.getY1(), Math.max(fractal.getY2(), Math.max(fractal.getY3(), fractal.getY4())));

        int width = maxX - minX;
        int height = maxY - minY;

        int coveredArea = width * height;
        return coveredArea;
    }

    public double calculateAngle(int x1, int y1, int x2, int y2) {
        // Calculate the slope of the line
        double slope = (double) (y2 - y1) / (x2 - x1);

        // Calculate the angle of the line using the slope
        double angle = Math.toDegrees(Math.atan(slope));

        return angle;
    }

    private double calculateDistance(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void bubbleSort(ArrayList<Project> paintings) {

        int k = 0;
        for (int i = 0; i < 100 - 1; i++) {
            k++;

            for (int j = 0; j < 100 - i - 1; j++) {
                if (paintings.get(j).getGrade() < paintings.get(j + 1).getGrade()) {

                    int temp = paintings.get(j).getGrade();
                    paintings.get(j).setGrade(paintings.get(j + 1).getGrade());
                    paintings.get(j + 1).setGrade(temp);

                }
            }
        }
    }

}
