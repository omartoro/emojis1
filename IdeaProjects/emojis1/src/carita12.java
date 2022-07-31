import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

public class carita12 extends JPanel {

    public void paint (Graphics grafico) {


        //cuadrado
        grafico.setColor(Color.red);
        grafico.drawRect(120,100,180,100);
        grafico.fillRect(120,100,180,100);
        //asta
        grafico.setColor(Color.gray);
        grafico.drawRect(100,100,20,190);
        grafico.fillRect(100,100,20,190);

    }

}
