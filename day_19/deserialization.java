package day_19;
import java.io.*;
public class deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
            FileInputStream fi=new FileInputStream("student.txt");
            ObjectInputStream in=new ObjectInputStream(fi);
            while(true)
            {
                try{
                    student s=(student)in.readObject();
                    System.out.println(s.name+" "+s.marks);
                }
                catch(EOFException e){
                    break;
                }
            }
            fi.close();
            in.close();
                    }
                }