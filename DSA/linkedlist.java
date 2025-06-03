public class linkedlist {
    Node head;
    private int size;

    linkedlist(){
        this.size=0;
    }
    
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    // add - first 
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;   
        }

        newNode.next=head;
        head=newNode;
        
    }
    // add last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node curNode = head;
        while(curNode.next!=null){
            curNode=curNode.next;
        }

        curNode.next=newNode;
    }
    
    // print
    public void printList(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }

        Node curNode=head;
        while(curNode!=null){
            System.out.print(curNode.data + "-->");
            curNode=curNode.next;
        }

        System.out.println("NULL");
    }
    
    // remove - first 
    public void removeFirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head.next=head;
    }

    // remove - last
    public void removeLast(){
        if(head==null){
           System.out.println("The list is empty");
           return;
        }
        size--;

        if(head.next==null){
            head=null;
            return;
        }

        Node secondLast = head;
        Node last = head.next;
        while(last.next!=null){
            secondLast=secondLast.next;
            last=last.next;  
        }

        secondLast.next=null;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addFirst("5");
        list.addLast("8");
        list.addLast("7");

        list.printList();
        System.out.println(list.getSize());
    }
}
