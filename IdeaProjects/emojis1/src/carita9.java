import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

public class carita9 extends JPanel {

    public void paint (Graphics grafico) {
        //cara
        grafico.setColor(Color. yellow);
        grafico.fillOval(100, 100, 200, 200);
        grafico. setColor(Color.black) ;
        grafico.drawOval(100, 100, 200, 200);
        //aureola
        grafico.setColor(Color.blue);
        grafico.drawOval(150,110,100,20);

        //ojo izquierdo
        grafico.drawOval(150, 150, 20, 20);
        grafico.setColor(Color.darkGray);
        grafico.fillOval(150, 150, 20, 20);
        //ojo derecho
        grafico.drawOval(230, 150, 20, 20);
        grafico.setColor(Color. darkGray);
        grafico.fillOval(230, 150, 20, 20);
        //boca
        grafico.drawArc(150,175,100,90,180,180);


    }

}