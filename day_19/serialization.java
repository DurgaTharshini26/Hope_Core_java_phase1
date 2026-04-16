package day_19;
//object serialization is the process of converting an object into a byte stream, which can be easily saved to a file or transmitted over a network. In Java, this is typically done using the Serializable interface and ObjectOutputStream class. The Serializable interface is a marker interface that indicates that a class can be serialized, while the ObjectOutputStream class is used to write the object to an output stream. To serialize an object, you need to implement the Serializable interface in your class and then use an ObjectOutputStream to write the object to a file or other output stream. 
import java.io.Serializable;
class student implements Serializable{
    int id;
    String name;
    student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}
public class serialization {
    
}
