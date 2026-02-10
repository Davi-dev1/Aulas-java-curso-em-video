import java.awt.*;
import java.sql.SQLOutput;

public class ResoluçãoDoSistema {
    public static void main(String[] args) {

        Toolkit resolução = Toolkit.getDefaultToolkit();
        Dimension tamanhoTela = resolução.getScreenSize();
        System.out.println("A resolução de sua tela é  de aproximadamente : ");
        System.out.println("Largura máxima : " +tamanhoTela.width + " pixels ");
        System.out.println("A Altura máxima : " +tamanhoTela.height + " pixels " );





        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] dispositivo = ge.getScreenDevices();
        System.out.println("\n Informações detalhadas de todas as telas : ");
        for(int contador  = 0; contador< dispositivo.length; contador++){
            DisplayMode modo = dispositivo[contador].getDisplayMode();
            System.out.println(" Tela " +(contador+1) + " : ");
            System.out.println(" Largura : " +modo.getWidth() + " pixels");
            System.out.println(" Altura : "+ modo.getHeight() + " pixels ");
            System.out.println(" Profundidade da cor : " +modo.getBitDepth() + " bits");
            System.out.println(" Frame Rate : " +modo.getRefreshRate() + " Hz ");




        }
        //Resolução da tela (DPI)

        int dpi = resolução.getScreenResolution();
        System.out.println("\nResolução DPI : " + dpi);

    }


}
