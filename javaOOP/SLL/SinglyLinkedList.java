public class SinglyLinkedList {
    public Node head = null;
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void printValues() {
        if (head == null) {
            System.out.println("this list is empty");
        }
        else {
            System.out.println("the list contains: ");
            Node runner = head;
            while(runner != null) {
                System.out.println(runner.value + " -> ");
                runner = runner.next;
            }
        }
    }
    public void remove() {
        if (head == null) {
            System.out.println("this list is now empty");
        }
        else if (head.next == null) {
            head = null;
        }
        else {
            Node runner = head;
            while(runner.next != null) {
                if (runner.next.next == null) {
                    runner.next = null;
                    System.out.println("the last item in the list has been removed");
                }
                else {
                    runner = runner.next;
                }
            }
        }
    }
}