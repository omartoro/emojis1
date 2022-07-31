import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

public class carita7 extends JPanel {

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
        //bola rosada izquierda
        grafico.drawOval(140,180,20,20);
        grafico.setColor(Color.pink);
        grafico.fillOval(140, 180, 20, 20);
        //ojo derecho
        grafico.drawOval(230, 150, 20, 20);
        grafico.setColor(Color. darkGray);
        grafico.fillOval(230, 150, 20, 20);
        //bola rosada derecha
        grafico.drawOval(240,180,20,20);
        grafico.setColor(Color.pink);
        grafico.fillOval(240, 180, 20, 20);
        //boca
        grafico.setColor(Color.black);
        grafico.drawArc(150,175,100,90,180,180);



    }
}



