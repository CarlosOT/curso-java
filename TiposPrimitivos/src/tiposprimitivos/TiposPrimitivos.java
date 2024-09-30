/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author ingri
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        //[bloco1]-------------------- Recebe nome, nota do aluno e imprime
        
        /*
        * String nome = "Gustavo";
        * float nota = 8.5f;
        */
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do Aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        
        System.out.format("A nota de %s é %.2f \n", nome, nota);
        //[bloco1]--------------------- final [bloco1]
        
        
    }
    
}
