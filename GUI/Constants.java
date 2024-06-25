package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;

public class Constants {
    public class CalculatorWindow{
        public static final int CALCULATOR_WINDOW_WIDTH = 500;
        public static final int CALCULATOR_WINDOW_HEIGHT = 700;
        public static final String CALCULATOR_WINDOW_TITLE = "CalcGUI";
        public static final ImageIcon CALCULATOR_WINDOW_ICON = new ImageIcon("GUI/Resources/icon.png");
    }
    
    public class CalculatorButton{
        public static final int BUTTON_WIDTH = 50;
        public static final int BUTTON_HEIGHT = 50;
        public static final int BUTTON_GAP = 10;
        public static final Color BUTTON_BG_COLOR = Color.BLACK;
        public static final Color BUTTON_FG_COLOR = Color.WHITE;
        public static final Font BUTTON_FONT = new Font("Arial", Font.BOLD, 12);
    }

    public class CalculatorPanel{
        public static final Color PANEL_BG_COLOR = Color.WHITE;
    }

    public class CalculatorTextField{
        public static final int TEXTFIELD_WIDTH = 400;
        public static final int TEXTFIELD_HEIGHT = 100;
        public static final Color TEXTFIELD_BG_COLOR = Color.WHITE;
        public static final Color TEXTFIELD_FG_COLOR = Color.BLACK;
        public static final Font TEXTFIELD_FONT = new Font("Arial", Font.BOLD, 20);
    }
    
}
