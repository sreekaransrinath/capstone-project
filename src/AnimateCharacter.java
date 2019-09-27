/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PseudoArrancar
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.BorderLayout;

public class AnimateCharacter extends JFrame {

    private static final long serialVersionUID = 1L;

    JLabel ImageHolder = new JLabel();
    JPanel BackgroundPanel = new JPanel();
    ImageIcon imgLuffyLeft[] = new ImageIcon[2];
    ImageIcon imgLuffy;

    int iLuffyStandCounter;
    int iLuffyStandIndex;

    final int iScreenHeight = 300;
    final int iScreenWidth = 350;
    final int iImageWidth = 75;
    final int iImageHeight = 100;

    int iHorizontalX = 130;
    int iVerticalY = 100;

    boolean bAnimationStart = true;

    public AnimateCharacter() {

        CHARACTER_ANIMATION();
        System.exit(0);
    }

    public void SETUP_THE_WORLD_AND_INITIALIZE() {

        ImageHolder.setBounds(iImageWidth, iImageHeight, iImageWidth, iImageHeight);
        add(ImageHolder);
        BackgroundPanel.setBackground(Color.GRAY);
        add(BackgroundPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(iScreenWidth, iScreenHeight);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        for (int i = 0; i < 2; i++) {
            imgLuffyLeft[i] = new ImageIcon(getClass().getResource("C:\\Users\\HP-PC\\Desktop\\Desktop\\Downloads\\sreekaran.srinath drive\\podadei\\images\\luffy\\stand\\l\\" + (i + 1) + ".png"));
        }

    }

    public void CHARACTER_ANIMATION() {

        final int FramePerSecond = 10;

        SETUP_THE_WORLD_AND_INITIALIZE();

        do {
            DRAW_CHARACTER_IMAGE();
            try {
                Thread.sleep(FramePerSecond);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        } while (bAnimationStart);
    }

    public void DRAW_CHARACTER_IMAGE() {

        iLuffyStandCounter += 1;

        if (iLuffyStandCounter > 60) {
            iLuffyStandCounter = 0;
        } else if (iLuffyStandCounter < 30) {
            iLuffyStandIndex = 0;
        } else if (iLuffyStandCounter < 60) {
            iLuffyStandIndex = 1;
        } else {
            iLuffyStandCounter = 0;
        }

        iLuffyStandCounter += 1;

        imgLuffy = imgLuffyLeft[iLuffyStandIndex];
        ImageHolder.setIcon(imgLuffy);
        ImageHolder.setLocation(iHorizontalX, iVerticalY);

    }

    public static void main(String args[]) {
        new AnimateCharacter();
    }

}
