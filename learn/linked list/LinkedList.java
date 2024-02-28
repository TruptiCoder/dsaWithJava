public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //Adding the node at beginning O(1)
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        //If list is empty
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;  // Link
        head = newNode;
    }
    
    //Printing the list O(n)
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Adding node at end O(1)
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //Adding element at specific position
    public void add(int index , int data){
        if(index == 0 || head == null){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //Removing first node
    public int removeFirst(){
        if(size == 0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //Removing the last node
    public int removeLast(){
        if(size == 0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : i = size-2
        Node prev = head;
        for(int i = 0; i < size-2; i++){
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    //In a static function we can directly call only the static fuctions. but in this case our main function is static but we won't call it directly we will call through the object therefore it doesn't matter fuctions are static or not
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2 , 3);
        ll.print();
        // System.out.println("size of linked list is " + size);
        ll.removeFirst();
        ll.print();
        // System.out.println("size of linked list is " + size);
        ll.removeLast();
        ll.print();
    }
}
