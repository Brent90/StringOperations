/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operationstobeperformed;

import java.util.Scanner;

/**
 *
 * @author slinger
 */
public class Reverser {

    Scanner reader = new Scanner(System.in);

    public void reverse() {
        System.out.print("Word: ");
        String word = reader.nextLine();
        //the .toLowerCase() will help with palindromes. example: RaceCAR = rAcEcar
        String cleanedUpWord = word.replaceAll("\\s", "").toLowerCase();
        
        
        //make empty string to add last index of word to
        String reverse = "";
        
        //reversing word here
        for(int i =1; i <= word.length(); i++) {
            reverse += word.charAt(word.length()-i);
        }
        
        System.out.println("Word in reverse: " + reverse);
        
        String cleanedUpWordInReverse = reverse.toLowerCase();
        
       //quick palindrome check
        
        if(cleanedUpWord.equals(cleanedUpWordInReverse)){
            System.out.println("Is " + word + " a palindrome? Yes." );
        }
        else{
            System.out.println("Is " + word + " a palindrome? No.");
        }
        
        System.out.println("");
       
        
    }

}
