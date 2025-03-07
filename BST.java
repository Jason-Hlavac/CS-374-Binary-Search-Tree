public class BST {
    private Node head;
    private String title;

    //Default Constructor
    public BST(String newTitle) {
        head = null;
        title = newTitle;
    }

    //Getters and Setters
    public Node get_head(){
        return head;
    }
    public void set_head(Node newNode) {
        head = newNode;
    }
    public String get_title(){
        return title;
    }
    public void set_title(String newTitle) {
        title = newTitle;
    }

    //Insert
    public void insert(Node newNode){
        //If there is no head, set new node as head and return
        if(head == null){
            head = newNode;
            return;
        }else{
        //Use the recursive helper function to find the node you need to append to
            insertRecur(newNode, head);
        }
    }

    //Helper function for insert to recursively insert the new node in the correct spot
    private Node insertRecur(Node newNode, Node currNode){
        if(currNode == null){
            return newNode;
        }
        //Used <= in insert
        if(newNode.get_num() <= currNode.get_num()){
            currNode.set_left(insertRecur(newNode, currNode.get_left()));
        }else{
            currNode.set_right(insertRecur(newNode, currNode.get_right()));
        }
        
        return currNode;
    }

    //Delete
    public void delete(int x){
        //Call the recursive helper function on the head
        deleteRecur(get_head(), x);
    }

    private Node deleteRecur(Node currNode, int x){
        //return if nothing there
        if(currNode == null){
            return currNode;
        }
        //Navigate to the left, right, or found the node
        if(currNode.get_num() < x){
            currNode.set_left(deleteRecur(currNode.get_left(), x));
        }else if(currNode.get_num() > x){
            currNode.set_right(deleteRecur(currNode.get_right(), x));
        }else{
            //If atleast one of the pointers is null
            if(currNode.get_left() == null){
                return currNode.get_right();
            }else if(currNode.get_right() == null){
                return currNode.get_left();
            }else{
            //If both pointers are not null swap with the right down the tree until open
                Node temp = currNode.get_right();
                while(temp != null && temp.get_left() != null){
                    temp = temp.get_left();
                }
                currNode.set_num(temp.get_num());
                currNode.set_text(temp.get_text());
                currNode.set_right(deleteRecur(currNode.get_right(), temp.get_num()));
            }
        }

        return currNode;

    }

    
    //Print
    public void inorder(){
        System.out.println(get_title() + ": Inorder Traversal");
        System.out.println("-----------------------");
        inorderRecur(get_head());
    }

    public void inorderRecur(Node root)
    {
        if (root != null) {
            inorderRecur(root.get_left());
            if(root.get_text() == null){
                System.out.print(root.get_num() + " ");
            }else{
                System.out.print("(" + root.get_num() + " - " + root.get_text() + ") ");
            }
            inorderRecur(root.get_right());
        }
    }

    //Find Node
    public Node find(int value){
        Node currNode = get_head();
        while(currNode != null && currNode.get_num() != value){
            if(currNode.get_num() > value){
                currNode = currNode.get_left();
            }else{
                currNode = currNode.get_right();
            }
        }
        return currNode;
    }

    //Find Min Function
    public Node findMin(){
        Node currNode = get_head();
        while(currNode.get_left() != null){
            currNode = currNode.get_left();
        }
        return currNode;
    }

    //Find Max Function
    public Node findMax(){
        Node currNode = get_head();
        while(currNode.get_right() != null){
            currNode = currNode.get_right();
        }
        return currNode;
    }

    
}