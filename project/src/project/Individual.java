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
        int crossoverPoint = rand.nextInt(size); // Randomly select the crossover point

        //the each child get the first coordonates from one parent up to the crossoverPoint
        child1 = new ArrayList<>(parent1.subList(0, crossoverPoint));
        child2 = new ArrayList<>(parent2.subList(0, crossoverPoint));

        // we give the rest of coordonates 
        for (int i = crossoverPoint; i < size; i++) {
            child1.add(parent2.get(i));
            child2.add(parent1.get(i));
        }

    }

    public void mutate(ArrayList<Project> childFractal) {
        Random random = new Random();

        Project mutateChild = childFractal.get(random.nextInt(childFractal.size()));

        //the child will receive a random coordonate as a mutation
        switch (random.nextInt(4)) {
            case 0:
                int newX1 = random.nextInt(100);
                int newY1 = random.nextInt(100);
                mutateChild.setX1(newX1);
                mutateChild.setY1(newY1);
                break;
            case 1:
                int newX2 = random.nextInt(100);
                int newY2 = random.nextInt(100);
                mutateChild.setX2(newX2);
                mutateChild.setY2(newY2);
                break;
            case 2:
                int newX3 = random.nextInt(100);
                int newY3 = random.nextInt(100);
                mutateChild.setX3(newX3);
                mutateChild.setY3(newY3);
                break;
            case 3:
                int newX4 = random.nextInt(100);
                int newY4 = random.nextInt(100);
                mutateChild.setX4(newX4);
                mutateChild.setY4(newY4);
                break;
            default:
                break;
        }
    }

    public double fitness(Project fractal) {
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

        // Define the minimum and maximum allowed angles (in degrees)
        double minAngle = 40.0;
        double maxAngle = 120.0;

        // Define the minimum distance allowed
        double minDistance = 15.0; 

        // Initialize the grade
        int grade = 0;

        // Check the angles and adjust the grade accordingly
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

        // Check the distance and adjust the grade accordingly
        if (distance < minDistance) {
            grade--;
        } else {
            grade += 2;
        }

        // Check if the coverage percentage fits the rules
        if (coveragePercentage >= 40) {
            grade += 2;
        } else if (coveragePercentage < 30) {
            grade--;
        }

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

}
