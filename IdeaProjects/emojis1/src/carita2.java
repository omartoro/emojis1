import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

public class carita2 extends JPanel {

    public void paint (Graphics grafico) {
        grafico.setColor(Color. yellow);
        grafico.fillOval(100, 100, 200, 200);
        grafico. setColor(Color.black) ;
        grafico.drawOval(100, 100, 200, 200);

        grafico.drawOval(150, 150, 20, 20);
        grafico.setColor(Color.darkGray);
        grafico.fillOval(150, 150, 20, 20);

        grafico.drawOval(230, 150, 20, 20);
        grafico.setColor(Color. darkGray);
        grafico.fillOval(230, 150, 20, 20);
        //boca
        grafico.drawArc(150,200,100,90,0,180);


    }

}
