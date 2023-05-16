/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;

/**
 *
 * @author andreea
 */
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Project extends JPanel {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private ArrayList<Project>shape;
    private Random random;
    private Color lineColor;

    
    int x1 ;
    int y1 ;
    int x2 ;
    int y2 ;
    int x3 ;
    int y3 ;
    int x4 ;
    int y4 ;
    int iterations = 4;

    public Project(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        setBackground(Color.WHITE);
        random = new Random();
        lineColor = Color.BLACK;
        setBorder(null);
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
      
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);

    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getX3() {
        return x3;
    }

    public int getY3() {
        return y3;
    }

    public int getX4() {
        return x4;
    }

    public int getY4() {
        return y4;
    }
    
    
    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public void setX4(int x4) {
        this.x4 = x4;
    }

    public void setY4(int y4) {
        this.y4 = y4;
    }

   
    public int getIterations() {
        return iterations;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Fractal Four Lines");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
