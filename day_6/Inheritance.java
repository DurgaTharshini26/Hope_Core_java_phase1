package day_6;

import org.omg.PortableInterceptor.INACTIVE;

class notification
{
    String name;
    String message;
    String email;
    void send()
    {
        System.out.println("Notification sent from parent class");
    }
    void change_email()
    {
        System.out.println("email changed");
    }
    notification(String message,String name)
    {
        this.message=message;
        this.name=name;
    }
    }
class emailnotification extends notification
{
    emailnotification(String message,String name)
    {
        super(message,name);
    }
    void send()
    {
        System.out.println("Email Notification sent "+name);
    }
    void change_email()
    {
        System.out.println("Email changed:"+email);
    }
}
class smsnotification extends notification
{
    smsnotification(String message, String name)
    {
        super(message,name);
    }
    void send()
    {
        System.out.println("SMS Notification sent to"+name);
        System.out.println("message :"+message);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        //notification n =new emailnotification("hi","tharsh"); ;
        //n.change_email();//cant access change_email method using parent class reference because its not present in parent class
       // n.send();
       // notification n;
        notification []n={new emailnotification("hello","Tharsh"),new smsnotification(  "hi","Anandan")};
        for(notification i:n)
        {
            i.send();
        }
        //emailnotification s;
        //with single reference variable we can access both email and sms notification by changing the object reference
       // n=new emailnotification("hello","Tharsh","tharsh@123");
       // s=new emailnotification("hi","tharsh","gscf");
     //  n.send();
       //n.change_email();
       //n=new smsnotification("hi","Anandan","hvgt");
       //n.send();
       
    }
}
