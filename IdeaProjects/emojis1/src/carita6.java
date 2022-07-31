import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

public class carita6 extends JPanel {

    public void paint (Graphics grafico) {
        //color cara

        grafico.setColor(Color. yellow);
        grafico.fillOval(100, 100, 200, 200);
        grafico. setColor(Color.black) ;
        grafico.drawOval(100, 100, 200, 200);

        grafico.drawOval(140, 150, 40, 40);
        grafico.setColor(Color.darkGray);
        grafico.fillOval(140, 150, 40, 40);

        grafico.drawOval(230, 150, 40, 40);
        grafico.setColor(Color. darkGray);
        grafico.fillOval(230, 150, 40, 40);

        grafico.drawLine(150,170,250,170);

        //boca
        grafico.drawLine(150,225,220,250);


    }
}




