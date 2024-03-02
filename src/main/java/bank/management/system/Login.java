package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame{

    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 480;
    private static final int IMAGE_WIDTH = 100;
    private static final int IMAGE_HEIGHT = 100;
    private static final int TEXT_WIDTH = 400;
    private static final int TEXT_HEIGHT = 40;
    private static final int TEXT_FIELD_WIDTH = 150;
    private static final int TEXT_FIELD_HEIGHT = 30;
    private static final int FRAME_LOCATION_LEFT = 350;
    private static final int FRAME_LOCATION_TOP = 200;
    private static final int LABEL_IMAGE_LOCATION_LEFT = 70;
    private static final int LABEL_IMAGE_LOCATION_TOP = 10;
    private static final int LABEL_TEXT_LOCATION_LEFT = 200;
    private static final int LABEL_TEXT_LOCATION_TOP = 40;
    private static final int LABEL_TEXT_FONT_STYLE = Font.BOLD;
    private static final int LABEL_TEXT_FONT_SIZE = 38;
    private static final int LABEL_FIELD_FONT_STYLE = Font.BOLD;
    private static final int LABEL_FIELD_FONT_SIZE = 28;
    private static final int LABEL_FIELD_CARD_NO_LOCATION_LEFT = 120;
    private static final int LABEL_FIELD_PIN_LOCATION_LEFT = 120;
    private static final int LABEL_FIELD_CARD_NO_LOCATION_TOP = 150;
    private static final int LABEL_FIELD_PIN_LOCATION_TOP = 220;
    private static final int TEXT_FIELD_CARD_NO_LOCATION_LEFT = 300;
    private static final int TEXT_FIELD_CARD_NO_WIDTH = 250;
    private static final int TEXT_FIELD_CARD_NO_HEIGHT = 30;
    private static final int TEXT_FIELD_PIN_LOCATION_LEFT = 300;
    private static final int TEXT_FIELD_PIN_WIDTH = 250;
    private static final int TEXT_FIELD_PIN_HEIGHT = 30;

    private static final String FRAME_TITLE = "AUTOMATED TELLER MACHINE";
    private static final String LABEL_TEXT_FONT_NAME = "Osward";
    private static final String LABEL_FIELD_FONT_NAME = "Raleway";
    private static final String LABEL_TEXT = "Welcome to ATM";
    private static final String LABEL_FIELD_TEXT_CARD_NUMBER = "Card No:";
    private static final String LABEL_FIELD_TEXT_PIN = "PIN:"; 

    Login(){
        ImageIcon imageIcon = null; 
        Image image = null;
        JLabel labelImage, labelText, labelCardNo, labelPin = null;
        JTextField cardTextField, pinTextField = null;
        
        super.setLayout(null);
        
        imageIcon = new ImageIcon(ClassLoader.getSystemResource("src/main/icons/logo.jpg"));
        image = imageIcon.getImage().getScaledInstance(IMAGE_WIDTH, IMAGE_HEIGHT, Image.SCALE_DEFAULT);
        imageIcon = new ImageIcon(image);
        labelImage = new JLabel(imageIcon); 
        labelText = new JLabel(LABEL_TEXT);
        labelCardNo = new JLabel(LABEL_FIELD_TEXT_CARD_NUMBER);
        labelPin = new JLabel(LABEL_FIELD_TEXT_PIN);
        cardTextField = new JTextField();
        pinTextField = new JTextField();

        labelImage.setBounds(LABEL_IMAGE_LOCATION_LEFT, LABEL_IMAGE_LOCATION_TOP, IMAGE_WIDTH, IMAGE_HEIGHT);
        
        labelText.setBounds(LABEL_TEXT_LOCATION_LEFT, LABEL_TEXT_LOCATION_TOP, TEXT_WIDTH, TEXT_HEIGHT);
        labelText.setFont(new Font(LABEL_TEXT_FONT_NAME, LABEL_TEXT_FONT_STYLE, LABEL_TEXT_FONT_SIZE));

        labelCardNo.setBounds(LABEL_FIELD_CARD_NO_LOCATION_LEFT, LABEL_FIELD_CARD_NO_LOCATION_TOP, TEXT_FIELD_WIDTH, TEXT_FIELD_HEIGHT);
        labelCardNo.setFont(new Font(LABEL_FIELD_FONT_NAME, LABEL_FIELD_FONT_STYLE, LABEL_FIELD_FONT_SIZE));

        labelPin.setBounds(LABEL_FIELD_PIN_LOCATION_LEFT, LABEL_FIELD_PIN_LOCATION_TOP, TEXT_FIELD_WIDTH, TEXT_FIELD_HEIGHT);
        labelPin.setFont(new Font(LABEL_FIELD_FONT_NAME, LABEL_FIELD_FONT_STYLE, LABEL_FIELD_FONT_SIZE));

        cardTextField.setBounds(TEXT_FIELD_CARD_NO_LOCATION_LEFT, LABEL_FIELD_CARD_NO_LOCATION_TOP, TEXT_FIELD_CARD_NO_WIDTH, TEXT_FIELD_CARD_NO_HEIGHT);
        pinTextField.setBounds(TEXT_FIELD_PIN_LOCATION_LEFT, LABEL_FIELD_PIN_LOCATION_TOP, TEXT_FIELD_PIN_WIDTH, TEXT_FIELD_PIN_HEIGHT);

        super.add(labelImage);
        super.add(labelText);
        super.add(labelCardNo);
        super.add(labelPin);
        super.add(cardTextField);
        super.add(pinTextField);
        super.setTitle(FRAME_TITLE);
        super.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        super.setVisible(true);
        super.setLocation(FRAME_LOCATION_LEFT, FRAME_LOCATION_TOP);
        super.getContentPane().setBackground(Color.WHITE);
    }

    public static void main(String[] args){
        new Login();
        System.out.println("Hello World");
    }
}
