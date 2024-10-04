/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor05;

import java.util.Arrays;

/**
 *
 * @author ingri
 */
public class Vetor05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = new int[10];
        Arrays.fill(v, 0);      
        int contador = 0;
        for(int valor:v){
            contador++;
            System.out.println("[posição " + contador + "]" + " valor inserido dentro do vetor: " + valor);
        }
    }
    
}
