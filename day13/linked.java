package day13;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;

    public void inserAtStart(int data){
        Node nn = new Node(data);
        if(head == null){
            head = nn;
            return;
        }
        nn.next = head;
        head = nn;
    }

    public void insertAtEnd(int data){
        Node nn = new Node(data);

        if(head == null){
            head = nn;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = nn;
    }
    public void insertAtpos(int pos,int data){
        if(pos == 0){
            inserAtStart( data);
            return;
        }
        Node nn = new Node(data) ;
        Node temp = head;
        for(int i=0;i<pos;i++){
            if(temp == null) break;
            temp = temp.next;
        }
        nn.next = temp.next;
        temp.next = nn;


    }

    public void insert(int data, int prev){
        Node nn = new Node(data);
        Node temp = head;

        while(temp != null && temp.data != prev){
            temp = temp.next;
        }

        if(temp == null){
            System.out.println("Value not found");
            return;
        }

        nn.next = temp.next;
        temp.next = nn;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void deleteAtStart(){
        if(head == null) return;
        head = head.next;
    }
    public void deleteAtend(){
         if(head == null) return;
         Node temp = head;
         while(temp.next.next != null){
            temp = temp.next;
         }
         temp.next = null;
    }
    public void deleteatpos(int pos){
        if(head == null) return;
        if(pos == 0){
            deleteAtend();
        }
        Node temp = head;
        for(int i=0;i<pos - 1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;



    }
    public void reverse(){
        Node temp = head;
        LinkedList n = new LinkedList();       
        while(temp.next != null){
           n.inserAtStart(temp.data);
           temp = temp.next;
        }
        n.display();
    }

}

public class linked {
    public static void main(String[] args){
        LinkedList l = new LinkedList();
        l.inserAtStart(5);
        l.insertAtEnd(10);
        l.insert(7, 5); // insert 7 after 5
        l.insertAtEnd(11);
        l.insertAtEnd(12);
        l.insertAtEnd(13);
        // l.deleteAtend();
        l.deleteatpos(2);

        l.display();
        System.out.println(l);
    }
}
