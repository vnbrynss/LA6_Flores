package LeapYearChecker;

import javax.swing.*;
import java.awt.event.*;

public class LeapYearChecker extends JFrame{
    private JTextField tfYear;
    private JPanel pMain;
    private JButton btnCheck;

    LeapYearChecker(){
        btnCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year = Integer.parseInt(tfYear.getText());

                try {
                    if (isLeap(year)){
                        JOptionPane.showMessageDialog(null, "Leap year");
                    } else {
                        JOptionPane.showMessageDialog(null, "Not a leap year");
                    }
                } catch (ArithmeticException n){
                    System.out.println(n.getMessage());
                }

            }
        });
    }
    public static boolean isLeap(int year){
        if (year % 400 == 0){
            return true;
        }

        if (year % 100 == 0 ){
            return true;
        }

        return year % 4 == 0;
    }

    public static void main(String[] args) {
        LeapYearChecker app = new LeapYearChecker();
        app.setContentPane(app.pMain);
        app.setSize(400,300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");
    }
}
