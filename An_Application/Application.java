// Sprint 2 - WEST Region Navigation Panel
// JPanel with GridLayout and 3 buttons
import javax.swing.*;
import java.awt.*;

public class Application {
    JFrame frame;
    JLabel label;
    JButton button;
    JPanel panel;
    JTextArea textArea;
    JButton button1, button2, button3;
    JScrollPane scrollPane;


    public Application() {
        this.CreateJFrame();
    }

    public JFrame CreateJFrame(){
        frame = new JFrame();
        frame.setTitle("BorderLayout Demo");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this.CreateJLabel(), BorderLayout.NORTH);
        frame.add(this.CreateJButton(), BorderLayout.SOUTH);
        frame.add(this.CreateJPanel(), BorderLayout.WEST);
        frame.add(this.CreateJTextArea());
        frame.add(this.CreateJScrollPane(), BorderLayout.CENTER);
        frame.setVisible(true);
        return frame;
    }

    public JLabel CreateJLabel(){
        label = new JLabel("Application Title");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        return label;
    }

    public JButton CreateJButton(){
        button = new JButton();
        button.setText("Submit");
        return button;
    }

    public JButton Createbutton1(){
        button1 = new JButton("Option1");
        return button1;
    }

    public JButton Createbutton2(){
        button2 = new JButton("Option2");
        return button2;
    }

    public JButton Createbutton3(){
        button3 = new JButton("Option3");
        return button3;
    }

    public JPanel CreateJPanel(){
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(this.Createbutton1());
        panel.add(this.Createbutton2());
        panel.add(this.Createbutton3());
        return panel;
    }

    public JScrollPane CreateJScrollPane(){
        scrollPane = new JScrollPane(textArea);
        return scrollPane;
    }

    public JTextArea CreateJTextArea(){
        textArea = new JTextArea();
        return textArea;
    }

}
