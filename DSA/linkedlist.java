public class linkedlist {
    Node head;
    int size;

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

    // reverse list
    public Node reversedList(Node head){
        if(head==null || head.next==null){
           System.out.println("The list is empty or consists of a single element.");
           return head;
        }

        Node prev=head;
        Node current=head.next;
        while(current!=null){
            Node nextNode=current.next;
            current.next=prev;
            
            prev=current;
            current=nextNode;
        }

        head.next=null;
        head=prev;

        return head;
    }
    
    // reverse list using recursion
    public  Node reverseRecursive(Node head){

        if(head==null || head.next==null){
            return head;
        }

        Node newhead = reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newhead;
    }

    // finding and removing the nth node from the start.
    public Node removeNthNode(int n){
        if(head.next==null){
            System.out.println("There is only one element in the list.");
            return null;
        }

        if(n==size){
            return head=head.next;
        }
        
        int i=1;
        int indexToSearch = size-n;
        Node prev=head;
        while(i < indexToSearch){
            prev=prev.next;
            i++;
        }
        size--;
        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addFirst("1");
        list.addLast("7");
        list.addLast("8");
        list.addLast("1");

        
        list.removeNthNode(2);
        list.printList();
        System.out.println(list.size);
    }
}
