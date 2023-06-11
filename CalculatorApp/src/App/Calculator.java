package App;

import javax.swing.*;

public class Calculator {

    private static String[] Option = {Constants.Msgs[0]};
    private static String[] messages = {Constants.Msgs[1],Constants.Msgs[2]};

    public static void main(String[]args) {

        int Response = JOptionPane.showOptionDialog(null, messages[0], "Developer", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, null, Option , 0);

        if(Response == 0) {

           Response = JOptionPane.showOptionDialog(null, messages[1], "Developer", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, Option , 0);

           if(Response == 0) {

              new GUI();

            }

        }
        
    }

}
