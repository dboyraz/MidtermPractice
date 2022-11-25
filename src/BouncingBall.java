import javax.swing.*;
import java.awt.*;

public class BouncingBall extends JPanel implements Runnable{

    private Thread t1;
    private int x, xDelta;

    public BouncingBall() {
        setLayout(new BorderLayout());
        setSize(500,500);

        x = 50;
        xDelta = 5;

        t1 = new Thread(this);
        t1.start();

        setVisible(true);
    }
    @Override
    public void paint(Graphics g){

        super.paint(g);

        g.setColor(Color.BLACK);
        g.fillOval(x,50,100,100);


    }




    @Override
    public void run() {

        while (true) {

            try {
                Thread.sleep(25);

                x += xDelta;
                if (x > 400) {
                    x = 400;
                    xDelta *= -1;

                } else if(x < 0) {
                    x = 0;
                    xDelta *= -1;
                }


                repaint();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void main(String[] args){

        JFrame frame = new JFrame("Bouncing Ball");
        BouncingBall bouncingBall = new BouncingBall();

        frame.add(bouncingBall);
        frame.setSize(bouncingBall.getSize());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);


    }
}
