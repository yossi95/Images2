import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagesFrame {
    public void show() {

        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JFrame f = new JFrame();

        String path = "C:\\Users\\User\\Desktop\\myImage.jpg";
        File file = new File(path);

        try {
            BufferedImage image = ImageIO.read(file);
            JLabel imageLabel = new JLabel(new ImageIcon(image));
            panel.add(imageLabel);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(00000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        JButton button = new JButton("gray");
        button.setBounds(0, 0, 100, 40);
        frame.add(button);
        JComboBox cb = new JComboBox();
        button.setBounds(220, 230, 100, 40);
        frame.add(cb);

        JButton button2 = new JButton("color shift right");
        button2.setBounds(160, 360, 150, 140);
        frame.add(button2);
        JComboBox cb2 = new JComboBox();
        button2.setBounds(200, 280, 150, 40);
        frame.add(cb2);

        JButton button3 = new JButton("color shift left");
        button3.setBounds(160, 300, 100, 90);
        frame.add(button3);
        JComboBox cb3 = new JComboBox();
        button3.setBounds(200, 330, 150, 40);
        frame.add(cb3);

        JButton button4 = new JButton("show border");
        button4.setBounds(160, 300, 100, 90);
        frame.add(button4);
        JComboBox cb4 = new JComboBox();
        button4.setBounds(200, 370, 150, 40);
        frame.add(cb4);

        JButton button5 = new JButton("Eliminate Red/Green/Blue");
        button5.setBounds(160, 300, 100, 90);
        frame.add(button5);
        JComboBox cb5 = new JComboBox();
        button5.setBounds(200, 420, 150, 40);
        frame.add(cb5);

        frame.add(panel);
        frame.setSize(400, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }
}

