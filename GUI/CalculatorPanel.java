package GUI;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class CalculatorPanel extends JPanel{
    private int width;
    private int height;
    private Color bgColor;

    public CalculatorPanel(int width, int height, Color bgColor){
        this.width = width;
        this.height = height;
        this.bgColor = bgColor;
        createPanel();
    }

    public void createPanel(){
        this.setSize(new Dimension(width, height));
        this.setBackground(bgColor);
    }
}
