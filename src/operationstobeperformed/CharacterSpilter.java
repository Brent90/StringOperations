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
public class CharacterSpilter {

    private Scanner reader = new Scanner(System.in);

    public void Spilter() {
        System.out.print("Type word to split it into its characters: ");
        String word = reader.nextLine();
        word = word.replaceAll("\\s", "");

        for (int i = 0; i < word.length(); i++) {
            //keeps text aligned to look better if word is more than 10 characters
            if (i < 9) {
                System.out.println((i + 1) + ".  character: " + word.charAt(i));
            } else {
                System.out.println((i + 1) + ". character: " + word.charAt(i));

            }
        }

        System.out.println("");
    }

}
