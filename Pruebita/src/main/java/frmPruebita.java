import javax.swing.*;
import java.awt.*;


public class frmPruebita extends JFrame {
    private JPanel contentPane;
    private JPanel leftPanel;
    private JPanel topRpanel;
    private JPanel bottRpanel;
    private JLabel lblNombre;


    public frmPruebita(){
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);

        add(contentPane);
     }

   public static void main(String[] args) {
       EventQueue.invokeLater(new Runnable() {
           @Override
           public void run() {
               new frmPruebita().setVisible(true);
           }
       });
   }

}
