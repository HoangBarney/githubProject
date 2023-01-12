
/**
 * Final Project
 *
 * Hoang Barney
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Demo {

    public static void main( String [] args) { 
        Scanner input = new Scanner(System.in);
        NoteList note = new NoteList();
        
        int userChoose = 0;
        while (userChoose != 3) {
            System.out.println("");
            System.out.println("----- Welcome to Note Grocery List------");
            System.out.println("---You can add items in this note and check how much those items will be ---");
            System.out.println("-1- Do you want to add item to this list? ");
            System.out.println("-2- Display list and total number of items included price. ");
            System.out.println("-3- Exit. ");
            userChoose = input.nextInt();  

            if (userChoose == 1) {
                note.addItem();
            }

            if (userChoose == 2) {
            note.AllList();
            note.Say();
            
            }
        }
    }
}