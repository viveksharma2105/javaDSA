class LL {
    private Node head;
    private int size;

    LL(){
        this.size = 0;
    }


    //Node
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }

    }

    //add first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add in last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }


    //print
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    //delete First
    public void deleteFirst(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }


    //delete Last
    public void deleLast(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if (head.next == null){
            head = null;
            return;
        }
        Node seclast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode =lastNode.next;
            seclast = seclast.next;
        }
        seclast.next = null;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");

        list.printList();
        list.addLast("list");
        list.printList();
        list.addFirst("This");
        list.printList();

        list.deleLast();
        list.printList();

        list.deleteFirst();
        list.printList();

        list.getSize();
        System.out.println(list.getSize());

    }

}





