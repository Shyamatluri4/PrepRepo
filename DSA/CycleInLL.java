public class CycleInLL {
    
    // check if the linkedlist has a cycle. using Floyd's method.
    public static void detectCycle(linkedlist.Node head){
        if(head==null){
            System.out.println("The list is empty");
        }

        linkedlist.Node fast = head;
        linkedlist.Node slow = head;
        boolean isCycle = false;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
                isCycle=true;
                break;
            }
        }

        if(!isCycle){
            System.out.println("There is no cycle in the list");
            return;
        }

        // removing the cycle in the list.
        System.out.println("There is a cycle in the list");
        slow=head;
        linkedlist.Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        prev.next=null;
        System.out.println("The cycle is removed");
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        linkedlist.Node head = list.new Node("1");
        linkedlist.Node second = list.new Node("2");
        linkedlist.Node third = list.new Node("3");
        linkedlist.Node fourth = list.new Node("4");
        linkedlist.Node fifth = list.new Node("5");

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Creating cycle here: last node points to 'third'
        fifth.next = third;
        
        detectCycle(head);
    }
}
