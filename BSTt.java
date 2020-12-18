import java.util.*;

public class BSTt<Key extends Comparable<Key>, Value> {
    private Node root;             // root of BST

    private class Node {
        private Key key;           // sorted by key
        private Value val;         // associated data
        private Node left, right;  // left and right subtrees
        private int size;          // number of nodes in subtree

        public Node(Key key, Value val, int size) {
            this.key = key;
            this.val = val;
            this.size = size;
            left = null;
            right = null;
        }
    }
    //initialization of tree.
    public BSTt(){
        root = null;
    }

   public boolean isEmpty() {
        if(size() == 0)
        {
            return true;
        }
        return false;
       
    }

    public int size() {
        return size(root);
    }

    // return number of key-value pairs in BST rooted at x
    private int size(Node x) 
    { 
        if(x == null) {
        	return 0;
        }
        else
        {
        	return x.size;
        }
    }   



    // returns the value of the given key if the key is in the symbol table. 
    public Value get(Key key) {
        if(key == null){
            System.out.println("Key is cannot null.");
        }
        return get(root, key);
    }

    private Value get(Node x, Key key) {
        if(x == null) 
        {
            return null;
        }
        int comp = key.compareTo(x.key);
        if(comp < 0) 
        {
            return get(x.left, key);
        }
        else if(comp > 0) 
        {
            return get(x.right, key);
        }
        else{
            return x.val;
        }
    }  

    //inserts the key value pair in the symbol table.
    public void put(Key key, Value val) {
        if(key == null){
            System.out.println("Key cannot be null.");
        }
        root = put(root, key, val);  
    }

    private Node put(Node x, Key key, Value val) {
        if(x == null) 
        {
            return new Node(key, val, 1);
        }
        int cmp = key.compareTo(x.key);
        if(cmp < 0) 
        {
            x.left = put(x.left, key, val);
        }
        else if(cmp > 0) 
        {
            x.right = put(x.right, key, val);
        }
        else{
            x.val = val;
        }
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }

    // returns the minimum key value pair.
    public Key min() 
    {
        if(isEmpty()) {
            System.out.println("Tree is empty.");
        }
        return min(root).key;
    } 

    private Node min(Node x) 
    { 
        if(x.left == null)
        {
            return x;
        }
        else 
        {
            return min(x.left);    
        }
    } 

    //returns the largest key less than or equal to the given key.

   public Key floor(Key key) {
        if(key == null){
            System.out.println("Argument to floor() is null");
        }
        
        if(isEmpty()){
            System.out.println("Tree is empty.");
        }
        Node x = floor(root, key);
        if(x == null) {
            System.out.println("argument floor() is too small");
        }
        return x.key;
    } 

    private Node floor(Node x, Key key) 
    {
        if(x == null) 
        {
            return null;
        }

        int cmp = key.compareTo(x.key);
        if(cmp == 0) 
        {
            return x;
        }

        if(cmp < 0) 
        {
            return floor(x.left, key);
        }

        Node t = floor(x.right, key);
        if(t != null)
        { 
            return t;
        }
        else 
        {
            return x;
        }
    } 



 public Key select(int k) {
        if(k < 0 || k >= size())
        {
        	System.out.println("argument is invalid");
        }    	
        return select(root, k);
    }

    // Return key of rank k. 
    private Key select(Node x, int k) { 
        if(x == null){
            return null;
        }
        int l = size(x.left);
        if(l > k){
            return select(x.left, k);
        }
        else if(l < k){
            return select(x.right, k - 1 -1);
        }
        else {
            return x.key;
        }
    } 



     public Iterable<Key> keys(Key lo, Key hi) 
    {
        if (lo == null){
            System.out.println("First argument to keys() is null");
        }

        if (hi == null){
            System.out.println("Second argument to keys() is null");
        }
        
        Queue<Key> queue = new LinkedList<> ();
        keys(root, queue, lo, hi);
        return queue; 
    } 

    private void keys(Node x,Queue<Key> queue, Key lo, Key hi) 
    { 
       if(x == null) return;

       int cmplo = lo.compareTo(x.key);
       int cmphi = hi.compareTo(x.key);

       if(cmplo < 0) 
       {
            keys(x.left, queue, lo, hi);
       }

       if(cmplo <= 0 && cmphi >= 0) 
       {
            queue.add(x.key);
       }
       
       if(cmphi > 0) 
       {
            keys(x.right, queue, lo, hi); 
       }
    }

     public void deleteMin() {
        
        root = deleteMin(root);
        
    }

    private Node deleteMin(Node x) {
        if (x.left == null)
         return x.right;
        
        x.left = deleteMin(x.left);
        
        x.size = size(x.left) + size(x.right) + 1;
        
        return x;
    }
    public void delete(Key key) {
        root = delete(root, key);
        
    }

    private Node delete(Node x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if      (cmp < 0){
            x.left  = delete(x.left,  key);
        } 
        else if (cmp > 0){
            x.right = delete(x.right, key);
        } 
        else { 
            if (x.right == null){
                return x.left;
            } 
            if (x.left  == null){
               return x.right; 
            } 

            Node t = x;
            x = min(t.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        } 
        x.size = size(x.left) + size(x.right) + 1;
        
        return x;
    } 

  
    public static void main(String[] args) { 
    	
        BSTt<String, Integer> obj = new BSTt<>();  
        obj.put("Ada", 1);
        obj.put("Ballerina",3);
        System.out.println(obj.get("Ada")); 
        obj.put("Html", 5);  
        obj.put("Java", 7);
        System.out.println(obj.get("Java"));
        System.out.println(obj.size()); 
        System.out.println(obj.min());
        System.out.println(obj.floor("Ballerina"));
        System.out.println(obj.select(3));
        System.out.println(obj.keys("Ada","Java"));
        obj.put("Java", 8); 
        obj.put("Dart", 9);
        System.out.println(obj.get("Java"));
        System.out.println(obj.size());
        System.out.println(obj.keys("Ballerina","Java"));

    }
}
