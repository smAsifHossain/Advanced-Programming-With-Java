import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sin = new Scanner (System.in);

        //------- STACK STRING ---------
        System.out.println("Enter the size for String in Stack: ");
        Integer stackSizeString = sin.nextInt();
        String flag_0 = sin.nextLine(); //For skipping one blank line
        GenericStack<String> stringStack = new GenericStack<String>(stackSizeString);

        for (int i = 0; i < stackSizeString; i++){
            System.out.println("Enter a text to push on STACK: ");
            String s = sin.nextLine();
            stringStack.push(s);
        }

        //------- STACK INT---------
        System.out.println("Enter the size for Integer in Stack: ");
        Integer stackSizeInt = sin.nextInt();
        GenericStack<Integer> integerStack = new GenericStack<Integer>(stackSizeInt);

        for (int y = 0; y < stackSizeInt; y++){
            System.out.println("Enter a number to push on STACK: ");
            Integer i = sin.nextInt();
            integerStack.push(i);
        }
        String flag_2 = sin.nextLine(); //For skipping one blank line

        //------- QUEUE STRING ---------
        System.out.println("Enter the size for String in Queue: ");
        Integer queueSizeString = sin.nextInt();
        GenericQueue<String> stringQueue = new GenericQueue<String>(queueSizeString);
        String flag_3 = sin.nextLine(); //For skipping one blank line

        for( int c = 0; c < queueSizeString; c++){
            System.out.println("Enter a text to push on QUEUE: ");
            String y = sin.nextLine();
            stringQueue.enqueue(y);
        }

        //------- QUEUE INT ----------
        System.out.println("Enter the size for Integer in Queue: ");
        Integer queueSizeInteger = sin.nextInt();
        GenericQueue <Integer> integerQueue = new GenericQueue <Integer>(queueSizeInteger);
        String flag_1 = sin.nextLine(); //For skipping one blank line

        for (int z = 0; z < queueSizeInteger; z++){
            System.out.println("Enter a number to push on QUEUE: ");
            Integer x = sin.nextInt();
            integerQueue.enqueue(x);
        }

    }
}

