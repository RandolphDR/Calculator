package App;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;

public class GUI extends Constants {
   
    protected static JButton Lightmode, Darkmode;
    protected static JButton Button0, ButtonPoint, Equal;
    protected static JButton ClearButton, DeleteButton;
    protected static JButton Modulo, Division, Multiply, Subtract, Add;
    protected static JButton Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9;
    protected static JPanel ButtonPanel;

    protected static JTextField AnswerScreen, InputScreen;
    protected static JPanel ThemePanel, CalculatorScreen, CenterPanel, SouthPanel;
    protected static JButton ExitButton;
    protected static JPanel AppPanel, NavigationBar;
    protected static JLabel AppTitle;
    protected static JFrame Calculator;

    private static int num1 = 0, num2 = 0, result = 0;
    private static char operator;

    GUI() {

        Frame();

    }

    private void NavigationPanel() {

        AppTitle = new JLabel();
        AppTitle.setText(AppName);
        AppTitle.setFont(Calibri);
        AppTitle.setForeground(Colors.LightGray);
        AppTitle.setBounds(200,3,100,30);

        ExitButton = new JButton();
        ExitButton.setText(ExitText);
        ExitButton.setFont(NavigationButtonFont);
		ExitButton.setBackground(null);
        ExitButton.setForeground(Colors.LightSeaGreen);
		ExitButton.setBorder(null);
		ExitButton.setFocusable(false);
        ExitButton.setBounds(442,1,30, 30);
		ExitButton.addActionListener(function);

        NavigationBar = new JPanel();
        NavigationBar.setBackground(Colors.ApproxRegalBlue);
        NavigationBar.setBounds(0,0, FrameSize[0], 30);
        NavigationBar.setLayout(null);

        Theme();

        NavigationBar.add(ThemePanel);
        NavigationBar.add(AppTitle);
        NavigationBar.add(ExitButton);

    }
    
    private void Theme() {

        Darkmode = new JButton();
        Darkmode = new JButton();
        Darkmode.setText(DarkText);
        Darkmode.setForeground(Colors.LightGray);
        Darkmode.setFont(Dark_LightButtonFont);
        Darkmode.setBackground(Colors.ApproxRegalBlue);
        Darkmode.setPreferredSize(Dark_LightDimension);
        Darkmode.setFocusable(false);
        Darkmode.addActionListener(function);
        Darkmode.setVisible(true);
        Darkmode.setOpaque(true);
        Darkmode.setBorder(null);

        Lightmode = new JButton();
        Lightmode.setText(LightText);
        Lightmode.setForeground(Colors.LightGray);
        Lightmode.setFont(Dark_LightButtonFont);
        Lightmode.setBackground(Colors.ApproxRegalBlue);
        Lightmode.setPreferredSize(Dark_LightDimension);
        Lightmode.setFocusable(false); 
        Lightmode.addActionListener(function);
        Lightmode.setVisible(false);
        Lightmode.setOpaque(true);
        Lightmode.setBorder(null);

        ThemePanel = new JPanel();
        ThemePanel.setBackground(Colors.ApproxRegalBlue);
        ThemePanel.setLayout(new BorderLayout());
        ThemePanel.setBounds(3,8, 75,20);
        
        ThemePanel.add(Darkmode, BorderLayout.CENTER);

    }

    private void Screen() {
        
        AnswerScreen = new JTextField();
        AnswerScreen.setText(null);
        AnswerScreen.setBackground(ThemeColor);
        AnswerScreen.setHorizontalAlignment(JTextField.TRAILING);
        AnswerScreen.setFont(AnswerScreenFont);
        AnswerScreen.setBorder(null);
        AnswerScreen.setEnabled(false);
        AnswerScreen.setDisabledTextColor(Color.white);
        AnswerScreen.setVisible(false);
        AnswerScreen.setBounds(5,65, 450, 110);

        InputScreen = new JTextField();
        InputScreen.setText(null);
        InputScreen.setForeground(Colors.Teal);
        InputScreen.setBackground(ThemeColor);
        InputScreen.setHorizontalAlignment(JTextField.TRAILING);
        InputScreen.setFont(InputScreenFont);
        InputScreen.setBorder(ScreenBorder);
        InputScreen.setEnabled(false);
        InputScreen.setDisabledTextColor(Colors.Teal);
        InputScreen.setBounds(5,185, 450, 60);

        CalculatorScreen = new JPanel();
        CalculatorScreen.setBackground(ThemeColor);
        CalculatorScreen.setPreferredSize(new Dimension(0,250));
        CalculatorScreen.setLayout(null);

        NavigationPanel();

        CalculatorScreen.add(NavigationBar);
        CalculatorScreen.add(AnswerScreen);
        CalculatorScreen.add(InputScreen);

    }

    private void Buttons() {

        ClearButton = new JButton();
        ClearButton.setText(ClearText);
        ClearButton.setFont(KeyboardFont);
        ClearButton.setForeground(Colors.Olive);
        ClearButton.setBackground(ThemeColor);
        ClearButton.setFocusable(false);
        ClearButton.setBorder(KeyboardBorder);
        ClearButton.addActionListener(function);

        DeleteButton = new JButton();
        DeleteButton.setText(DeleteText);
        DeleteButton.setFont(KeyboardFont);
        DeleteButton.setForeground(Colors.Olive);
        DeleteButton.setBackground(ThemeColor);
        DeleteButton.setFocusable(false);
        DeleteButton.setBorder(KeyboardBorder);
        DeleteButton.addActionListener(function);

        Modulo = new JButton();
        Modulo.setText(ModuloText);
        Modulo.setFont(KeyboardFont);
        Modulo.setForeground(Colors.Olive);
        Modulo.setBackground(ThemeColor);
        Modulo.setFocusable(false);
        Modulo.setBorder(KeyboardBorder);
        Modulo.addActionListener(function);

        Division = new JButton();
        Division.setText(DivisionText);
        Division.setFont(KeyboardFont);
        Division.setForeground(Colors.Olive);
        Division.setBackground(ThemeColor);
        Division.setFocusable(false);
        Division.setBorder(KeyboardBorder);
        Division.addActionListener(function);

        Button7 = new JButton();
        Button7.setText(Num7Text);
        Button7.setFont(KeyboardFont);
        Button7.setForeground(Colors.Teal);
        Button7.setBackground(ThemeColor);
        Button7.setFocusable(false);
        Button7.setBorder(KeyboardBorder);
        Button7.addActionListener(function);

        Button8 = new JButton();
        Button8.setText(Num8Text);
        Button8.setFont(KeyboardFont);
        Button8.setForeground(Colors.Teal);
        Button8.setBackground(ThemeColor);
        Button8.setFocusable(false);
        Button8.setBorder(KeyboardBorder);
        Button8.addActionListener(function);

        Button9 = new JButton();
        Button9.setText(Num9Text);
        Button9.setFont(KeyboardFont);
        Button9.setForeground(Colors.Teal);
        Button9.setBackground(ThemeColor);
        Button9.setFocusable(false);
        Button9.setBorder(KeyboardBorder);
        Button9.addActionListener(function);

        Multiply = new JButton();
        Multiply.setText(MultiplyText);
        Multiply.setFont(KeyboardFont);
        Multiply.setForeground(Colors.Olive);
        Multiply.setBackground(ThemeColor);
        Multiply.setFocusable(false);
        Multiply.setBorder(KeyboardBorder);
        Multiply.addActionListener(function);

        Button4 = new JButton();
        Button4.setText(Num4Text);
        Button4.setFont(KeyboardFont);
        Button4.setForeground(Colors.Teal);
        Button4.setBackground(ThemeColor);
        Button4.setFocusable(false);
        Button4.setBorder(KeyboardBorder);
        Button4.addActionListener(function);

        Button5 = new JButton();
        Button5.setText(Num5Text);
        Button5.setFont(KeyboardFont);
        Button5.setForeground(Colors.Teal);
        Button5.setBackground(ThemeColor);
        Button5.setFocusable(false);
        Button5.setBorder(KeyboardBorder);
        Button5.addActionListener(function);

        Button6 = new JButton();
        Button6.setText(Num6Text);
        Button6.setFont(KeyboardFont);
        Button6.setForeground(Colors.Teal);
        Button6.setBackground(ThemeColor);
        Button6.setFocusable(false);
        Button6.setBorder(KeyboardBorder);
        Button6.addActionListener(function);

        Subtract = new JButton();
        Subtract.setText(SubtractText);
        Subtract.setFont(KeyboardFont);
        Subtract.setForeground(Colors.Olive);
        Subtract.setBackground(ThemeColor);
        Subtract.setFocusable(false);
        Subtract.setBorder(KeyboardBorder);
        Subtract.addActionListener(function);

        Button1 = new JButton();
        Button1.setText(Num1Text);
        Button1.setFont(KeyboardFont);
        Button1.setForeground(Colors.Teal);
        Button1.setBackground(ThemeColor);
        Button1.setFocusable(false);
        Button1.setBorder(KeyboardBorder);
        Button1.addActionListener(function);

        Button2 = new JButton();
        Button2.setText(Num2Text);
        Button2.setFont(KeyboardFont);
        Button2.setForeground(Colors.Teal);
        Button2.setBackground(ThemeColor);
        Button2.setFocusable(false);
        Button2.setBorder(KeyboardBorder);
        Button2.addActionListener(function);

        Button3 = new JButton();
        Button3.setText(Num3Text);
        Button3.setFont(KeyboardFont);
        Button3.setForeground(Colors.Teal);
        Button3.setBackground(ThemeColor);
        Button3.setFocusable(false);
        Button3.setBorder(KeyboardBorder);
        Button3.addActionListener(function);

        Add = new JButton();
        Add.setText(AddText);
        Add.setFont(KeyboardFont);
        Add.setForeground(Colors.Olive);
        Add.setBackground(ThemeColor);
        Add.setFocusable(false);
        Add.setBorder(KeyboardBorder);
        Add.addActionListener(function);

        Button0 = new JButton();
        Button0.setText(Num0Text);
        Button0.setFont(KeyboardFont);
        Button0.setForeground(Colors.Teal);
        Button0.setBackground(ThemeColor);
        Button0.setFocusable(false);
        Button0.setBorder(KeyboardBorder);
        Button0.addActionListener(function);

        ButtonPoint = new JButton();
        ButtonPoint.setText(ButtonPointText);
        ButtonPoint.setFont(KeyboardFont);
        ButtonPoint.setForeground(Colors.Teal);
        ButtonPoint.setBackground(ThemeColor);
        ButtonPoint.setFocusable(false);
        ButtonPoint.setBorder(KeyboardBorder);
        ButtonPoint.addActionListener(function);

        Equal = new JButton();
        Equal.setText(EqualText);
        Equal.setFont(KeyboardFont);
        Equal.setForeground(Color.white);
        Equal.setBackground(Colors.Olive);
        Equal.setFocusable(false);
        Equal.setBorder(KeyboardBorder);
        Equal.addActionListener(function);
        Equal.setBounds(253,320,207,59);
        
        ButtonPanel = new JPanel();
        ButtonPanel.setBackground(ThemeColor);
        ButtonPanel.setLayout(new GridLayout(5, 4, 35, 20));
        ButtonPanel.setBounds(10,0, 450, 380);

        ButtonPanel.add(ClearButton);
        ButtonPanel.add(DeleteButton);
        ButtonPanel.add(Modulo);
        ButtonPanel.add(Division);

        ButtonPanel.add(Button7);
        ButtonPanel.add(Button8);
        ButtonPanel.add(Button9);
        ButtonPanel.add(Multiply);

        ButtonPanel.add(Button4);
        ButtonPanel.add(Button5);
        ButtonPanel.add(Button6);
        ButtonPanel.add(Subtract);

        ButtonPanel.add(Button1);
        ButtonPanel.add(Button2);
        ButtonPanel.add(Button3);
        ButtonPanel.add(Add);

        ButtonPanel.add(Button0);
        ButtonPanel.add(ButtonPoint);

        CenterPanel = new JPanel();
        CenterPanel.setBackground(ThemeColor);
        CenterPanel.setLayout(null);

        CenterPanel.add(Equal);
        CenterPanel.add(ButtonPanel);
        

    }

    private void SouthComp() {

        SouthPanel = new JPanel();
        SouthPanel.setBackground(ThemeColor);
        SouthPanel.setPreferredSize(new Dimension(0, 30));

    }

    private void ApplicationPanel() {

        FrameDragListener framedrag = new FrameDragListener(AppPanel);

        AppPanel = new JPanel();
        AppPanel.setBackground(ThemeColor);
        AppPanel.addMouseListener(framedrag);
        AppPanel.addMouseMotionListener(framedrag);
        AppPanel.setLayout(new BorderLayout());

        Screen();
        Buttons();
        SouthComp();

        AppPanel.add(CalculatorScreen, BorderLayout.NORTH);
        AppPanel.add(CenterPanel, BorderLayout.CENTER);
        AppPanel.add(SouthPanel, BorderLayout.SOUTH);

    }

    private void Frame() {

        Calculator = new JFrame();
        Calculator.setTitle("Calculator");
        Calculator.setSize(FrameSize[0], FrameSize[1]);
        Calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Calculator.setLocationRelativeTo(null);
        Calculator.setResizable(false);
        Calculator.addComponentListener(new ComponentAdapter() {
            
            public void componentResized(ComponentEvent e) {
            
                Calculator.setShape(new RoundRectangle2D.Double(0, 0, 475, 670, 25, 25));
                
            }
        });
        Calculator.setUndecorated(true);
        Calculator.setLayout(new BorderLayout());
        ApplicationPanel();
        Calculator.add(AppPanel, BorderLayout.CENTER);
        Calculator.setVisible(true);

    }

    private static ActionListener function = new ActionListener() {

        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == ExitButton) {

                Calculator.dispose();

             }

            if(e.getSource() == Darkmode) {

                ThemeColor = Colors.LightMode;
                KeyboardBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1);

                Darkmode.setVisible(false);
                ThemePanel.remove(Darkmode);

                Lightmode.setVisible(true);
                ThemePanel.add(Lightmode);

                CalculatorScreen.setBackground(ThemeColor);
                AnswerScreen.setBackground(ThemeColor);
                AnswerScreen.setDisabledTextColor(Colors.DarkMode);
                InputScreen.setBackground(ThemeColor);
                ButtonPanel.setBackground(ThemeColor);
                CenterPanel.setBackground(ThemeColor);
                AppPanel.setBackground(ThemeColor);

                ClearButton.setBackground(ThemeColor);
                ClearButton.setForeground(Color.darkGray);
                ClearButton.setBorder(KeyboardBorder);
                DeleteButton.setBackground(ThemeColor);
                DeleteButton.setForeground(Color.darkGray);
                DeleteButton.setBorder(KeyboardBorder);
                Modulo.setBackground(ThemeColor);
                Modulo.setForeground(Color.darkGray);
                Modulo.setBorder(KeyboardBorder);
                Division.setBackground(ThemeColor);
                Division.setForeground(Color.darkGray);
                Division.setBorder(KeyboardBorder);
                Button7.setBackground(ThemeColor);
                Button7.setForeground(Color.darkGray);
                Button7.setBorder(KeyboardBorder);
                Button8.setBackground(ThemeColor);
                Button8.setForeground(Color.darkGray);
                Button8.setBorder(KeyboardBorder);
                Button9.setBackground(ThemeColor);
                Button9.setForeground(Color.darkGray);
                Button9.setBorder(KeyboardBorder);
                Multiply.setBackground(ThemeColor);
                Multiply.setForeground(Color.darkGray);
                Multiply.setBorder(KeyboardBorder);
                Button4.setBackground(ThemeColor);
                Button4.setForeground(Color.darkGray);
                Button4.setBorder(KeyboardBorder);
                Button5.setBackground(ThemeColor);
                Button5.setForeground(Color.darkGray);
                Button5.setBorder(KeyboardBorder);
                Button6.setBackground(ThemeColor);
                Button6.setForeground(Color.darkGray);
                Button6.setBorder(KeyboardBorder);
                Subtract.setBackground(ThemeColor);
                Subtract.setForeground(Color.darkGray);
                Subtract.setBorder(KeyboardBorder);
                Button1.setBackground(ThemeColor);
                Button1.setForeground(Color.darkGray);
                Button1.setBorder(KeyboardBorder);
                Button2.setBackground(ThemeColor);
                Button2.setForeground(Color.darkGray);
                Button2.setBorder(KeyboardBorder);
                Button3.setBackground(ThemeColor);
                Button3.setForeground(Color.darkGray);
                Button3.setBorder(KeyboardBorder);
                Add.setBackground(ThemeColor);
                Add.setForeground(Color.darkGray);
                Add.setBorder(KeyboardBorder);
                Button0.setBackground(ThemeColor);
                Button0.setForeground(Color.darkGray);
                Button0.setBorder(KeyboardBorder);
                ButtonPoint.setBackground(ThemeColor);
                ButtonPoint.setForeground(Color.darkGray);
                ButtonPoint.setBorder(KeyboardBorder);
                Equal.setBorder(KeyboardBorder);


            }

            if(e.getSource() == Lightmode) {

                ThemeColor = Colors.DarkMode;
                KeyboardBorder = BorderFactory.createRaisedBevelBorder();

                Lightmode.setVisible(false);
                ThemePanel.remove(Lightmode);

                Darkmode.setVisible(true);
                ThemePanel.add(Darkmode);

                
                CalculatorScreen.setBackground(ThemeColor);
                AnswerScreen.setBackground(ThemeColor);
                AnswerScreen.setDisabledTextColor(Color.white);
                InputScreen.setBackground(ThemeColor);
                ButtonPanel.setBackground(ThemeColor);
                CenterPanel.setBackground(ThemeColor);
                AppPanel.setBackground(ThemeColor);
                
                ClearButton.setBackground(ThemeColor);
                ClearButton.setForeground(Colors.Olive);
                ClearButton.setBorder(KeyboardBorder);
                DeleteButton.setBackground(ThemeColor);
                DeleteButton.setForeground(Colors.Olive);
                DeleteButton.setBorder(KeyboardBorder);
                Modulo.setBackground(ThemeColor);
                Modulo.setForeground(Colors.Olive);
                Modulo.setBorder(KeyboardBorder);
                Division.setBackground(ThemeColor);
                Division.setForeground(Colors.Olive);
                Division.setBorder(KeyboardBorder);
                Button7.setBackground(ThemeColor);
                Button7.setForeground(Color.gray);
                Button7.setBorder(KeyboardBorder);
                Button8.setBackground(ThemeColor);
                Button8.setForeground(Color.gray);
                Button8.setBorder(KeyboardBorder);
                Button9.setBackground(ThemeColor);
                Button9.setForeground(Color.gray);
                Button9.setBorder(KeyboardBorder);
                Multiply.setBackground(ThemeColor);
                Multiply.setForeground(Colors.Olive);
                Multiply.setBorder(KeyboardBorder);
                Button4.setBackground(ThemeColor);
                Button4.setForeground(Color.gray);
                Button4.setBorder(KeyboardBorder);
                Button5.setBackground(ThemeColor);
                Button5.setForeground(Color.gray);
                Button5.setBorder(KeyboardBorder);
                Button6.setBackground(ThemeColor);
                Button6.setForeground(Color.gray);
                Button6.setBorder(KeyboardBorder);
                Subtract.setBackground(ThemeColor);
                Subtract.setForeground(Colors.Olive);
                Subtract.setBorder(KeyboardBorder);
                Button1.setBackground(ThemeColor);
                Button1.setForeground(Color.gray);
                Button1.setBorder(KeyboardBorder);
                Button2.setBackground(ThemeColor);
                Button2.setForeground(Color.gray);
                Button2.setBorder(KeyboardBorder);
                Button3.setBackground(ThemeColor);
                Button3.setForeground(Color.gray);
                Button3.setBorder(KeyboardBorder);
                Add.setBackground(ThemeColor);
                Add.setForeground(Colors.Olive);
                Add.setBorder(KeyboardBorder);
                Button0.setBackground(ThemeColor);
                Button0.setForeground(Color.gray);
                Button0.setBorder(KeyboardBorder);
                ButtonPoint.setBackground(ThemeColor);
                ButtonPoint.setForeground(Color.gray);
                ButtonPoint.setBorder(KeyboardBorder);
                Equal.setBorder(KeyboardBorder);

            }

            if(e.getSource() == ClearButton) {

                AnswerScreen.setVisible(false);

                AnswerScreen.setText("");
                InputScreen.setText("");

            }

            if(e.getSource() == DeleteButton) {

                String InputGet = InputScreen.getText();
                String AnsGet = AnswerScreen.getText();

                InputScreen.setText("");
                AnswerScreen.setText("");
                
                for(int i = 0; i < InputGet.length() - 1; i++) {

                    InputScreen.setText(InputScreen.getText() + InputGet.charAt(i));

                }

                for(int i = 0; i < AnsGet.length() - 1; i++) {

                    AnswerScreen.setText(AnswerScreen.getText() + AnsGet.charAt(i));

                }

            }


            if(e.getSource() == Modulo) {

                num1 = Integer.parseInt(AnswerScreen.getText());
                operator = '%';
                InputScreen.setText(InputScreen.getText().concat(String.valueOf("%")));

                AnswerScreen.setText("");

            }

            if(e.getSource() == Division) {

                num1 = Integer.parseInt(AnswerScreen.getText());
                operator = '/';
                InputScreen.setText(InputScreen.getText().concat(String.valueOf("÷")));
        
                AnswerScreen.setText("");

            }

            if(e.getSource() == Multiply) {

                num1 = Integer.parseInt(AnswerScreen.getText());
                operator = '*';
                InputScreen.setText(InputScreen.getText().concat(String.valueOf("×")));

                AnswerScreen.setText("");

            }

            if(e.getSource() == Subtract) {

                num1 = Integer.parseInt(AnswerScreen.getText());
                operator = '-';
                InputScreen.setText(InputScreen.getText().concat(String.valueOf("-")));
              
                AnswerScreen.setText("");

            }

            if(e.getSource() == Add) {

                num1 = Integer.parseInt(AnswerScreen.getText());
                operator = '+';
                InputScreen.setText(InputScreen.getText().concat(String.valueOf("+")));

                AnswerScreen.setText("");

            }

            if(e.getSource() == Equal) {

                num2 = Integer.parseInt(AnswerScreen.getText());

                switch(operator) {

                    case '/':
                             result = num1 / num2;
                             AnswerScreen.setText(String.valueOf(result));
                             break;
                     
                    case '*':
                             result = num1 * num2;
                             AnswerScreen.setText(String.valueOf(result));
                             break;

                    case '-':
                             result = num1 - num2;
                             AnswerScreen.setText(String.valueOf(result));
                             break;

                    case '+':
                             result = num1 + num2;
                             AnswerScreen.setText(String.valueOf(result));
                             break;

                    case '%':
                             result = num1 % num2;
                             AnswerScreen.setText(String.valueOf(result));
                             break;
                             
                }

                AnswerScreen.setVisible(true);
                num1 = result;

            }

            if(e.getSource() == Button0) {

                AnswerScreen.setVisible(true);

                InputScreen.setText(InputScreen.getText().concat(String.valueOf("0")));
                AnswerScreen.setText(AnswerScreen.getText().concat(String.valueOf("0")));

            }

            if(e.getSource() == Button1) {

                AnswerScreen.setVisible(true);

                InputScreen.setText(InputScreen.getText().concat(String.valueOf("1")));
                AnswerScreen.setText(AnswerScreen.getText().concat(String.valueOf("1")));
 
            }

            if(e.getSource() == Button2) {

                AnswerScreen.setVisible(true);

                InputScreen.setText(InputScreen.getText().concat(String.valueOf("2")));
                AnswerScreen.setText(AnswerScreen.getText().concat(String.valueOf("2")));

            }

            if(e.getSource() == Button3) {

                AnswerScreen.setVisible(true);

                InputScreen.setText(InputScreen.getText().concat(String.valueOf("3")));
                AnswerScreen.setText(AnswerScreen.getText().concat(String.valueOf("3")));

            }

            if(e.getSource() == Button4) {

                AnswerScreen.setVisible(true);

                InputScreen.setText(InputScreen.getText().concat(String.valueOf("4")));
                AnswerScreen.setText(AnswerScreen.getText().concat(String.valueOf("4")));

            }

            if(e.getSource() == Button5) {

                AnswerScreen.setVisible(true);

                InputScreen.setText(InputScreen.getText().concat(String.valueOf("5")));
                AnswerScreen.setText(AnswerScreen.getText().concat(String.valueOf("5")));

            }

            if(e.getSource() == Button6) {

                AnswerScreen.setVisible(true);

                InputScreen.setText(InputScreen.getText().concat(String.valueOf("6")));
                AnswerScreen.setText(AnswerScreen.getText().concat(String.valueOf("6")));

            }

            if(e.getSource() == Button7) {

                AnswerScreen.setVisible(true);

                InputScreen.setText(InputScreen.getText().concat(String.valueOf("7")));
                AnswerScreen.setText(AnswerScreen.getText().concat(String.valueOf("7")));

            }

            if(e.getSource() == Button8) {

                AnswerScreen.setVisible(true);

                InputScreen.setText(InputScreen.getText().concat(String.valueOf("8")));
                AnswerScreen.setText(AnswerScreen.getText().concat(String.valueOf("8")));

            }

            if(e.getSource() == Button9) {

                AnswerScreen.setVisible(true);

                InputScreen.setText(InputScreen.getText().concat(String.valueOf("9")));
                AnswerScreen.setText(AnswerScreen.getText().concat(String.valueOf("9")));

            }


        }

    };
}