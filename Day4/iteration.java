import java.util.LinkedList;
im 
public class iteration {

    public static void main(String[] args) {
        /*
         * Create an empty LinkedList
         */
        LinkedList<integer> list = new LinkedList<integer>();

        // Add values to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(9);
        list.add(11);
        
        // Iterate using do while loop
     System.out.print("Iterating the linked list using do while loop : ");
        int i = 0;
        do {
            System.out.print(list.get(i) + " ");
            i++;
        }
     while(i < list.size());

    }
}
</integer></integer>