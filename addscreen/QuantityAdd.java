package addscreen;

import javax.swing.*;
import java.awt.*;

public class QuantityAdd extends JPanel {

    //Label
    private JLabel addQuantityLabel = new JLabel("Quantity");

    //JTextField
    private JTextField addQuantity = new JTextField(null, 8);

    public QuantityAdd(){

        add(addQuantityLabel);
        addQuantityLabel.setBounds(400, 300, 100, 50);
        addQuantityLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        addQuantityLabel.setForeground(new Color(0x000000));
        add(addQuantity);
        addQuantity.setBounds(550, 200, 100, 50);
        addQuantity.setFont(new Font("Arial", Font.PLAIN, 16));
        addQuantity.setForeground(new Color(0x000000));
    }
    public static void main(String[] args) {

    }
}
