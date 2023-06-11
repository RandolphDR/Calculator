package App;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Dimension;

public class Constants {

    // Default Fonts

    final static Font NavigationButtonFont = new Font("Consolas", Font.BOLD, 12);
    final static Font Dark_LightButtonFont = new Font("Consolas", Font.BOLD, 12);

    // Screen Border

    final static Border ScreenBorder = BorderFactory.createEtchedBorder();
    // Keyboard Button and Screen Fonts

    final static Font AnswerScreenFont = new Font("Arial", Font.PLAIN, 85);
    final static Font InputScreenFont = new Font("Arial", Font.PLAIN, 40);
    final static Font KeyboardFont = new Font("Arial", Font.PLAIN, 20);

    // Default Dimensions

    final static Dimension Dark_LightDimension = new Dimension(30, 30);

    // Fonts
    final static Font Calibri = new Font("Calibri", Font.BOLD, 18);

    // Component Displayed
    final static String LightText = "LightMode";
    final static String DarkText = "NightMode";
    final static String AppName = "Calculator";
    final static String ExitText = "×";

    // Keyboard Texts
    final static String ClearText = "AC";
    final static String DeleteText = "Del";
    final static String ModuloText = "%";
    final static String DivisionText = "÷"; 

    final static String Num7Text = "7";
    final static String Num8Text = "8";
    final static String Num9Text = "9";
    final static String MultiplyText = "×";
    
    final static String Num4Text = "4";
    final static String Num5Text = "5";
    final static String Num6Text = "6";
    final static String SubtractText = "-";

    final static String Num1Text = "1";
    final static String Num2Text = "2";
    final static String Num3Text = "3";
    final static String AddText = "+";
    
    final static String Num0Text = "0";
    final static String ButtonPointText = ".";
    final static String EqualText = "=";

    // Default Theme Color

    static Color ThemeColor = Colors.DarkMode;
    

    // Keyboard Border

    static Border KeyboardBorder = BorderFactory.createRaisedBevelBorder();


    // Default App Size
    final static int[] FrameSize = {475, 700};

    // Default Mesasges

    public final static String[] Msgs = {"OKAY", 
                                         "   Welcome to my Simple Whole Number Calculator GUI", 
                                         "If you find any bugs feel free to contact me! \n                 Github: @ArtuDR"};
                                         
}