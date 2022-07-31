import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

public class carita3 extends JPanel {

    public void paint (Graphics grafico) {
        //color cara
        grafico.setColor(Color. yellow);
        grafico.fillOval(100, 100, 200, 200);
        grafico. setColor(Color.black) ;
        //cara
        grafico.drawOval(100, 100, 200, 200);
        //ojos izquierdo
        grafico.drawOval(150, 150, 20, 20);
        grafico.setColor(Color.darkGray);
        grafico.fillOval(150, 150, 20, 20);
        //ojo derecho
        grafico.drawOval(230, 150, 20, 20);
        grafico.setColor(Color. darkGray);
        grafico.fillOval(230, 150, 20, 20);
        //boca
        grafico.drawOval(160,200,80,80);
        grafico.setColor(Color.darkGray);
        grafico.fillOval(160, 200, 80, 80);


    }
}

