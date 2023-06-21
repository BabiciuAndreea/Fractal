/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 *
 * @author andreea
 */
public class Fractal_Canvas extends javax.swing.JFrame {

    /**
     * Creates new form Fractal_Canvas
     */
    public Fractal_Canvas() {
        initComponents();
    }
    int x1;
    int y1;
    int x2;
    int y2;
    int x3;
    int y3;
    int x4;
    int y4;
    Random rand = new Random();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        fractal1 = new javax.swing.JButton();
        fractal5 = new javax.swing.JButton();
        fractal2 = new javax.swing.JButton();
        fractal6 = new javax.swing.JButton();
        fractal3 = new javax.swing.JButton();
        fractal7 = new javax.swing.JButton();
        fractal4 = new javax.swing.JButton();
        fractal8 = new javax.swing.JButton();
        seeButton = new javax.swing.JButton();
        newPaintsButton = new javax.swing.JButton();
        bestFractals = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 22, 470, 390));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, -1, -1));

        jCheckBox8.setText("jCheckBox8");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, -1, -1));

        jCheckBox7.setText("jCheckBox7");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, -1, -1));

        jCheckBox6.setText("jCheckBox6");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, -1, -1));

        jCheckBox5.setText("jCheckBox5");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, -1, -1));

        jCheckBox4.setText("jCheckBox4");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, -1, -1));

        jCheckBox3.setText("jCheckBox3");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, -1, -1));

        jCheckBox2.setText("jCheckBox2");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, -1));

        jCheckBox1.setText("jCheckBox1");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, -1));

        fractal1.setText("Fractal 1");
        fractal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fractal1ActionPerformed(evt);
            }
        });
        getContentPane().add(fractal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));
        fractal1.getAccessibleContext().setAccessibleDescription("");

        fractal5.setText("Fractal 5");
        fractal5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fractal5ActionPerformed(evt);
            }
        });
        getContentPane().add(fractal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        fractal2.setText("Fractal 2");
        fractal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fractal2ActionPerformed(evt);
            }
        });
        getContentPane().add(fractal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        fractal6.setText("Fractal 6");
        fractal6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fractal6ActionPerformed(evt);
            }
        });
        getContentPane().add(fractal6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));

        fractal3.setText("Fractal 3");
        fractal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fractal3ActionPerformed(evt);
            }
        });
        getContentPane().add(fractal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        fractal7.setText("Fractal 7");
        fractal7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fractal7ActionPerformed(evt);
            }
        });
        getContentPane().add(fractal7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, -1, -1));

        fractal4.setText("Fractal 4");
        fractal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fractal4ActionPerformed(evt);
            }
        });
        getContentPane().add(fractal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));

        fractal8.setText("Fractal 8");
        fractal8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fractal8ActionPerformed(evt);
            }
        });
        getContentPane().add(fractal8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, -1, -1));

        seeButton.setText("See the paints");
        seeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(seeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 24, -1, -1));

        newPaintsButton.setText("New paints");
        newPaintsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPaintsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(newPaintsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 102, -1));

        bestFractals.setText("Best paintings");
        bestFractals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestFractalsActionPerformed(evt);
            }
        });
        getContentPane().add(bestFractals, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\andreea\\Desktop\\Facultate+CV\\test_licenta\\black fractal.PNG")); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<Project> firstParent, secondParent, oldGeneration, newGeneration, newPaintings, newPaintings2, firstChild, secondChild;
    //ArrayList<Project> figures;
    Project figures, best;

    Random random = new Random();
    int grades = 0, limit = 100;

    Individual generation = new Individual();

    Fractals_shapes fractals;
    //Project coordinates;

    private void seeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeButtonActionPerformed
        // TODO add your handling code here:

        firstParent = new ArrayList<Project>();
        secondParent = new ArrayList<Project>();
        oldGeneration = new ArrayList<Project>(limit);
        newGeneration = new ArrayList<Project>(limit);
        newPaintings = new ArrayList<Project>(limit); //first array with childs
        newPaintings2 = new ArrayList<Project>(limit); //second array with childs

        for (int i = 0; i < limit; i++) {

            x1 = random.nextInt(400);
            y1 = random.nextInt(350);
            x2 = random.nextInt(400);
            y2 = random.nextInt(350);
            x3 = random.nextInt(400);
            y3 = random.nextInt(350);
            x4 = random.nextInt(400);
            y4 = random.nextInt(350);

            oldGeneration.add(new Project(x1, y1, x2, y2, x3, y3, x4, y4));

        }
        System.out.println("fractals created");
        figures = oldGeneration.get(0);

        //fractals = new ArrayList<Project>(7);
//        for (int i = 0; i < 8; i++) {
//
//            x1 = rand.nextInt(400);
//            y1 = rand.nextInt(350);
//            x2 = rand.nextInt(400);
//            y2 = rand.nextInt(350);
//            x3 = rand.nextInt(400);
//            y3 = rand.nextInt(350);
//            x4 = rand.nextInt(400);
//            y4 = rand.nextInt(350);
//            fractals.add(new Project(x1, y1, x2, y2, x3, y3, x4, y4));
//            System.out.println("fractal " + i + " created");
//
//        }
        //fractals = new Fractals_shapes();
//        Graphics g = jPanel1.getGraphics();
//        fractals.drawFractals(g, oldGeneration.get(0).getX1(), oldGeneration.get(0).getY1(), oldGeneration.get(0).getX2(), oldGeneration.get(0).getY2(), oldGeneration.get(0).getX3(), oldGeneration.get(0).getY3(), oldGeneration.get(0).getX4(), oldGeneration.get(0).getY4(), 4);
//
//        Graphics g1 = jPanel2.getGraphics();
//        fractals.drawFirstIteration(g1, oldGeneration.get(0).getX1(), oldGeneration.get(0).getY1(), oldGeneration.get(0).getX2(), oldGeneration.get(0).getY2(), oldGeneration.get(0).getX3(), oldGeneration.get(0).getY3(), oldGeneration.get(0).getX4(), oldGeneration.get(0).getY4(), 0.25);

    }//GEN-LAST:event_seeButtonActionPerformed

    private void newPaintsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPaintsButtonActionPerformed
        // TODO add your handling code here:

        repaint();
    }//GEN-LAST:event_newPaintsButtonActionPerformed

    private void fractal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fractal1ActionPerformed
        // TODO add your handling code here:

//        Graphics g = jPanel1.getGraphics();
//        fractals.drawFractals(g, oldGeneration.get(0).getX1(), oldGeneration.get(0).getY1(), oldGeneration.get(0).getX2(), oldGeneration.get(0).getY2(), oldGeneration.get(0).getX3(), oldGeneration.get(0).getY3(), oldGeneration.get(0).getX4(), oldGeneration.get(0).getY4(), 4);
//
//        Graphics g1 = jPanel2.getGraphics();
//        fractals.drawFirstIteration(g1, oldGeneration.get(0).getX1(), oldGeneration.get(0).getY1(), oldGeneration.get(0).getX2(), oldGeneration.get(0).getY2(), oldGeneration.get(0).getX3(), oldGeneration.get(0).getY3(), oldGeneration.get(0).getX4(), oldGeneration.get(0).getY4(), 0.25);
        displayFractal(0);

    }//GEN-LAST:event_fractal1ActionPerformed

    private void fractal5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fractal5ActionPerformed

//        Graphics g4 = jPanel1.getGraphics();
//        fractals.drawFractals(g4, oldGeneration.get(4).getX1(), oldGeneration.get(4).getY1(), oldGeneration.get(4).getX2(), oldGeneration.get(4).getY2(), oldGeneration.get(4).getX3(), oldGeneration.get(4).getY3(), oldGeneration.get(4).getX4(), oldGeneration.get(4).getY4(), 4);
//
//        Graphics g5 = jPanel2.getGraphics();
//        fractals.drawFirstIteration(g5, oldGeneration.get(4).getX1(), oldGeneration.get(4).getY1(), oldGeneration.get(4).getX2(), oldGeneration.get(4).getY2(), oldGeneration.get(4).getX3(), oldGeneration.get(4).getY3(), oldGeneration.get(4).getX4(), oldGeneration.get(4).getY4(), 0.25);
        displayFractal(4);
    }//GEN-LAST:event_fractal5ActionPerformed

    private void fractal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fractal2ActionPerformed
        // TODO add your handling code here:

//        Graphics g4 = jPanel1.getGraphics();
//        fractals.drawFractals(g4, oldGeneration.get(1).getX1(), oldGeneration.get(1).getY1(), oldGeneration.get(1).getX2(), oldGeneration.get(1).getY2(), oldGeneration.get(1).getX3(), oldGeneration.get(1).getY3(), oldGeneration.get(1).getX4(), oldGeneration.get(1).getY4(), 4);
//
//        Graphics g5 = jPanel2.getGraphics();
//        fractals.drawFirstIteration(g5, oldGeneration.get(1).getX1(), oldGeneration.get(1).getY1(), oldGeneration.get(1).getX2(), oldGeneration.get(1).getY2(), oldGeneration.get(1).getX3(), oldGeneration.get(1).getY3(), oldGeneration.get(1).getX4(), oldGeneration.get(1).getY4(), 0.25);
        displayFractal(1);
    }//GEN-LAST:event_fractal2ActionPerformed

    private void fractal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fractal3ActionPerformed
        // TODO add your handling code here:

//        Graphics g4 = jPanel1.getGraphics();
//        fractals.drawFractals(g4, oldGeneration.get(2).getX1(), oldGeneration.get(2).getY1(), oldGeneration.get(2).getX2(), oldGeneration.get(2).getY2(), oldGeneration.get(2).getX3(), oldGeneration.get(2).getY3(), oldGeneration.get(2).getX4(), oldGeneration.get(2).getY4(), 4);
//
//        Graphics g5 = jPanel2.getGraphics();
//        fractals.drawFirstIteration(g5, oldGeneration.get(2).getX1(), oldGeneration.get(2).getY1(), oldGeneration.get(2).getX2(), oldGeneration.get(2).getY2(), oldGeneration.get(2).getX3(), oldGeneration.get(2).getY3(), oldGeneration.get(2).getX4(), oldGeneration.get(2).getY4(), 0.25);
        displayFractal(2);
    }//GEN-LAST:event_fractal3ActionPerformed

    private void fractal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fractal4ActionPerformed
        // TODO add your handling code here:

//        Graphics g4 = jPanel1.getGraphics();
//        fractals.drawFractals(g4, oldGeneration.get(3).getX1(), oldGeneration.get(3).getY1(), oldGeneration.get(3).getX2(), oldGeneration.get(3).getY2(), oldGeneration.get(3).getX3(), oldGeneration.get(3).getY3(), oldGeneration.get(3).getX4(), oldGeneration.get(3).getY4(), 4);
//
//        Graphics g5 = jPanel2.getGraphics();
//        fractals.drawFirstIteration(g5, oldGeneration.get(3).getX1(), oldGeneration.get(3).getY1(), oldGeneration.get(3).getX2(), oldGeneration.get(3).getY2(), oldGeneration.get(3).getX3(), oldGeneration.get(3).getY3(), oldGeneration.get(3).getX4(), oldGeneration.get(3).getY4(), 0.25);
        displayFractal(3);
    }//GEN-LAST:event_fractal4ActionPerformed

    private void fractal6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fractal6ActionPerformed
        // TODO add your handling code here:

//        Graphics g4 = jPanel1.getGraphics();
//        fractals.drawFractals(g4, oldGeneration.get(5).getX1(), oldGeneration.get(5).getY1(), oldGeneration.get(5).getX2(), oldGeneration.get(5).getY2(), oldGeneration.get(5).getX3(), oldGeneration.get(5).getY3(), oldGeneration.get(5).getX4(), oldGeneration.get(5).getY4(), 4);
//
//        Graphics g5 = jPanel2.getGraphics();
//        fractals.drawFirstIteration(g5, oldGeneration.get(5).getX1(), oldGeneration.get(5).getY1(), oldGeneration.get(5).getX2(), oldGeneration.get(5).getY2(), oldGeneration.get(5).getX3(), oldGeneration.get(5).getY3(), oldGeneration.get(5).getX4(), oldGeneration.get(5).getY4(), 0.25);
        displayFractal(5);

    }//GEN-LAST:event_fractal6ActionPerformed

    private void fractal7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fractal7ActionPerformed
        // TODO add your handling code here:

//        Graphics g4 = jPanel1.getGraphics();
//        fractals.drawFractals(g4, oldGeneration.get(6).getX1(), oldGeneration.get(6).getY1(), oldGeneration.get(6).getX2(), oldGeneration.get(6).getY2(), oldGeneration.get(6).getX3(), oldGeneration.get(6).getY3(), oldGeneration.get(6).getX4(), oldGeneration.get(6).getY4(), 4);
//
//        Graphics g5 = jPanel2.getGraphics();
//        fractals.drawFirstIteration(g5, oldGeneration.get(6).getX1(), oldGeneration.get(6).getY1(), oldGeneration.get(6).getX2(), oldGeneration.get(6).getY2(), oldGeneration.get(6).getX3(), oldGeneration.get(6).getY3(), oldGeneration.get(6).getX4(), oldGeneration.get(6).getY4(), 0.25);
        displayFractal(6);

    }//GEN-LAST:event_fractal7ActionPerformed

    private void fractal8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fractal8ActionPerformed
        // TODO add your handling code here:

//        Graphics g4 = jPanel1.getGraphics();
//        fractals.drawFractals(g4, oldGeneration.get(7).getX1(), oldGeneration.get(7).getY1(), oldGeneration.get(7).getX2(), oldGeneration.get(7).getY2(), oldGeneration.get(7).getX3(), oldGeneration.get(7).getY3(), oldGeneration.get(7).getX4(), oldGeneration.get(7).getY4(), 4);
//
//        Graphics g5 = jPanel2.getGraphics();
//        fractals.drawFirstIteration(g5, oldGeneration.get(7).getX1(), oldGeneration.get(7).getY1(), oldGeneration.get(7).getX2(), oldGeneration.get(7).getY2(), oldGeneration.get(7).getX3(), oldGeneration.get(7).getY3(), oldGeneration.get(7).getX4(), oldGeneration.get(7).getY4(), 0.25);
        displayFractal(7);

    }//GEN-LAST:event_fractal8ActionPerformed

    private void bestFractalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestFractalsActionPerformed
        // TODO add your handling code here:

        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);

        if (oldGeneration == null) {
            System.out.println("Need to create the first generation");
        } else {

            int k = 0;
            while (k < 10) {

                k++;
                firstParent = new ArrayList<>();
                secondParent = new ArrayList<>();
                firstChild = new ArrayList<>();
                secondChild = new ArrayList<>();
                newPaintings.clear();
                newPaintings2.clear();

                for (int i = 0; i < 100; i++) {
                    //System.out.println("i: " + i);  First generation with fitness applied
                    figures = oldGeneration.get(i);
                    oldGeneration.get(i).setGrade(generation.fitness(figures));
                }

                //New generation created 
                for (int i = 0; i < 100; i++) {
                    int newX1 = random.nextInt(400);
                    int newY1 = random.nextInt(350);
                    int newX2 = random.nextInt(400);
                    int newY2 = random.nextInt(350);
                    int newX3 = random.nextInt(400);
                    int newY3 = random.nextInt(350);
                    int newX4 = random.nextInt(400);
                    int newY4 = random.nextInt(350);

                    newPaintings.add(new Project(newX1, newY1, newX2, newY2, newX3, newY3, newX4, newY4));
                    newPaintings2.add(new Project(newX1, newY1, newX2, newY2, newX3, newY3, newX4, newY4));
                }

                generation.bubbleSort(oldGeneration);

                for (int i = 0; i < 100; i++) {
                    //System.out.println("i: " + i);
                    figures = oldGeneration.get(i);

                }

                for (int i = 0; i < 100; i++) {

                    firstParent.clear(); //kill the first parent
                    firstParent.add(generation.tournamentSelection(oldGeneration));

                    secondParent.clear(); //kill the second parent
                    secondParent.add(generation.tournamentSelection(oldGeneration));

                    figures = newPaintings.get(i); //save new generation
                    generation.crossover(firstParent, secondParent); //crossover over the new generation
                    generation.mutate(firstChild);
                    generation.mutate(secondChild); //aplied mutation on chlids

                }

                oldGeneration.clear(); //kill old generation
                oldGeneration.addAll(newPaintings); // add new generation

            }

            for (int i = 0; i < 100; i++) {

                //new generation, when we have all the child, have to pass the fitness and get a grade
                figures = oldGeneration.get(i);
                oldGeneration.get(i).setGrade(generation.fitness(figures));
            }
            generation.bubbleSort(oldGeneration);

            for (int i = 0; i < 100; i++) {
                //System.out.println("i: " + i);
                figures = oldGeneration.get(i);

                //oldGeneration.get(i).setGrade(generation.fitness(figures));
                //new generation after fitness and the grade they get
                System.out.println("Fractals: " + i);
                System.out.println("Grade: " + oldGeneration.get(i).getGrade());

            }
            System.out.print("\n");

            System.out.print("Best fractals" + "\n");
            for (int j = 0; j < 8 && j < oldGeneration.size(); j++) {
                best = oldGeneration.get(j);
                System.out.println("Fractal: " + j);
                System.out.println("Grade: " + best.getGrade());
                System.out.println();
            }

            //for graphics 
            fractals = new Fractals_shapes();

            int startIndex = Math.max(0, oldGeneration.size() - 8);

            for (int i = startIndex; i < oldGeneration.size(); i++) {
                Project fractal = oldGeneration.get(i);

                // Draw fractals and first iterations
                Graphics g = jPanel1.getGraphics();
                fractals.drawFractals(g, oldGeneration.get(0).getX1(), oldGeneration.get(0).getY1(), oldGeneration.get(0).getX2(), oldGeneration.get(0).getY2(), oldGeneration.get(0).getX3(), oldGeneration.get(0).getY3(), oldGeneration.get(0).getX4(), oldGeneration.get(0).getY4(), 4, Color.RED);

                Graphics g1 = jPanel2.getGraphics();
                fractals.drawFirstIteration(g1, oldGeneration.get(0).getX1(), oldGeneration.get(0).getY1(), oldGeneration.get(0).getX2(), oldGeneration.get(0).getY2(), oldGeneration.get(0).getX3(), oldGeneration.get(0).getY3(), oldGeneration.get(0).getX4(), oldGeneration.get(0).getY4(), 0.25, Color.BLACK);

            }
        }
    }//GEN-LAST:event_bestFractalsActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:

        if (jCheckBox1.isSelected()) {
            System.out.println("grade " + oldGeneration.get(0).getGrade());
            oldGeneration.get(0).setGrade(oldGeneration.get(0).getGrade() + 10);
            System.out.println("new grade " + oldGeneration.get(0).getGrade());
        } else {
            System.out.println("grade " + oldGeneration.get(0).getGrade());
            oldGeneration.get(0).setGrade(oldGeneration.get(0).getGrade() - 10);
            System.out.println("new grade " + oldGeneration.get(0).getGrade());
        }

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:

        if (jCheckBox2.isSelected()) {
            System.out.println("grade " + oldGeneration.get(1).getGrade());
            oldGeneration.get(1).setGrade(oldGeneration.get(1).getGrade() + 10);
            System.out.println("new garde " + oldGeneration.get(1).getGrade());
        } else {
            System.out.println("gardes" + oldGeneration.get(1).getGrade());
            oldGeneration.get(1).setGrade(oldGeneration.get(1).getGrade() - 10);
            System.out.println("new grade " + oldGeneration.get(1).getGrade());
        }

    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:

        if (jCheckBox3.isSelected()) {
            System.out.println("grade " + oldGeneration.get(2).getGrade());
            oldGeneration.get(2).setGrade(oldGeneration.get(2).getGrade() + 10);
            System.out.println("new garde " + oldGeneration.get(2).getGrade());
        } else {
            System.out.println("grade " + oldGeneration.get(2).getGrade());
            oldGeneration.get(2).setGrade(oldGeneration.get(2).getGrade() - 10);
            System.out.println("new grade " + oldGeneration.get(2).getGrade());
        }

    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:

        if (jCheckBox4.isSelected()) {
            System.out.println("grade " + oldGeneration.get(3).getGrade());
            oldGeneration.get(3).setGrade(oldGeneration.get(3).getGrade() + 10);
            System.out.println("new grade " + oldGeneration.get(3).getGrade());
        } else {
            System.out.println("grade " + oldGeneration.get(3).getGrade());
            oldGeneration.get(3).setGrade(oldGeneration.get(3).getGrade() - 10);
            System.out.println("new grade " + oldGeneration.get(3).getGrade());
        }

    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:

        if (jCheckBox5.isSelected()) {
            System.out.println("grade " + oldGeneration.get(4).getGrade());
            oldGeneration.get(4).setGrade(oldGeneration.get(4).getGrade() + 10);
            System.out.println("new grade " + oldGeneration.get(4).getGrade());
        } else {
            System.out.println("grade" + oldGeneration.get(4).getGrade());
            oldGeneration.get(4).setGrade(oldGeneration.get(4).getGrade() - 10);
            System.out.println("new grade " + oldGeneration.get(4).getGrade());
        }

    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:

        if (jCheckBox6.isSelected()) {
            System.out.println("grade " + oldGeneration.get(5).getGrade());
            oldGeneration.get(5).setGrade(oldGeneration.get(5).getGrade() + 10);
            System.out.println("new grade " + oldGeneration.get(5).getGrade());
        } else {
            System.out.println("grade" + oldGeneration.get(5).getGrade());
            oldGeneration.get(5).setGrade(oldGeneration.get(5).getGrade() - 10);
            System.out.println("new grade " + oldGeneration.get(5).getGrade());
        }

    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:

        if (jCheckBox7.isSelected()) {
            System.out.println("grade " + oldGeneration.get(6).getGrade());
            oldGeneration.get(6).setGrade(oldGeneration.get(6).getGrade() + 10);
            System.out.println("new grade " + oldGeneration.get(6).getGrade());
        } else {
            System.out.println("grade" + oldGeneration.get(6).getGrade());
            oldGeneration.get(6).setGrade(oldGeneration.get(6).getGrade() - 10);
            System.out.println("new grade " + oldGeneration.get(6).getGrade());
        }

    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:

        if (jCheckBox8.isSelected()) {
            System.out.println("grade " + oldGeneration.get(7).getGrade());
            oldGeneration.get(7).setGrade(oldGeneration.get(7).getGrade() + 10);
            System.out.println("new grade " + oldGeneration.get(7).getGrade());
        } else {
            System.out.println("grade" + oldGeneration.get(7).getGrade());
            oldGeneration.get(7).setGrade(oldGeneration.get(7).getGrade() - 10);
            System.out.println("new grade" + oldGeneration.get(7).getGrade());
        }

    }//GEN-LAST:event_jCheckBox8ActionPerformed

    public void displayFractal(int fractalIndex) {
        // Check if the fractal index is valid
        if (fractalIndex >= 0 && fractalIndex < oldGeneration.size()) {
            Project fractal = oldGeneration.get(fractalIndex);

            // Get the graphics objects for the panels
            Graphics g1 = jPanel1.getGraphics();
            Graphics g2 = jPanel2.getGraphics();

            // Draw fractals and first iterations
            fractals.drawFractals(g1, fractal.getX1(), fractal.getY1(), fractal.getX2(), fractal.getY2(), fractal.getX3(), fractal.getY3(), fractal.getX4(), fractal.getY4(), 4, Color.RED);
            fractals.drawFirstIteration(g2, fractal.getX1(), fractal.getY1(), fractal.getX2(), fractal.getY2(), fractal.getX3(), fractal.getY3(), fractal.getX4(), fractal.getY4(), 0.25, Color.BLACK);

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fractal_Canvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fractal_Canvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fractal_Canvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fractal_Canvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fractal_Canvas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bestFractals;
    private javax.swing.JButton fractal1;
    private javax.swing.JButton fractal2;
    private javax.swing.JButton fractal3;
    private javax.swing.JButton fractal4;
    private javax.swing.JButton fractal5;
    private javax.swing.JButton fractal6;
    private javax.swing.JButton fractal7;
    private javax.swing.JButton fractal8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton newPaintsButton;
    private javax.swing.JButton seeButton;
    // End of variables declaration//GEN-END:variables

}
