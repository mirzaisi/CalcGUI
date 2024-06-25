
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
        CalculatorWindow calculatorWindow = new CalculatorWindow(
        Constants.CALCULATOR_WINDOW_WIDTH, 
        Constants.CALCULATOR_WINDOW_HEIGHT, 
        Constants.CALCULATOR_WINDOW_TITLE, 
        Constants.CALCULATOR_ICON_IMAGE, 
        Constants.CALCULATOR_WINDOW_BG_COLOR);




        


        calculatorWindow.setVisible(true);
    }

    
}
