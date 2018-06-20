/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmorse;

import java.util.Scanner;

/**
 *
 * @author Toro
 */
public class Cmorse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] letras= {' ','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j','k', 'l', 'm',
			'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v','w', 'x', 'y', 'z', '1', '2',
			'3', '4', '5', '6', '7', '8','9', '0'};
	String[] morse= {" ",".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
			".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-",
			"-.--","--..",".----","..---","...--","....-",".....","-....","--...","---..",
			"----.","-----"};
        

        System.out.println("Escribe tu palabra");
        Scanner datos = new Scanner(System.in);
        
        
        String entrada="";
        String respuesta="";
      entrada=datos.nextLine();
     
        
         for(int i= 0;i<entrada.length();i++){
            for( int e=0;e<37;e++){
                if(entrada.charAt(i)== letras[e]){
                    respuesta+= morse[e];
                    respuesta+=" ";
                    
                    break;
                    
                }
            
                }
                 }
        System.out.println("La Respuesta es:"+" "+ respuesta);
        
    }
    
}
