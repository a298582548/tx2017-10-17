import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
    private JPanel jpn = new JPanel(new GridLayout(3,3,3,3));
    private Container cp;
    private JTextField jtf = new JTextField();
    private JButton jbtns[] = new JButton[9];
    public MainFrame(){
        initComp();
    }
    private void initComp(){
        this.setBounds(200,200,200,200);
        cp.setLayout(new BorderLayout(5,5));
        cp.add(jtf,BorderLayout.NORTH);
    }
}
