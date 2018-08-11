/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringoperations;

import java.util.Scanner;
import operationstobeperformed.CharacterSpilter;
import operationstobeperformed.LengthFinder;
import operationstobeperformed.Reverser;
import operationstobeperformed.WhiteSpaceRemover;
import operationstobeperformed.WordInAWord;

/**
 *
 * @author slinger
 */
public class UserCommands {
    //make objects to get their methods
    Scanner reader = new Scanner(System.in);
    Menu menu = new Menu();
    WhiteSpaceRemover remover = new WhiteSpaceRemover();
    LengthFinder lengthFinder = new LengthFinder();
    CharacterSpilter characterSpilter = new CharacterSpilter();
    Reverser reverser = new Reverser();
    WordInAWord wordInAWord = new WordInAWord();
    
    
    public void getCommnds() {
        
        while(true) {
            System.out.print("Type: ");
            String userCommand = reader.nextLine();
            
            if(userCommand.equals("done")){
                break;
            }
            else if(userCommand.equals("menu")){
                menu.printMenu();
            }
            else if(userCommand.equals("remover")){
                remover.removeWhiteSpace();
            }
            else if(userCommand.equals("length")){
                lengthFinder.findLength();
            }
            else if(userCommand.equals("character")){
                characterSpilter.Spilter();
            }
            else if(userCommand.equals("reverse")){
                reverser.reverse();
            }
            else if(userCommand.equals("contains")){
                wordInAWord.wordInAWordChecker();
            }
            else{
                System.out.println("Type a command from the menu.");
            }
           
            
        }
        
    }
    
}
