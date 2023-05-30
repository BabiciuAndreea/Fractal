/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author andreea
 */
public class Fractals_shapes {

    public void drawFractals(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int iterations, Color color) {
        if (iterations <= 0) {
            // Base case: draw a line segment
            g.drawLine(x1, y1, x4, y4);
             g.setColor(color);
        } else {

            // Recursive case: draw four fractals
            int dx = x4 - x1;
            int dy = y4 - y1;

            int x5 = x1 + dx / 3;
            int y5 = y1 + dy / 3;

            int x6 = (int) (0.5 * (x1 + x4) - Math.sqrt(3) * (y1 - y4) / 6);
            int y6 = (int) (0.5 * (y1 + y4) - Math.sqrt(3) * (x4 - x1) / 6);

            int x7 = x1 + 2 * dx / 3;
            int y7 = y1 + 2 * dy / 3;

            Color[] colors = {Color.BLACK, Color.MAGENTA, Color.BLUE, Color.GRAY};

            drawFractals(g, x1, y1, x5, y5, x6, y6, x7, y7, iterations - 1, colors[0]);
            drawFractals(g, x5, y5, x2, y2, x7, y7, x6, y6, iterations - 1, colors[1]);
            drawFractals(g, x6, y6, x7, y7, x3, y3, x4, y4, iterations - 1, colors[2]);
            drawFractals(g, x7, y7, x6, y6, x4, y4, x3, y3, iterations - 1, colors[3]);
        }

    }

    public void drawFirstIteration(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, double scale, Color color) {
        // Scale the initial coordinates
        int scaledX1 = (int) (x1 * scale);
        int scaledY1 = (int) (y1 * scale);
        int scaledX2 = (int) (x2 * scale);
        int scaledY2 = (int) (y2 * scale);
        int scaledX3 = (int) (x3 * scale);
        int scaledY3 = (int) (y3 * scale);
        int scaledX4 = (int) (x4 * scale);
        int scaledY4 = (int) (y4 * scale);
        

        Color[] colors = {Color.BLACK, Color.RED, Color.BLUE, Color.YELLOW};
        drawFractals(g, scaledX1, scaledY1, scaledX2, scaledY2, scaledX3, scaledY3, scaledX4, scaledY4, 1, colors[0]);
    }

}
