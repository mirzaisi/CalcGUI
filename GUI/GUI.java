package GUI;

import SimpleCalculator.SimpleCalculatorPanel;

public class GUI {

    public GUI() {
        createGUI();
    }

    private void createGUI() {
  
        CalculatorWindow calculatorWindow = createCalculatorWindow();
        CalculatorPanel simpleCalculatorPanel = createSimpleCalculatorPanel();

        calculatorWindow.add(simpleCalculatorPanel);
        calculatorWindow.setVisible(true);
        
    }

    private CalculatorWindow createCalculatorWindow() {
        return new CalculatorWindow(
        Constants.CalculatorWindow.CALCULATOR_WINDOW_WIDTH, 
        Constants.CalculatorWindow.CALCULATOR_WINDOW_HEIGHT, 
        Constants.CalculatorWindow.CALCULATOR_WINDOW_TITLE, 
        Constants.CalculatorWindow.CALCULATOR_WINDOW_ICON); 


    }

    private CalculatorPanel createSimpleCalculatorPanel() {
        return new SimpleCalculatorPanel(
        Constants.CalculatorWindow.CALCULATOR_WINDOW_WIDTH, 
        Constants.CalculatorWindow.CALCULATOR_WINDOW_HEIGHT, 
        Constants.CalculatorPanel.PANEL_BG_COLOR);
    }
}
