package PresentationLayer;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class frmCajero extends JFrame {

    JPanel panelCentral;
    JPanel bottPanel;
    JPanel topPanel;
    JButton [] nums = new JButton[10];

    public frmCajero(){

        setTitle("Cajero Automatico");
        setSize(420,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFont(new Font("TimesNewRoman", Font.BOLD, 12));
        setLocationRelativeTo(null);

        panelCentral = new JPanel(null);

        for(int i = 0; i< 10; i++){
            nums[i] = new JButton(String.valueOf(i));
            nums[i].setFocusable(false);
            nums[i].setBorder(new LineBorder(Color.BLACK));

        }

        bottPanel = new JPanel(new GridLayout(3,3, 10, 10));
        bottPanel.setBounds(50, 100, 300, 300);

        bottPanel.add(nums[0]);
        bottPanel.add(nums[1]);
        bottPanel.add(nums[2]);
        bottPanel.add(nums[3]);
        bottPanel.add(nums[4]);
        bottPanel.add(nums[5]);
        bottPanel.add(nums[6]);
        bottPanel.add(nums[7]);
        bottPanel.add(nums[8]);
        bottPanel.add(nums[9]);

        panelCentral.add(bottPanel);

        add(panelCentral);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmCajero().setVisible(true);
            }
        });
    }



}
