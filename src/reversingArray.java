

import java.util.Arrays;
import java.util.Scanner;

    public class reversingArray {

        public static void main(String[] args) {
            int size; //size var to store userInput
            int[] array;// empty array named array
            Scanner scanner = new Scanner(System.in);// scanner object named scanner created

            /* do will run one time to ask user to input a desired nb */
            do {
                System.out.print("Enter a size:"); //print out message to get user input
                size = scanner.nextInt(); // assign that input to size
               //comnditional statements to check whether the size iput exceed 20 (personal reference)
                if (size > 20)
                    System.out.println("Size does not exceed 20");

            } while (size > 20);
            array = new int[size];// assign previously created array to newly created size opbject
            int i = 0; //set i= 0 to run while loop underneath
            /* WHILE LOOP run and establish an array of input digits */
            while (i < array.length) { //while loop will run as the length of the input element
                System.out.print("Enter element " + (i + 1) + ": ");//  user fill the array. i + 1 needed since we start from 0
                array[i] = scanner.nextInt();//assign element input to each element as the loop run
                i++;//increment

            }
            /* by this point we have successfully received desired array elements.
            1. Now we will use for loop to print them out, and adjust the spacing with \t === one time pressing tab
            2. Another for loop used j, this time for loop will reverse the array   */


            System.out.printf("%-20s%s", "Elements in array: ", ""); //
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
//            System.out.println(Arrays.toString(array));

            for (int j = 0; j < array.length / 2; j++) {
                int temp = array[j];
                array[j] = array[size - 1 - j];
                array[size - 1 - j] = temp;
            }
           System.out.printf("\n%-20s%s", "Reverse array: ", "");
            for (int j = 0; j < array.length; j++) {
               System.out.print(array[j] + "\t");
          }
        }
    }

