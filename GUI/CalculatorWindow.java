package GUI;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CalculatorWindow extends JFrame{
    private int width;
    private int height;
    private String title;
    private ImageIcon icon;
    private Color bgColor;


    public CalculatorWindow(int width, int height, String title, ImageIcon icon, Color bgColor){
        this.width = width;
        this.height = height;
        this.title = title;
        this.icon = icon;
        this.bgColor = bgColor;
        createWindow();
    }

    public void createWindow(){
        this.setSize(new Dimension(width, height));
        this.setBackground(bgColor);
        this.setTitle(title);
        this.setIconImage(icon.getImage());

        this.setResizable(false);
        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
