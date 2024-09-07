import javax.swing.*;
import java.awt.*;

public class Note {
    JFrame jFrame = new JFrame();

    JLabel jLabel = new JLabel("To-Do List Manager ");
    JPanel area = new JPanel();
    JButton jButton6 = new JButton("Add");
    JTextField jTextField = new JTextField();

    JPanel jPanel = new JPanel(new BorderLayout());
    JPanel jPanel1 = new JPanel(new BorderLayout());
    JPanel jPanel2 = new JPanel(new BorderLayout());
    JPanel jPanel3 = new JPanel(new BorderLayout());
    JPanel jPanel4 = new JPanel(new BorderLayout());

    JPanel inside = new JPanel(new GridLayout(12,9,6,3));

    JLabel jLabel1 = new JLabel("THE DIARY OF A CEO by steven bartlett");
    JLabel jLabel2 = new JLabel("surrounded by idiots by thomas erikson");
    JLabel jLabel3 = new JLabel("HOW SUCCESSFUL PEOPLE THINK by john.c maxwell");
    JLabel jLabel4 = new JLabel("The Wealth Money Can't Buy Robin Sharma");
    JLabel jLabel5 = new JLabel("To-Do List Manager");

    JCheckBox jCheckBox = new JCheckBox("Done");
    JCheckBox jCheckBox1 = new JCheckBox("Done");
    JCheckBox jCheckBox2 = new JCheckBox("Done");
    JCheckBox jCheckBox3 = new JCheckBox("Done");
    JCheckBox jCheckBox4 = new JCheckBox("Done");

    JButton jButton1 = new JButton("Remove");
    JButton jButton2 = new JButton("Remove");
    JButton jButton3 = new JButton("Remove");
    JButton jButton4 = new JButton("Remove");
    JButton jButton5 = new JButton("Remove");



    void Notepad(){

        inside.setBackground(Color.lightGray);
        inside.add(jPanel);
        inside.add(jPanel1);
        inside.add(jPanel2);
        inside.add(jPanel3);

        jPanel.setSize(1500,50);
        jPanel.setBackground(Color.black);
        jPanel.add(jCheckBox,BorderLayout.WEST);
        jCheckBox.setFocusable(false);
        jCheckBox.setAlignmentX(40);
        jPanel.add(jLabel1);
        jLabel1.setForeground(Color.white);
        jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
        jPanel.add(jButton1,BorderLayout.EAST);
        jButton1.setFocusable(false);


        jPanel1.setSize(12000,60);
        jPanel1.setBackground(Color.black);
        jPanel1.add(jCheckBox1,BorderLayout.WEST);
        jCheckBox1.setFocusable(false);
        jCheckBox1.setAlignmentX(70);
        jPanel1.add(jLabel2);
        jLabel2.setForeground(Color.orange);
        jPanel1.add(jButton2,BorderLayout.EAST);
        jButton2.setFocusable(false);

        jPanel2.setSize(12000,60);
        jPanel2.setBackground(Color.black);
        jPanel2.add(jCheckBox2,BorderLayout.WEST);
        jCheckBox2.setFocusable(false);
        jCheckBox2.setAlignmentX(70);
        jPanel2.add(jLabel3);
        jLabel3.setForeground(Color.white);
        jPanel2.add(jButton3,BorderLayout.EAST);
        jButton3.setFocusable(false);

        jPanel3.setSize(12000,60);
        jPanel3.setBackground(Color.black);
        jPanel3.add(jCheckBox3,BorderLayout.WEST);
        jCheckBox3.setFocusable(false);
        jCheckBox3.setAlignmentX(70);
        jPanel3.add(jLabel4);
        jLabel4.setForeground(Color.white);
        jPanel3.add(jButton4,BorderLayout.EAST);
        jButton4.setFocusable(false);




        jTextField.setPreferredSize(new Dimension(960,65));
        //jTextField.setText("Write something..................?");

        area.setSize(300,100);
        area.setBackground(Color.white);
        area.add(jTextField);
        area.add(jButton6);
        area.setBackground(Color.green);
        jButton6.setFocusable(false);


        jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jFrame.setTitle("Notebook");
        jFrame.setLayout(new BorderLayout());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().setBackground(Color.green);


        jFrame.add(jLabel,BorderLayout.WEST);
        jFrame.add(inside,BorderLayout.CENTER);
        jFrame.add(area, BorderLayout.NORTH);
        jFrame.setVisible(true);
    }
}
