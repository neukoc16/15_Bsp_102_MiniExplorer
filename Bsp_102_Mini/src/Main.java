
import java.io.File;

public class Main {

    public static void main(String[] args) {
        File dir = new File("D:\\");
        for (File f : dir.listFiles()) {
            if (f.isDirectory()) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.println(f.getAbsolutePath());
        }
    }
}
