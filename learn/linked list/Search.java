public class Search {
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

    //recursive serach
    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){ //key found
                return i;
            }
            temp = temp.next;
            i++;

        }
        //key not found
        return -1;
    }

    //helper function O(n)
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx + 1;
    }

    //recursive search
    public int recSearch(int key){
        return helper(head, key);
    }

    public static void main(String args[]){
        Search ll = new Search();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));
        System.out.println(ll.recSearch(10));
        System.out.println(ll.recSearch(3));
    }
}
