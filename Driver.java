import java.util.Random;

public class Driver {
    public static void main(String[] args) throws Exception {
//Movie Ratings Example
        BST movieBST = new BST("Movie BST");
        movieBST.insert(new Node(50, "Casablanca"));
        movieBST.insert(new Node(75, "Jaws"));
        movieBST.insert(new Node(25, "Gone with the Wind"));
        movieBST.insert(new Node(80, "Planet of the Apes"));
        movieBST.insert(new Node(13, "Dr. No"));
        movieBST.insert(new Node(90, "Carrie"));
        movieBST.insert(new Node(8, "Lawrence of Arabia"));
        movieBST.insert(new Node(51, "The Three Musketeers"));
        movieBST.insert(new Node(52, "Accident"));
        movieBST.delete(52);
        //Print the Movie tree
        movieBST.inorder();
        //Find the lowest and highest rated movues
        System.out.println("");
        System.out.println("Lowest Rated: " + movieBST.findMin().get_text());
        System.out.println("Highest Rated: " + movieBST.findMax().get_text());

        System.out.println("\n");

//Sorting a List example
        int[] unsortedArr = new int[25];
        Random rand = new Random();
        //Populate list with 25 random integers
        for(var i = 0; i < 25; i++){
            unsortedArr[i] = rand.nextInt(100);
            System.out.print(unsortedArr[i] + " ");
        }

        //Put the values into the BST
        System.out.println("\n");
        BST sortingBST = new BST("Sorted Integers");
        for(var i = 0; i < 25; i++){
            sortingBST.insert(new Node(unsortedArr[i]));
        }
        //Print the sorted BST
        sortingBST.inorder();
        System.out.println("\n");

//Phone Book Example
        BST phoneBST = new BST("Phone Book");
        phoneBST.insert(new Node(1234567891, "Sam"));
        phoneBST.insert(new Node(1234567892, "Corbin"));
        phoneBST.insert(new Node(1234567881, "Mark"));
        phoneBST.insert(new Node(1459258546, "Edward"));
        phoneBST.insert(new Node(1459258567, "Sara"));
        phoneBST.insert(new Node(1459458546, "Lauren"));
        phoneBST.insert(new Node(2059258546, "Omar"));
        phoneBST.insert(new Node(1459258367, "Kat"));
        phoneBST.insert(new Node(1459278746, "Erin"));

        //Print the Phonebook:
        phoneBST.inorder();
        System.out.println("\n");
        //Find who has the phone number 1459258546
        System.out.println("Owner of phone number 1459258546: " + phoneBST.find(1459258546).get_text());
    }
}
