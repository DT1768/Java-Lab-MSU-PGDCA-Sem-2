import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FeesGUI extends JFrame implements ActionListener {

    JButton button;
    JLabel label1;
    JRadioButton male;
    JRadioButton female;
    JRadioButton above30;
    JRadioButton below30;

    FeesGUI(){

        Border border = BorderFactory.createLineBorder(new Color(0x000000),5);

        JLabel label = new JLabel();
        label.setText("Diploma German Course Fee Calculator");
        label.setBounds(0,0,470,50);
        label.setHorizontalTextPosition(JLabel.LEFT);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setForeground(new Color(0x000000));
        label.setFont(new Font("MV Boli",Font.BOLD,20));
        label.setIconTextGap(10);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        male.addActionListener(this);
        male.setBounds(30,70,100,50);
        male.setFont(new Font("Comic Sans",Font.BOLD,12));
        female.addActionListener(this);
        female.setBounds(30,130,100,50);
        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        above30 = new JRadioButton("Age: >=30");
        below30 = new JRadioButton("Age: <30");
        above30.addActionListener(this);
        above30.setBounds(340,70,100,50);
        above30.setFont(new Font("Comic Sans",Font.BOLD,12));
        below30.addActionListener(this);
        below30.setBounds(340,130,100,50);
        below30.setFont(new Font("Comic Sans",Font.BOLD,12));
        ButtonGroup age = new ButtonGroup();
        age.add(above30);
        age.add(below30);

        button = new JButton();
        button.setBounds (186,200,100,38);
        button.addActionListener(this);
        button.setText("Calculate");
        button.setFocusable(false);
        button.setFont(new Font("Comic Sans",Font.BOLD,12));
        button.setForeground(Color.BLACK);

        label1 = new JLabel();
        label1.setBounds(0,300,450,70);
        label1.setBorder(border);
        label1.setFont(new Font("MV Boli",Font.BOLD,20));
        label1.setForeground(Color.WHITE);
        label1.setOpaque(true);
        label1.setBackground(new Color(0x000000));
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(470,420);
        this.setTitle("Fee Calculator");
        this.getContentPane().setBackground(new Color(0x97999FF));
        this.setVisible(true);
        this.add(label);
        this.add(male);
        this.add(female);
        this.add(above30);
        this.add(below30);
        this.add(button);
        this.add(label1);
    }

    @Override
    public void actionPerformed(ActionEvent e1) {
        if(e1.getSource()==button){
            if(male.isSelected() && below30.isSelected()){
                label1.setText("5000");
            }
            else if(male.isSelected() && above30.isSelected()){
                label1.setText("4000");
            }
            else if(female.isSelected() && below30.isSelected()){
                label1.setText("1000");
            }
            else if(female.isSelected() && above30.isSelected()){
                label1.setText("500");
            }
        }
    }
}
