/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ingri
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {3,7,6,1,9,4,2};
        for(int v:vet){
            System.out.print(v + " ");
        }
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escolha um dos números acima para localizarmos a sua posição: ");
        int localizaPosicao = teclado.nextInt();
        System.out.println("O número digitado foi " + localizaPosicao + "\n");
        int p = Arrays.binarySearch(vet, localizaPosicao);
        System.out.println("Foi encontrado o valor " + localizaPosicao + " na posição " + p);
    }
    
}
