public class NthNodeLL {
    
    // finding and removing the nth node from the start.
    public static linkedlist.Node removeNthNode(int n, linkedlist.Node head, linkedlist list){
        if(head.next==null || head==null){
            System.out.println("The list is empty or has only one element in the list.");
            return head;
        }

        if(n==list.size){
            return head=head.next;
        }
        
        int i=1;
        int indexToSearch = list.size-n;
        linkedlist.Node prev=head;
        while(i < indexToSearch){
            prev=prev.next;
            i++;
        }
        list.size--;
        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addFirst("5");
        list.addLast("8");
        list.addLast("4");
        list.addLast("6");

        removeNthNode(2, list.head, list);
        list.printList();
        System.out.println("Size : "+list.size);
    }
}
