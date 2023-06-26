package Gui_Image_App;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Button;

public class Main extends JFrame {
    private JFrame frame;
    private JLabel imageLabel;
    private int currentImageIndex = 0;
    private int totalImage;

    public Main() {
        frame = new JFrame("Gallery_Dummy");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(450, 700);

        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        frame.getContentPane().add(panel);

        String imagePath = "images/";
        File directory = new File(imagePath);
        File[] imageFiles = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(".jpeg"));

        if (imageFiles != null) {
            totalImage = imageFiles.length;
        } else {
            totalImage = 0;
        }

        imageLabel = new JLabel();
        displayImage();

        Button nextButton = new Button("Next");
        nextButton.setBounds(316, 579, 80, 30);
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                currentImageIndex++;
                if (currentImageIndex >= totalImage) {
                    currentImageIndex = 0;
                }
                displayImage();
            }
        });

        Button prevButton = new Button("Previous");
        prevButton.setBounds(61, 579, 80, 30);
        prevButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                currentImageIndex--;
                if (currentImageIndex < 0) {
                    currentImageIndex = totalImage - 1;
                }
                displayImage();
            }
        });

        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(nextButton);
        frame.getContentPane().add(prevButton);
        frame.setVisible(true);
    }

    private void displayImage() {
        String imagePath = "images/image" + (currentImageIndex + 1) + ".jpeg";
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(image));
        imageLabel.setBounds(10, 10, 518, 500);
        frame.getContentPane().add(imageLabel);
        frame.repaint();
    }




    public static void main(String[] args) {
        new Main();
    }
}
