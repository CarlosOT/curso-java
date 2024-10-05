/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01;

/**
 *
 * @author ingri
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
    static void procedimentoSoma(int a, int b){
        int s = a + b;
        System.out.println("A soma de " + a + " + " + b + " é " + s);
    } // PROCEDIMENTO (NÃO TEM RETORNO)
    static int funcaoSoma(int a, int b){
        int s = a + b;
        return s;
    } //FUNÇÃO (TEM RETORNO)
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa");
        int sm = funcaoSoma(3,4);
        System.out.println("A soma é " + sm);
    }
    
}
