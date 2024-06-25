package GUI;

import SimpleCalculator.SimpleCalculatorPanel;

public class GUI {

    public GUI() {
        create();
    }

    public void create() {
        CalculatorWindow calculatorWindow = new CalculatorWindow(
        Constants.CalculatorWindow.CALCULATOR_WINDOW_WIDTH, 
        Constants.CalculatorWindow.CALCULATOR_WINDOW_HEIGHT, 
        Constants.CalculatorWindow.CALCULATOR_WINDOW_TITLE, 
        Constants.CalculatorWindow.CALCULATOR_WINDOW_ICON);   


        SimpleCalculatorPanel simpleCalculatorPanel = new SimpleCalculatorPanel(
        Constants.CalculatorWindow.CALCULATOR_WINDOW_WIDTH,
        Constants.CalculatorWindow.CALCULATOR_WINDOW_HEIGHT, 
        Constants.CalculatorPanel.PANEL_BG_COLOR);
        calculatorWindow.add(simpleCalculatorPanel);

        
        calculatorWindow.setVisible(true);
    }
}
