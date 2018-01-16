/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

import java.util.Scanner;

/**
 *
 * @author rio197
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner scanner1 = new Scanner(System.in);
                
                System.out.println("Enter the next line");
                String text = scanner1.nextLine();
                System.out.println("The line you entered is");
                System.out.println(text);
    }
    
}
