package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSys extends JFrame{
    private JPanel pMain;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;
    private JCheckBox cbPizza;
    private JCheckBox cbBurger;
    private JCheckBox cbFries;
    private JCheckBox cbSoftDrink;
    private JCheckBox cbTea;
    private JCheckBox cbSundae;

    FoodOrderingSys(){
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double[] ords = new double[6];
                JCheckBox[] checkbox = {cbPizza,cbBurger,cbFries,cbSoftDrink,cbTea,cbSundae};
                double[] orders = {100, 80, 65, 55, 50, 40};
                double total = 0, discount = 0;

                for (int i =0; i < checkbox.length; i++){
                    if(checkbox[i].isSelected()){
                        ords[i] = orders[i];
                    }
                }

                if (rb5.isSelected()){
                    discount = 0.05;
                } else if (rb10.isSelected()){
                    discount = 0.10;
                } else if (rb15.isSelected()){
                    discount = 0.15;
                } else if (rbNone.isSelected()){
                    discount = 0;
                }

                for(double ord : ords){
                    total += ord;
                }

                JOptionPane.showMessageDialog(null, "The total price is Php "+ (total*(1-discount)));

            }

        });

    }

    public static void main(String[] args) {
        FoodOrderingSys app = new FoodOrderingSys();
        app.setContentPane(app.pMain);
        app.setSize(500,550);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setTitle("Food Ordering System");
    }
}
