/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringoperations;

import java.util.Scanner;

/**
 *
 * @author slinger
 */
public class StringOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //make menu object and call it's method to print it
        Menu menu = new Menu();
        menu.printMenu();
        
        //make UserCommands object to get user input
        UserCommands userCommands = new UserCommands();
        userCommands.getCommnds();
        
        
        
    }
    
}
