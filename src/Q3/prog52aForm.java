package Q3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prog52aForm {
    private JPanel MainPanel;
    private JButton btnClear;
    private JButton btnCalc;
    private JLabel lblArea;
    private JLabel lblPerim;
    private JTextField txtLen;
    private JTextField txtWid;
    private JLabel lblWidth;
    private JLabel lblLength;
    private JLabel lblPerimOut;
    private JLabel lblAreaOut;

    public prog52aForm() {
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtLen.setText("");
                txtWid.setText("");
                lblAreaOut.setText("");
                lblPerimOut.setText("");
            }
        });
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int len = Integer.parseInt(txtLen.getText());
                int wid = Integer.parseInt(txtWid.getText());
                int Area = len * wid;
                int Perim = 2 * len + 2 * wid;
                lblAreaOut.setText("Area: " + Area);
                lblPerimOut.setText("Perimeter: " + Perim);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Prog52a");
        frame.setContentPane(new prog52aForm().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
