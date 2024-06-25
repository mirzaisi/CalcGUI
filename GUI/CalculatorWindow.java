package GUI;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CalculatorWindow extends JFrame{
    private int width;
    private int height;
    private String title;
    private ImageIcon icon;


    public CalculatorWindow(int width, int height, String title, ImageIcon icon){
        this.width = width;
        this.height = height;
        this.title = title;
        this.icon = icon;
        createWindow();
    }

    public void createWindow(){
        this.setSize(new Dimension(width, height));
        this.setTitle(title);
        this.setIconImage(icon.getImage());

        this.setResizable(false);
        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
