import javax.swing.*;
import java.awt.*;

public class CAL{
    JFrame jFrame = new JFrame();

    public void calculated(){
        JLabel jLabel = new JLabel("Panel 1");
        JLabel jLabel1 = new JLabel("Panel 2");
        JLabel jLabel2 = new JLabel("Panel 3");
        JLabel jLabel3 = new JLabel("Panel 4");
        JLabel jLabel4 = new JLabel("Panel 5");
        JLabel jLabel5 = new JLabel("Panel 6");
        JLabel jLabel6 = new JLabel("Panel 7");
        JLabel jLabel7 = new JLabel("Panel 8");
        JLabel jLabel8 = new JLabel("Panel 9");
        JLabel jLabel9 = new JLabel("Panel 10");
        JLabel jLabel10 = new JLabel("Panel 11");
        JLabel jLabel11 = new JLabel("Panel 12");

        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.BLACK);

        JPanel jPanel1 = new JPanel();
        jPanel1.setBackground(Color.GREEN);

        JPanel jPanel2 = new JPanel();
        jPanel2.setBackground(Color.pink);

        JPanel jPanel3 = new JPanel();
        jPanel3.setBackground(Color.MAGENTA);

        JPanel jPanel4 = new JPanel();
        jPanel4.setBackground(Color.orange);

        JPanel jPanel5 = new JPanel();
        jPanel5.setBackground(Color.CYAN);

        JPanel jPanel6 = new JPanel();
        jPanel6.setBackground(Color.RED);

        JPanel jPanel7 = new JPanel();
        jPanel7.setBackground(Color.LIGHT_GRAY);

        JPanel jPanel8 = new JPanel();
        jPanel8.setBackground(Color.WHITE);

        JPanel jPanel9 = new JPanel();
        jPanel9.setBackground(Color.white);

        JPanel jPanel10 = new JPanel();
        jPanel10.setBackground(Color.ORANGE);

        JPanel jPanel11 = new JPanel();
        jPanel11.setBackground(Color.RED);


        jFrame.setSize(600,600);
        jFrame.setTitle("Grid");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLayout(new GridLayout(4,3));
        jFrame.getContentPane().setBackground(Color.gray);

        jPanel.add(jLabel);
        jPanel1.add(jLabel1);
        jPanel2.add(jLabel2);
        jPanel3.add(jLabel3);
        jPanel4.add(jLabel4);
        jPanel5.add(jLabel5);
        jPanel6.add(jLabel6);
        jPanel7.add(jLabel7);
        jPanel8.add(jLabel8);
        jPanel9.add(jLabel9);
        jPanel10.add(jLabel10);
        jPanel11.add(jLabel11);

        jFrame.add(jPanel);
        jFrame.add(jPanel1);
        jFrame.add(jPanel2);
        jFrame.add(jPanel3);
        jFrame.add(jPanel4);
        jFrame.add(jPanel5);
        jFrame.add(jPanel6);
        jFrame.add(jPanel7);
        jFrame.add(jPanel8);
        jFrame.add(jPanel9);
        jFrame.add(jPanel10);
        jFrame.add(jPanel11);

        jFrame.setVisible(true);


    }
}
