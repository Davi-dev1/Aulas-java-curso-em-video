import java.util.Locale;

public class LocalDoMundo {
    public static void main(String[] args) {
        Locale local = Locale.getDefault();
        System.out.println("A localização  do seu sistema operacional é : " + local.getDisplayCountry());
    }
}
