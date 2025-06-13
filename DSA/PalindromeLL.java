public class PalindromeLL {
    
    // to check if it is a pallindrome
    public static boolean checkPalindrome(linkedlist.Node head,linkedlist list){
        
        if(head==null || head.next==null){
            return true;
        }

        linkedlist.Node slowNode = head;
        linkedlist.Node fastNode = head;
        while(fastNode!=null && fastNode.next!=null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        
        // reversing the second half
        linkedlist.Node secondHalf = list.reversedList(slowNode);
        linkedlist.Node secondHalfCopy = secondHalf;  //restoring the second half
        linkedlist.Node firstHalf = head;
        while(secondHalf!=null){
            if(firstHalf.data!=secondHalf.data){
                return false;
            }

            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
        }

        list.reversedList(secondHalfCopy);
        return true;

    }
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addFirst("2");
        list.addLast("1");
        list.addLast("1");
        list.addLast("2");

        list.printList();
        boolean result = checkPalindrome(list.head, list);
        if(result){
            System.out.println("It is a palindrome.");
        }
        else{
            System.out.println("It is not a palindrome.");
        }
    }
}
