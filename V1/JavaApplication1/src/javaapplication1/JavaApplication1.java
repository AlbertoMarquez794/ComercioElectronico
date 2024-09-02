/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author sdist
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Programa sin argumentos");
        }
        for (int i=0; i < args.length; i++){
            System.out.println("args[" + i + "]:" + args[i]);
        }
        
    }
    
}
