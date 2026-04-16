package day_18;
import java.io.FileWriter;
import java.io.IOException;
public class write {
    public static void main(String[] args) {
        String data = "This is a test file.";
        try {
            FileWriter writer = new FileWriter("test.txt");
            writer.write(data);
            writer.close();
        }
        catch (IOException e) {
            System.err.println(e);
        }
    }
}
