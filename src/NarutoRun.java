/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PseudoArrancar
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NarutoRun {

    Thread oras;
    JFrame screenMo;
    JTextField pantextMo;
    JLabel larawan;
    ImageIcon movements;
    ImageIcon standR[] = new ImageIcon[2];
    ImageIcon standL[] = new ImageIcon[2];
    int standCtr;
    int standIndex;
    ImageIcon runR[] = new ImageIcon[8];
    ImageIcon runL[] = new ImageIcon[8];
    int runCtr;
    int runIndex;

    int aboutFace, move, jump;
    final int faceR = 0;
    final int faceL = 1;
    final int moveStand = 0;
    final int moveRun = 1;

    int x = 350;
    int y = 300;

    int xRun = 150;
    int yJump = 100;

    boolean start_na = true;

    public static void main(String[] args) {
        NarutoRun mark = new NarutoRun();
    }

    public NarutoRun() {

        screenMo = new JFrame("PseudoShriek");
        screenMo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screenMo.setLocationRelativeTo(null);
        oras = new Thread();
        larawan = new JLabel();
        Panel borderMo = new Panel();
        borderMo.setLayout(null);
        larawan.setBounds(xRun, yJump, xRun, yJump);
        borderMo.add(larawan);
        pantextMo = new JTextField();
        pantextMo.addKeyListener(new MultiKey());
        screenMo.add(pantextMo);
        screenMo.add(borderMo, BorderLayout.CENTER);
        screenMo.getContentPane().setBackground(Color.GREEN);
        screenMo.setSize(x, y);
        screenMo.setVisible(true);

        int i;
        for (i = 0; i < 2; i++) {
            standR[i] = new ImageIcon("C:\\Users\\HP-PC\\Desktop\\Desktop\\Downloads\\sreekaran.srinath drive\\xfgdh\\images\\stand\\r\\" + (i + 1) + ".png");
            standL[i] = new ImageIcon("C:\\Users\\HP-PC\\Desktop\\Desktop\\Downloads\\sreekaran.srinath drive\\xfgdh\\images\\stand\\l\\" + (i + 1) + ".png");
        }

        for (i = 0; i < 8; i++) {
            runR[i] = new ImageIcon("C:\\Users\\HP-PC\\Desktop\\Desktop\\Downloads\\sreekaran.srinath drive\\xfgdh\\images\\run\\r\\" + (i + 1) + ".png");
            runL[i] = new ImageIcon("C:\\Users\\HP-PC\\Desktop\\Desktop\\Downloads\\sreekaran.srinath drive\\xfgdh\\images\\run\\l\\" + (i + 1) + ".png");

        }

        do {
            framesPerSecond();
        } while (start_na);

    }

    public void framesPerSecond() {
        if (move == moveStand) {
            standCtr += 1;
            if (standCtr >= 60) {
                standCtr = 0;
            }
            if (standCtr < 30) {
                standIndex = 0;
            } else if (standCtr < 60) {
                standIndex = 1;
            }
            if (aboutFace == faceR) {
                movements = standR[standIndex];
            } else {
                movements = standL[standIndex];
            }
        } else if (move == moveRun) {
            runCtr += 1;
            if (runCtr >= 60) {
                runCtr = 0;
            }
            if (runCtr < 7) {
                runIndex = 0;
            } else if (runCtr < 14) {
                runIndex = 1;
            } else if (runCtr < 21) {
                runIndex = 2;
            } else if (runCtr < 28) {
                runIndex = 3;
            } else if (runCtr < 35) {
                runIndex = 4;
            } else if (runCtr < 42) {
                runIndex = 5;
            } else if (runCtr < 50) {
                runIndex = 6;
            } else if (runCtr < 60) {
                runIndex = 7;
            }

            if (aboutFace == faceR) {
                movements = runR[runIndex];
                xRun += 2;
                if (xRun > 250) {
                    xRun = 250;
                }
            } else {
                movements = runL[runIndex];
                xRun -= 2;
                if (xRun < 0) {
                    xRun = 0;
                }
            }

        }

        standCtr += 1;
        larawan.setLocation(xRun, yJump);
        larawan.setIcon(movements);

        try {
            oras.sleep(10);
        } catch (InterruptedException ex) {
        }
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void requestFocus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    class MultiKey extends KeyAdapter {

        public void keyPressed(KeyEvent pindut) {
            int keys = pindut.getKeyCode();
            char aggrssive = pindut.getKeyChar();
            if (keys == KeyEvent.VK_RIGHT) {
                move = moveRun;
                aboutFace = faceR;
            } else if (keys == KeyEvent.VK_LEFT) {
                move = moveRun;
                aboutFace = faceL;
            }
        }

        public void keyReleased(KeyEvent release) {
            int keys = release.getKeyCode();
            if (keys == KeyEvent.VK_RIGHT) {
                move = moveStand;
            } else if (keys == KeyEvent.VK_LEFT) {
                move = moveStand;
            }

        }

    }

}
