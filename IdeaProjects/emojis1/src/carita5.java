import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

public class carita5 extends JPanel{

    public void paint (Graphics grafico) {
        //color cara
        grafico.setColor(Color.red);
        grafico.fillOval(100, 100, 200, 200);
        grafico. setColor(Color.black) ;
        //cara
        grafico.drawOval(100, 100, 200, 200);
        //ojos izquierdo
        grafico.drawOval(150, 150, 20, 20);
        grafico.setColor(Color.darkGray);
        grafico.fillOval(150, 150, 20, 20);
        grafico.drawLine(150,130,190,150);

        //ojo derecho
        grafico.drawOval(230, 150, 20, 20);
        grafico.setColor(Color. darkGray);
        grafico.fillOval(230, 150, 20, 20);
        grafico.drawLine(220,150,260,130);

        //boca
        grafico.drawLine(150,225,250,225);


    }
}



