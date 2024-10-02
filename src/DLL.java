class DLL {
    private Node head;
    private int size;

    DLL(){
        this.size = 0;
    }

    //Node
    class Node {
        String data;
        Node next;
        Node prev; // Reference to the previous node

        Node(String data) {
            this.data = data;
            this.next = null;
            this.prev = null;
            size++;
        }
    }

    // Add to the first position
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode; // Set previous link from old head to new node
        head = newNode;
    }

    // Add to the last position
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
        newNode.prev = currNode; // Set previous link from new node to the last node
    }

    // Print the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " <-> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // Delete first node
    public void deleteFirst(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;  // Only one element
            return;
        }
        head = head.next;
        head.prev = null; // Remove backward reference from the new head
    }

    // Delete last node
    public void deleteLast(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null){
            head = null;  // Only one element
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.prev.next = null;  // Remove reference to the last node
    }

    // Get size of the list
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.addFirst("a");
        list.addFirst("is");

        list.printList();
        list.addLast("list");
        list.printList();
        list.addFirst("This");
        list.printList();

        list.deleteLast();
        list.printList();

        list.deleteFirst();
        list.printList();

        System.out.println("Size of the list: " + list.getSize());
    }
}
