import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

public class carita4 extends JPanel {

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
        //lágrima
        grafico.drawOval(150,180,20,30);
        grafico.setColor(Color.blue);
        grafico.fillOval(150, 180, 20, 30);
        //ojo derecho
        grafico.drawOval(230, 150, 20, 20);
        grafico.setColor(Color. darkGray);
        grafico.fillOval(230, 150, 20, 20);
        //boca
        grafico.drawArc(150,200,100,90,0,180);


    }
}


