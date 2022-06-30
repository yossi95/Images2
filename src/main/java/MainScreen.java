import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

public class MainScreen {
    public static final int WINDOW_WIDTH = 400;
    public static final int WINDOW_HEIGHT = 500;
    static Images nh = new Images();

    public static void main(String[] args) {
        JFrame f = new JFrame();
        JLabel text = new JLabel("password");
        text.setBounds(150, 160, 120, 40);
        f.add(text);

        JTextField textFieldMessage = new JTextField();
        textFieldMessage.setBounds(130, 200, 100, 30);
        f.add(textFieldMessage);

        JLabel jl = new JLabel("insert user name");
        jl.setBounds(120, 80, 120, 40);
        f.add(jl);

        JTextField textField = new JTextField();
        textField.setBounds(130, 130, 100, 30);
        f.add(textField);

        JLabel errol = new JLabel("");
        errol.setForeground(Color.red);
        errol.setBounds(120, 40, 120, 40);
        f.add(errol);

        JButton button = new JButton("button");
        button.setBounds(0, 0, 100, 40);
        f.add(button);
        button.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent e) {
                if (!isValid(textField.getText())) {
                    errol.setText("invalid phone");
                    return;
                }
                if (textFieldMessage.getText().equals("")) {
                    errol.setText("message is empty");
                    return;
                }
                nh.setPassword(textFieldMessage.getText());
                errol.setText("");
                nh.finder("" + textField.getText().substring(1));
            }

        });
//main window//
        //0544987232
        //0c72741b
        JComboBox cb = new JComboBox();
        button.setBounds(130, 260, 100, 40);
        f.add(cb);
        f.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setResizable(false);

//window for the image//
        try {
            Thread.sleep(1000);
            ImagesFrame ff = new ImagesFrame();
            ff.show();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        JPanel panel = new JPanel();
//        panel.setLayout(new FlowLayout());
//        try {
//            Thread.sleep(60000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        m.add(panel);
//        String b = nh.getBaseurl();
//        m.add(w);
//        m.setLayout(null);
//        m.setBounds(130, 260, 100, 40);
//        m.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
//        //read the image
//        String path="C:\\Users\\User\\Desktop\\myImage.jpg";
//        File file=new File(path);
//
//        try {
//            BufferedImage image= ImageIO.read(file);
//            JLabel imageLabel=new JLabel(new ImageIcon(image));
//            m.getContentPane().add(imageLabel);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        panel.add(new JLabel("gggggggggggggggggggg"));
//      //  m.setLayout(null);
//        m.setVisible(true);
//        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       // m.setLocationRelativeTo(null);
//        //m.setResizable(false);
//    }

    }
    private static boolean isValid(String tel) {
        return Pattern.compile("^05\\d{8}$").matcher(tel).find();
    }
}



