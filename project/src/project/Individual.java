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

    /*public void mutate(ArrayList<Project> fractal, double mutationRate) {
        Random rand = new Random();

        for (int i = 0; i < fractal.size(); i++) {
            Project coordinate = fractal.get(i);

            // Apply mutation to each coordinate
            int mutatedX = (int) (coordinate.getX() + rand.nextGaussian() * mutationRate);
            int mutatedY = (int) (coordinate.getY() + rand.nextGaussian() * mutationRate);

            // Update the coordinates with the mutated values
            coordinate.setX(mutatedX);
            coordinate.setY(mutatedY);
        }
    }*/

}
