package day_18;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWrite {
    public static void main(String[] args) {
        try
        {
            BufferedWriter writer=new BufferedWriter(new FileWriter("test.txt"));
            writer.newLine();
            writer.write("Write using FileWriter1");
            writer.newLine();
            writer.write("Write using FileWriter2");
            writer.newLine();
            writer.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

