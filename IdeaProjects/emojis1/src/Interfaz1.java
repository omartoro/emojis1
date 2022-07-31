import java.awt.Graphics;
import javax. swing.JFrame;
import javax. swing.JPanel;
import java.util.Scanner;

public class Interfaz1 extends JPanel {
    private static int num=0;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        JFrame ventana = new JFrame("Emojis");

        carita1 caritauno = new carita1();
        carita2 caritados = new carita2();
        carita3 caritatres = new carita3();
        carita4 caritacuatro = new carita4();
        carita5 caritacinco = new carita5();
        carita6 caritaseis = new carita6();
        carita7 caritasiete = new carita7();
        carita8 caritaocho = new carita8();
        carita9 caritanueve = new carita9();
        carita10 caritadiez = new carita10();
        carita11 caritaonce = new carita11();
        carita12 caritadoce = new carita12();


        do {
            do {

                System.out.println("menú de emojis");
                System.out.println("ingrese 1 para carita feliz");
                System.out.println("ingrese 2 para carita triste");
                System.out.println("ingrese 3 para carita de asombro");
                System.out.println("ingrese 4 para carita llorando");
                System.out.println("ingrese 5 para carita emputada");
                System.out.println("ingrese 6 para carita fachera facherita");
                System.out.println("ingrese 7 para carita sonrojada");
                System.out.println("ingrese 8 para carita de vomito");
                System.out.println("ingrese 9 para carita de angel");
                System.out.println("ingrese 10  para carita con lentes");
                System.out.println("ingrese 11 para bandera verde");
                System.out.println("ingrese 12 para bandera roja");
                System.out.println("ingrese 13 para salir");
                System.out.print("ingrese una opcion: ");
                num = entrada.nextInt();
            } while (num < 1 || num > 13);

            switch (num) {
                case 1:
                    ventana.add(caritauno);
                    break;
                case 2:
                    ventana.add(caritados);
                    break;
                case 3:
                    ventana.add(caritatres);
                    break;
                case 4:
                    ventana.add(caritacuatro);
                    break;
                case 5:
                    ventana.add(caritacinco);
                    break;
                case 6:
                    ventana.add(caritaseis);
                    break;
                case 7:
                    ventana.add(caritasiete);
                    break;
                case 8:
                    ventana.add(caritaocho);
                    break;
                case 9:
                    ventana.add(caritanueve);
                    break;
                case 10:
                    ventana.add(caritadiez);
                    break;
                case 11:
                    ventana.add(caritaonce);
                    break;
                case 12:
                    ventana.add(caritadoce);
                    break;

            }

            ventana.setSize(400, 400);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        } while (num != 13);
    }
}
