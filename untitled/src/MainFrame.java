import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{
    private Container cp;
//    private JPanel jpn1 =new JPanel();
//    private JPanel jpn2 =new JPanel();
    private JLabel jlb1 =new JLabel("ID");
//    private JLabel jlb2 =new JLabel("PASSWORD");
    private JButton jbtn1 =new JButton("K");
    private JButton jbtn2 =new JButton("Login");
    private JButton jbtn3 =new JButton("U");
    private JButton jbtn4 =new JButton("D");
    private JButton jbtn5 =new JButton("B");
    private JButton jbtn6 =new JButton("S");
//    private JButton jbtn3 =new JButton("Exit");
//    private JTextField jtf =new JTextField();
//    private JPasswordField
        int y=10;
        int x=10;
        int w=80;
        int h=35;

    public MainFrame(){
        init();
    }

    private void init(){
        cp =this.getContentPane();
        cp.setLayout(null);
        jlb1.setBounds(x,y,80,35);
        jlb1.setFont(new Font(null,Font.BOLD,12));

        cp.add(jlb1);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(800,100,800,400);
        jbtn1.setBounds(80,10,90,35);
        jbtn2.setBounds(170,10,90,35);
        jbtn3.setBounds(260,10,90,35);
        jbtn4.setBounds(350,10,90,35);
        jbtn5.setBounds(440,10,90,35);
        jbtn6.setBounds(530,10,90,35);
        jlb1.setOpaque(true);
        jlb1.setBackground(new Color(41, 255, 117));


        cp.add(jbtn1);
        cp.add(jbtn2);
        cp.add(jbtn3);
        cp.add(jbtn4);
        cp.add(jbtn5);
        cp.add(jbtn6);

        jbtn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                y=y+10;
                jlb1.setBounds(x,y,80,35);
            }
        });
        jbtn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                y=y-10;
                jlb1.setBounds(x,y,80,35);
            }
        });
        jbtn3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x=x+10;
                jlb1.setBounds(x,y,80,35);
            }
        });
        jbtn4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x=x-10;
                jlb1.setBounds(x,y,80,35);
            }
        });
        jbtn5.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                w=w+10;
                h=h+10;
                jlb1.setSize(w,h);
            }
        });
        jbtn6.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                w=w-10;
                h=h-10;
                jlb1.setBounds(x,y,80,35);
            }
        });


    }
}
