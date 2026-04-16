package day_18;
import java.io.File;
import java.io.IOException;
public class filehandling {
    public static void main(String[] args) {
        File newFile = new File("test.txt");
        try {
            if(newFile.createNewFile()) {
                System.err.println("File created: " + newFile.getName());
            }
            else
            {
                System.out.println("not able to create file");
            }
        }
         catch (IOException e) {
            System.err.println("e.getMessage() = " + e.getMessage());
            e.printStackTrace();
        }
    }
}
