// Sprint 1 - Frame & Basic Structure
import javax.swing.*;
import java.awt.*;

public class Application {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setTitle("BorderLayout Demo");
        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Application Title");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(label, BorderLayout.NORTH);

        JButton button = new JButton();
        button.setText("Submit");
        frame.add(button, BorderLayout.SOUTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        JButton button1 = new JButton("Option1");
        JButton button2 = new JButton("Option2");
        JButton button3 = new JButton("Option3");
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        frame.add(panel, BorderLayout.WEST);

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

    }
}
