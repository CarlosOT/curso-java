/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escrevendocodigo;

/**
 *
 * @author ingri
 */
public class EscrevendoCodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade = 3;
        int idade2  = (int) 5; // (int) is a typecast
        Integer idade3 = new Integer(7); // Integer is a 'Wrapper Class'
        
        System.out.println(idade);
        System.out.println(idade2);
        System.out.println(idade3);
        
        char nome = 'C';
        char nome2 = (char) 'J'; 
        Character nome3 = new Character('K');  
        
        System.out.println(nome);
        System.out.println(nome2);
        System.out.println(nome3);
    }
    
}
