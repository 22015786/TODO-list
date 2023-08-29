
package todolist;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitleBar extends JPanel {
    JLabel TitleText = new JLabel("*TO-DO LIST*");
    public TitleBar(){
        
            this.setPreferredSize(new Dimension(400,80));
            this.setBackground( Color.BLUE);
            
            TitleText.setPreferredSize(new Dimension(200,80));
            TitleText.setFont(new Font("Sans-serif",Font.BOLD,20));
            TitleText.setHorizontalAlignment(JLabel.CENTER);
            this.add(this.TitleText);
            
}
}
