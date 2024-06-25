
import GUI.CalculatorWindow;
import GUI.Constants;

/**
*@author mirzaisi
*@version 1.0
*@app CalcGUI
*
*An ordinary calculator app with GUI and scientific calculation support 
**/


public class Main {
    public static void main(String[] args) {
        CalculatorWindow calculatorWindow = new CalculatorWindow(Constants.CalculatorWindow.CALCULATOR_WINDOW_WIDTH, 
        Constants.CalculatorWindow.CALCULATOR_WINDOW_HEIGHT, 
        Constants.CalculatorWindow.CALCULATOR_WINDOW_TITLE, 
        Constants.CalculatorWindow.CALCULATOR_WINDOW_ICON);   



        

        calculatorWindow.setVisible(true);
    }

    
}
