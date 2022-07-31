import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

public class carita10 extends JPanel {

    public void paint (Graphics grafico) {
        //cara
        grafico.setColor(Color. yellow);
        grafico.fillOval(100, 100, 200, 200);
        grafico. setColor(Color.black) ;
        grafico.drawOval(100, 100, 200, 200);
        //ojo izquierdo
        grafico.drawOval(150, 150, 20, 20);
        grafico.setColor(Color.darkGray);
        grafico.fillOval(150, 150, 20, 20);
        grafico.drawOval(140, 140, 40, 40);
        //ojo derecho
        grafico.drawOval(230, 150, 20, 20);
        grafico.setColor(Color. darkGray);
        grafico.fillOval(230, 150, 20, 20);
        grafico.drawOval(220, 140, 40, 40);

        grafico.drawLine(180,160,220,160);
        //boca
        grafico.drawArc(150,175,100,90,180,180);


    }

}
