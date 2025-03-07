//BST placement is decided based on Num. String is for impactful implementations
public class Node {
    private Node left;
    private Node right;
    private int num;
    private String text;
    
    // Default Constructor
    public Node(int value){
        left = null;
        right = null;
        num = value;
        text = null;
    }

    // Overloaded Constructor
    public Node(int value, String newText){
        left = null;
        right = null;
        num = value;
        text = newText;
    }

    // Getters and Setters
    public Node get_left(){
        return left;
    }
    public void set_left(Node newNode){
        left = newNode;
    }
    public Node get_right(){
        return right;
    }
    public void set_right(Node newNode){
        right = newNode;
    }
    public int get_num(){
        return num;
    }
    public void set_num(int newNum){
        num = newNum;
    }
    public String get_text(){
        return text;
    }
    public void set_text(String newText){
        text = newText;
    }
}
