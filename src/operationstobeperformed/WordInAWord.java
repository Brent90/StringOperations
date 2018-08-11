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
public class WordInAWord {
    Scanner reader = new Scanner(System.in);
    
    public void wordInAWordChecker() {
        System.out.print("Type a word: ");
        String wordOne = reader.nextLine();
        String wordOneToLowerCase = wordOne.toLowerCase();
        
        System.out.print("Type another word: ");
        String wordTwo = reader.nextLine();
        String wordTwoToLowerCase = wordTwo.toLowerCase();
        
        if(wordOneToLowerCase.contains(wordTwoToLowerCase)){
            System.out.println(wordOne + " contains " + wordTwo);
        }else{
            System.out.println(wordOne + " does not contain " + wordTwo);
        }
        
        System.out.println("");
        
        
    }
    
}
