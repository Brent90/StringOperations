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
public class WhiteSpaceRemover {
    Scanner reader = new Scanner(System.in);
    
    public void removeWhiteSpace() {
         
         System.out.print("Word to remove whitespaces? ");
         String word = reader.nextLine();
         word = word.replaceAll("\\s", "");
         System.out.println("Without whitespaces: " + word);
         System.out.println("");
         
    }
    
}
