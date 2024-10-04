/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

/**
 *
 * @author ingri
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3,2,8,7,5,4,5,7,8,9,0}; //pode ser também "new int[4];"
        System.out.println("Total de casas no vetor N: " + n.length);
        for(int c=0; c<(n.length); c++){
            System.out.println("Na posição " + c + " temos o número " + n[c]);
        }
    }
    
}
