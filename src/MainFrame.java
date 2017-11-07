import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel jpn = new JPanel(new GridLayout(3, 3, 4, 4));
    private Container cp;
    private JTextField jtf = new JTextField();
    private JButton jbtns[] = new JButton[9];

    public MainFrame() {
        initComp();
    }

    private void initComp() {
        this.setBounds(200, 200, 500, 500);
        cp = new Container();
        this.setContentPane(cp);
        cp.setLayout(new BorderLayout(5, 5));
        cp.add(jtf, BorderLayout.NORTH);
        cp.add(jpn, BorderLayout.CENTER);

        for (int i = 0; i < 9; i++) {
            jbtns[i] = new JButton(Integer.toString(i));
            jpn.add(jbtns[i]);
            jbtns[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton jButton = (JButton) e.getSource();

                }
            });


        }
    }
}
