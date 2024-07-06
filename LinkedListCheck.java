class Node {
    String value;
    Node next;

    Node(String value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedListCheck {

    public static boolean checkIfCycleExists(Node headNode) {
        if (headNode == null || headNode.next == null) {
            return false;
        }

        Node slow = headNode;
        Node fast = headNode.next;
        //Slow and Fast Pointers are used to see if the loop is present. 
        //Slow moves at 1, Fast at 2.
        //if they meet, i.e. value is same, then loop is present and cycle is there.
        //if not, that means either fast or fast.next reaches null, false of above is triggered.
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

    public static void main(String[] args) {
        // Test case 1
        Node head1 = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        head1.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = head1;
        System.out.println("Test case 1: " + checkIfCycleExists(head1)); 
        // Test case 2
        Node head2 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");
        head2.next = node2;
        node2.next = node3;
        node3.next = null;
        System.out.println("Test case 2: " + checkIfCycleExists(head2));

        // Test case 3
        Node head3 = new Node("1");
        Node node22 = new Node("2");
        Node node33 = new Node("3");
        head3.next = node22;
        node22.next = node33;
        node33.next = head3;
        System.out.println("Test case 3: " + checkIfCycleExists(head3));
    }
}
//Time COmplexity is O(n).