public class Mirror {
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node mirror(Node root){
        if(root == null){
            return null;
        }
        Node lefts = mirror(root.left);
        Node rights = mirror(root.right);
        root.left = rights;
        root.right = lefts;

        return root;
    }

    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        inorder(root);
        System.out.println();

        mirror(root);

        inorder(root);
        System.out.println();

    }
}
