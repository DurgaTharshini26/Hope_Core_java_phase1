package day_18;
import java.io.FileReader;
import java.io.IOException;
public class read {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("test.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        }
        catch (IOException e) {
            System.err.println(e);
        }
    }
}
