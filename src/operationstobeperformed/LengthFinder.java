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
public class LengthFinder {

    Scanner reader = new Scanner(System.in);

    public void findLength() {
        //see if user wants to include whitespaces or not
        System.out.print("Count whites spaces? (yes/no): ");

        while (true) {
            String response = reader.nextLine();
            if (response.equals("yes")) {
                //calls method to include whitespaces
                findLengthWithWhiteSpaces();
                break;
            } else if (response.equals("no")) {
                //calls method to not include whitespaces
                findLengthWithoutWhiteSpaces();
                break;
            } else {
                System.out.print("Either type 'yes' or 'no': ");
            }
        }
    }
    
    public void findLengthWithWhiteSpaces() {
        System.out.print("Word: ");
        String wordGiven = reader.nextLine();
        System.out.println("Length: " + wordGiven.length());
        System.out.println("");
    }
    
    public void findLengthWithoutWhiteSpaces(){
        System.out.print("Word: " );
        String wordGiven = reader.nextLine();
        //some regex for you \\s removes white spaces
        wordGiven = wordGiven.replaceAll("\\s", "");
        System.out.println("Length: " + wordGiven.length());
        System.out.println("");
    }

}
