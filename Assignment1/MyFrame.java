import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;
    JLabel label2;

    MyFrame(){

        ImageIcon image = new ImageIcon("logo.png");

        ImageIcon img = new ImageIcon("img.jpg");
        Image scaleImage = img.getImage().getScaledInstance(450,150,Image.SCALE_DEFAULT);
        ImageIcon finalImage =  new ImageIcon(scaleImage);

        Border border = BorderFactory.createLineBorder(new Color(0x000000),5);

        JLabel label = new JLabel();
        label.setText("Enter Your Age:");
        label.setBounds(0,0,250,50);
        label.setHorizontalTextPosition(JLabel.LEFT);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setForeground(new Color(0x000000));
        label.setFont(new Font("MV Boli",Font.BOLD,20));
        label.setIconTextGap(10);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);

        JLabel label1 = new JLabel();
        label1.setBounds(0,130,470,150);
        label1.setIcon(finalImage);

        textField = new JTextField();
        textField.setFont(new Font("MV Boli",Font.BOLD,20));
        textField.setBounds(255,0,195,50);
        textField.setBackground(new Color(0x97999B));
        textField.setBorder(border);


        button = new JButton();
        button.setBounds (320,75,76,38);
        button.addActionListener(this);
        button.setText("Submit");
        button.setFocusable(false);
        button.setFont(new Font("Comic Sans",Font.BOLD,12));
        button.setForeground(Color.BLACK);

        label2 = new JLabel();
        label2.setBounds(0,300,450,70);
        label2.setBorder(border);
        label2.setFont(new Font("MV Boli",Font.BOLD,20));
        label2.setBackground(new Color(0x97999B));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(470,420);
        this.setTitle("Vote Eligibility Checker");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0x97999B));
        this.setVisible(true);
        this.add(button);
        this.add(label);
        this.add(label1);
        this.add(textField);
        this.add(label2);
    }

    @Override
    public void actionPerformed(ActionEvent e1) {
        if(e1.getSource()==button){
            try{
                int i = Integer.parseInt(textField.getText());
                if(i>=18){
                    label2.setText("Yes,You're Eligible to Vote.");
                }
                else if(i<0){
                    label2.setText("No,You're not born yet.");
                }
                else if(i<18){
                    label2.setText("No,You're Not Eligible to Vote.");
                }
            }
            catch(NumberFormatException e){
                label2.setText("Please Enter Valid Input");
            }
        }
    }
}
