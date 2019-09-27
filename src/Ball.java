/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PseudoShriek
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class Ball {
    private int x = Pong.WINDOW_WIDTH / 2;
    private int y = Pong.WINDOW_HEIGHT / 2;
    private int xVelocity = -7;
    private int yVelocity = 7;
    private int size = 10;
    private int playerScore = 0;
    public int computerScore = 0;
    

    public void update() {
        x = x + xVelocity;
        y = y + yVelocity;

        if (x < 0) {
            xVelocity = 7 ;
            computerScore = computerScore + 1;
        } else if (x + size > Pong.WINDOW_WIDTH - 6) {
            xVelocity = -7;
            playerScore = playerScore + 1;
        }

        if (y < 0) {
            yVelocity = 7;
        } else if (y + size > Pong.WINDOW_HEIGHT - 28) {
            yVelocity = -7;
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.fillOval(x, y, size, size);
        g.drawString(toPlayer(), 5, 15);
        g.drawString(toComputer(), 280, 15);
    }

    private void reverseDirection() {
        xVelocity = -xVelocity;
    }

    private void reverseDirectionY() {
        yVelocity = -yVelocity;
    }

    public void checkCollisionWith(Player player) {
        if (this.x > player.getX() && this.x < player.getX() + player.getWidth()) {
            if (this.y > player.getY() && this.y < player.getY() + player.getHeight()) {
                //ball has collided with player
                reverseDirection();
            }
        }
    }

    public void hitWall() {
        if (this.y < 30) {
            reverseDirectionY();
        }
    }

    public void checkCollisionWith(Computer computer) {
        if (this.x > computer.getX() && this.x < computer.getX() + computer.getWidth()) {
            if (this.y > computer.getY() && this.y < computer.getY() + computer.getHeight()) {
                //ball has collided with computer
                reverseDirection();
            }
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public String toPlayer() {
        String retVal = "";
        retVal = "Player Score: " + playerScore;
        return retVal;
    }

    public String toComputer() {
        String retVal = "";
        retVal = "Computer Score: " + computerScore;
        return retVal;
    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
