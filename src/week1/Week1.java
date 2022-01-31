/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week1;
import java.util.Scanner;
/**
 *
 * @author manav
 */
public class Week1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] myWord = new char[7];
       /* myWord[0] = 's';
        myWord[1] = 't';
        myWord[2] = 'u';
        myWord[3] = 'd';
        myWord[4] = 'e';
        myWord[5] = 'n';
        myWord[6] = 't';
        for (int i = 0; i < myWord.length; i++) {
            System.out.println(myWord[i]);
        }
        System.out.println("  ");
        System.out.println("printing in reverse");
        for (int i = myWord.length-1; i >= 0; i--) {
            System.out.print(myWord[i]);
        }
        */
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a word");
        System.out.println("Please enter a word");
        String word = sc.nextLine();
        char[] myLetters = new char[word.length()];
        for (int i = 0; i < myLetters.length; i++) {
            myLetters[i] = word.charAt(i);
            System.out.println(myLetters[i]);
        }
        System.out.println("  ");
        System.out.println("printing in reverse");
        for (int i = myLetters.length - 1; i >= 0; i--) {
            System.out.print(myLetters[i]);
        }
    }

}
