package OOPexample;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Interface representing the event
interface MouseCaughtListener {
    void onEachTenCaught(Object sender, int miceCaughtCount);
}

// Cat class with event handling
class Cat {
    private int miceCaughtCount;
    private MouseCaughtListener onEachTenCaught;

    public void setCatchingEventListener(MouseCaughtListener listener) {
        this.onEachTenCaught = listener;
    }

    public void catchAMouse() {
        miceCaughtCount++;
        if (miceCaughtCount % 10 == 0 && onEachTenCaught != null) {
            onEachTenCaught.onEachTenCaught(this, miceCaughtCount);
        }
    }
}

// Form1 class (equivalent to Windows Forms in Java)
public class Form1 {
    private Cat cat1 = new Cat();
    private JButton button1;

    public Form1() {
        JFrame frame = new JFrame("Form1");
        button1 = new JButton("Catch a Mouse");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cat1.catchAMouse();
            }
        });

        frame.add(button1);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        cat1.setCatchingEventListener(new MouseCaughtListener() {
            @Override
            public void onEachTenCaught(Object sender, int miceCaughtCount) {
                JOptionPane.showMessageDialog(null, sender.toString() + " - caught another 10 mice!");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Form1();
            }
        });
    }
}