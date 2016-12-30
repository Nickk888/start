import javax.swing.*;
import java.awt.FlowLayout;
import javax.swing.JButton;

/**
 * Created by R2-D2 on 28.12.2016.
 */
public class Start {

        public Start (){
                JFrame frame = new JFrame("Нажми!" );
                frame.setSize(200,100);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new FlowLayout());
                frame.add(new JButton("Не нажимай!"));
                frame.setVisible(true);
        }
}
