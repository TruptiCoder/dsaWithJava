import java.util.*;

public class LeafPath {
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

    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left = insert(root.left , val);
        }
        else{
            //right subtree
            root.right = insert(root.right , val);
        }

        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i = 0; i < path.size(); i++){
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println("Null");
    }

    public static void print(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        print(root.left, path);
        print(root.right, path);
        path.remove(path.size()-1);
    }

    public static void main(String args[]){
        int values[] = {5 , 1 , 3 , 4 , 2 , 7};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        ArrayList<Integer> path = new ArrayList<>();

        print(root, path);
    }
}
