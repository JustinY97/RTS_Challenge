/*                                                                      *
 * Programmer: Justin York                                              *
 * Date: 4/28/2021                                                      *
 * Description: Given an input string, Shifts the string by X amount    *
 *                                                                      */
import java.util.Scanner;

public class RTS_LABS_CHALLENGE2 {
    
    // Shifting right for positive values
    public static void shiftRight(char[] ch, int shift){
        
        // Shifting the array for value of N
        char temp;
        for(int i = 0; i < shift; i++){

            // Store last element in array since it will be lost
            temp = ch[ch.length - 1];

            // Shifting every character to the right
            for(int j = ch.length - 2; j >= 0; j--){
                ch[j + 1] = ch[j];
            }

            /* Putting the element tat was on the far right that    *
             * was stored in temp at the beginning of shifted array */
            ch[0] = temp;
        }

        // Printing characters in array
        printArray(ch);
    }

    // SHifting Left for Negative Values
    public static void shiftLeft(char[] ch, int shift){
        char temp;
        shift *= -1;
        for(int i = 0; i < shift; i++){

            // Store last element in array since it will be lost
            temp = ch[0];

            // Shifting every character to the right
            for(int j = 0; j < ch.length - 1; j++){
                ch[j] = ch[j + 1];
            }

            /* Putting the element tat was on the far right that    *
             * was stored in temp at the beginning of shifted array */
            ch[ch.length - 1] = temp;
        }

        // Printing characters in array
        printArray(ch);
    }

    public static void printArray(char[] ch){
        for(char c : ch)
            System.out.print(c);
    }
    public static void main(String[] args){
        String string;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter String: ");
        string = scan.nextLine();
        
        char[] characters = new char[string.length()];

        for(int i = 0; i < string.length(); i ++){
            characters[i] = string.charAt(i);
        }

        // Value to rotate string by
        System.out.print("Shift by: ");
        int shift = scan.nextInt();

       // Calling sorting function
        if(shift > 0)
            shiftRight(characters, shift);
        else if(shift < 0)
            shiftLeft(characters, shift);
        if(shift == 0)
            printArray(characters);

        scan.close();
    }
}
