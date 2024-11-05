package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame{
    private JTextField tfFirstNum;
    private JComboBox cbOperations;
    private JTextField tfSecondNum;
    private JButton btnComputeRes;
    private JTextField tfResult;
    private JPanel pMain;

    SimpleCalculator(){
        btnComputeRes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fnum = Integer.parseInt(tfFirstNum.getText());
                int snum = Integer.parseInt(tfSecondNum.getText());
                int res;


                if(cbOperations.getSelectedIndex() == 0){
                    res = fnum + snum;
                    tfResult.setText(String.valueOf(res));
                } else if (cbOperations.getSelectedIndex() == 1){
                    res = fnum - snum;
                    tfResult.setText(String.valueOf(res));}
                }

        });
    }
    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setContentPane(app.pMain);
        app.setSize(400,300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
    }
}

