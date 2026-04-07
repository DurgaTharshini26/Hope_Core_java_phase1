package day_13;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Linkedlist
{
    Node head;
    public void insertAtstart(int data)
    {
        Node newNode =new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtend(int data)
    {
        Node newnode=new Node(data);
        Node temp=head;
        if(head==null)
        {
            head=newnode;
            return;
        }
        while(temp.next!=null)
        {
            temp=temp.next; 
        }
        temp.next=newnode;
        newnode.next=null;
    }
    public void insertAtposition(int position,int data)
    {
        Node newnode=new Node(data);
        if(position==0)
        {
            newnode.next=head;
            head=newnode;
            return;
        }
        Node temp=head;
        for(int i=0;i<position-1;i++)
        {
            if(temp==null)
            {
                System.out.println("position is out of range");
                return;
            }
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;

    }
    public void deleteAtstart()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        head=head.next;
    }
    public void deleteAtend()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
    public void deleteAtposition(int position)
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        if(position==0)
        {
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=0;i<position-1;i++)
        {
            if(temp==null)
            {
                System.out.println("position is out of range");
                return;
            }
            temp=temp.next;
        }
        if(temp.next==null)
        {
            System.out.println("position is out of range");
            return;
        }
        temp.next=temp.next.next;

    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public Node reverseList(Node head)
    {
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}
public class Linked {
  public static void main(String[] args) {
    Linkedlist list=new Linkedlist();
    list.insertAtend(10);
    list.insertAtend(20);
    list.insertAtstart(5);
    list.insertAtstart(1);
    list.insertAtposition(2, 15);
    list.deleteAtstart();
    list.deleteAtend();
    list.deleteAtposition(1);
    list.display();
  }

}
