public class AVL{
    static class Node{
        int data , height;
        Node left , right;

        Node(int data){
            this.data = data;
            height = 1;
        }
    }

    public static Node root;

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return root.height;
    }

    static int max(int a , int b){
        return (a > b) ? a : b;
    }

    //Left Rotate
    public static Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;

        //Perform rotation
        y.left = x;
        x.right = T2;

        //Update heights
        x.height = max(height(x.left) , height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        //Return new root
        return y;
    }

    //Right rotation
    public static Node rightRotate(Node y){
        Node x = y.left;
        Node T2 = x.right;

        //perform rotation
        x.right = y;
        y.left = T2;

        //Update heights
        y.height = max(height(y.left) , height(y.right)) + 1;
        x.height = max(height(x.left) , height(x.right)) + 1;

        // return new root
        return x;

    }

    public static int getBalance(Node root){
        if(root == null){
            return 0;
        }
        return height(root.left) -height(root.right);
    }

    public static Node insert(Node root , int key){
        if(root == null){
            return new Node(key);
        }
        if(key < root.data){
            root.left = insert(root.left , key);
        }
        else if(key > root.data){
            root.right = insert(root.right , key);
        }
        else{
            return root; //Duplicate keys are not allowed
        }

        //Update root height
        root.height = 1 + Math.max(height(root.left), height(root.right));

        //Get root's balance factor
        int bf = getBalance(root);

        //Left Left case
        if(bf > 1 && key < root.left.data){
            return rightRotate(root);
        }

        //RR case
        if(bf < -1 && key > root.right.data){
            return leftRotate(root);
        }

        //LR case
        if(bf > 1 && key > root.left.data){
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        //RL case
        if(bf < -1 && key < root.right.data){
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root; //returned if AVL balanced
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String args[]){
        root = insert(root , 10);
        root = insert(root , 20);
        root = insert(root , 30);
        root = insert(root , 40);
        root = insert(root , 50);
        root = insert(root , 25);

        preorder(root);
        System.out.println();
    }
}