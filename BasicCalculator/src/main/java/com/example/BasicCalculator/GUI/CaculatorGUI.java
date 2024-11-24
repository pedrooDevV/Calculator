package com.example.BasicCalculator.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaculatorGUI {
    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;

    private JPanel CalculatorGUI;
    private JButton btnFour;
    private JTextField txtDisplay;
    private JButton btnTwo;
    private JButton btnFive;
    private JButton btnOne;
    private JButton btnThree;
    private JButton btnSix;
    private JButton btnSeven;
    private JButton btnEight;
    private JButton btnNine;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnMultiply;
    private JButton btnDivision;
    private JButton btnZero;
    private JButton btnPoint;
    private JButton btnParsent;
    private JButton btnEquals;
    private JButton btnClear;

    private void getOperator(String btnTxt){
        math_operator = btnTxt.charAt(0);
        total1 = total1 + Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText(" ");
    }



    public CaculatorGUI() {
        btnOne.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             String btnOneText = txtDisplay.getText() + btnOne.getText();
             txtDisplay.setText(btnOneText);



         }
     });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = txtDisplay.getText() + btnTwo.getText();
                txtDisplay.setText(btnTwoText);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreText = txtDisplay.getText() + btnThree.getText();
                txtDisplay.setText(btnThreText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = txtDisplay.getText() + btnFour.getText();
                txtDisplay.setText(btnFourText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = txtDisplay.getText() + btnFive.getText();
                txtDisplay.setText(btnFiveText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = txtDisplay.getText() + btnSix.getText();
                txtDisplay.setText(btnSixText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = txtDisplay.getText() + btnSeven.getText();
                txtDisplay.setText(btnSevenText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = txtDisplay.getText() + btnEight.getText();
                txtDisplay.setText(btnEightText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = txtDisplay.getText() + btnNine.getText();
                txtDisplay.setText(btnNineText);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = txtDisplay.getText() + btnZero.getText();
                txtDisplay.setText(btnZeroText);
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnPlus.getText();
                getOperator(button_text);
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator){
                    case '+':
                        total2 = total1 + Double.parseDouble(txtDisplay.getText());
                        break;
                    case '-' :
                        total2 = total1 - Double.parseDouble(txtDisplay.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(txtDisplay.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(txtDisplay.getText());
                        break;
                    case '%':
                        total2 = total1 * Double.parseDouble(txtDisplay.getText()) / 100;
                        break;
                    default:
                        System.out.println("Option Dosnt Exist");
                        break;

                }
                txtDisplay.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                txtDisplay.setText(" ");
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtDisplay.getText().equals("")) {
                    txtDisplay.setText("0.");
                } else if (txtDisplay.getText().contains(".")) {
                    btnPoint.setEnabled(false);
                } else {
                    String btnPointTxt = txtDisplay.getText() + btnPoint.getText();
                    txtDisplay.setText(btnPointTxt);
                }
                btnPoint.setEnabled(true);
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMinus.getText();
                getOperator(button_text);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMultiply.getText();
                getOperator(button_text);
            }
        });
        btnDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnDivision.getText();
                getOperator(button_text);
            }
        });
        btnParsent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnParsent.getText();
                getOperator(button_text);
            }
        });
    }





    public static void main(String[] args) {
        JFrame frame = new JFrame("CaculatorGUI");
        frame.setContentPane(new CaculatorGUI().CalculatorGUI);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
