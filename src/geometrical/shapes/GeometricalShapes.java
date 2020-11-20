/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrical.shapes;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author bensu erdogan
 */
interface Variable {

    Random r = new Random();
    public int x = r.nextInt((600 - 300) + 1) + 300;
    public int y = r.nextInt((600 - 300) + 1) + 300;

}

class Surface extends JPanel implements Variable {

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        int width;
        int height;
        int shapex;
        int shapey;
        if (x >300 && x < 400) {
            for (int i = 0; i < 30; i++) {
                width = r.nextInt((100 - 50) + 1) + 50;
                height = r.nextInt((100 - 50) + 1) + 50;
                shapex = r.nextInt((300) + 1) + 20;
                shapey = r.nextInt((300) + 1) + 20;
                g2d.setPaint(new Color(Math.abs(r.nextInt()) % 255, Math.abs(r.nextInt()) % 255, Math.abs(r.nextInt()) % 255));
                g2d.fillOval(shapex, shapey, width, height);
                g2d.drawOval(shapex + 50, shapey + 50, width, height);

            }
        } else if (x > 400 && x < 500) {
            for (int i = 0; i < 30; i++) {
                width = r.nextInt((100 - 50) + 1) + 50;
                height = r.nextInt((100 - 50) + 1) + 50;
                shapex = r.nextInt((300) + 1) + 20;
                shapey = r.nextInt((300) + 1) + 20;
                g2d.setPaint(new Color(Math.abs(r.nextInt()) % 255, Math.abs(r.nextInt()) % 255, Math.abs(r.nextInt()) % 255));
                g2d.fillRect(shapex, shapey, width, height);
                g2d.drawRect(shapex + 50, shapey + 50, width, height);

            }
        } else if (x > 500 && x <= 600) {
            for (int i = 0; i < 30; i++) {
                width = r.nextInt((100 - 50) + 1) + 50;
                height = r.nextInt((100 - 50) + 1) + 50;
                shapex = r.nextInt((300) + 1) + 20;
                shapey = r.nextInt((300) + 1) + 20;
                g2d.setPaint(new Color(Math.abs(r.nextInt()) % 255, Math.abs(r.nextInt()) % 255, Math.abs(r.nextInt()) % 255));
                g2d.fillArc(shapex, shapey, width, height, shapex, shapey);
                g2d.drawArc(shapex + 50, shapey + 50, width, height, shapex+50, shapey+50);

            }
        }

        System.out.println(x);
        System.out.println(y);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);

    }
}

public class GeometricalShapes extends JFrame implements Variable {

    public GeometricalShapes() {
        initUI();
    }

    private void initUI() {

        Surface surface = new Surface();
        add(surface);

        setTitle("Geometrical Shapes");
        setSize(x, y);
        //  setResizable(false); //Sayfanın yeniden boyutlandırılmamasını sağlıyor
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                GeometricalShapes gs = new GeometricalShapes();
                gs.setVisible(true);
            }

        });

    }
}
