import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;

/**
 * Created by R2-D2 on 28.12.2016.
 */
public class Start {

        public Start (){
                JFrame frame = new JFrame("Нажми!" );
                frame.setSize(1600,2800);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new FlowLayout());
                frame.add(new JButton("Не нажимай!"));
                frame.add(new Button("2"));
                frame.add(new JButton("3"));
                frame.setVisible(true);
        }
}
