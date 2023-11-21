package OOP3Lab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculateButtonListener implements ActionListener {
    public RightTrianglePerimeterCalculator calculator;

    public CalculateButtonListener(RightTrianglePerimeterCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calculator.calculatePerimeter();
    }
}

public class RightTrianglePerimeterCalculator {
    private JFrame frame;
    private JTextField sideATextField;
    private JTextField sideBTextField;
    private JButton calculateButton;

    public RightTrianglePerimeterCalculator() {
        frame = new JFrame("Right Triangle Perimeter Calculator");
        frame.setLayout(new FlowLayout());

        JLabel sideALabel = new JLabel("Enter side A:");
        sideATextField = new JTextField(10);

        JLabel sideBLabel = new JLabel("Enter side B:");
        sideBTextField = new JTextField(10);

        calculateButton = new JButton("Calculate");
        CalculateButtonListener buttonListener = new CalculateButtonListener(this);
        calculateButton.addActionListener(buttonListener);

        frame.add(sideALabel);
        frame.add(sideATextField);
        frame.add(sideBLabel);
        frame.add(sideBTextField);
        frame.add(calculateButton);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void calculatePerimeter() {
        try {
            int sideA = Integer.parseInt(sideATextField.getText());
            int sideB = Integer.parseInt(sideBTextField.getText());

            double perimeter = sideA + sideB + Math.sqrt(sideA * sideA + sideB * sideB);

            JOptionPane.showMessageDialog(frame, "Right Triangle perimeter is " + perimeter);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Not a number.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RightTrianglePerimeterCalculator();
            }
        });
    }
}