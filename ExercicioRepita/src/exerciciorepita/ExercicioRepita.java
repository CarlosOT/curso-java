/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author ingri
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* JOptionPane.showMessageDialog(null, "Olá Mundo", "Boas Vindas", JOptionPane.ERROR_MESSAGE); */
        
        int n, s = 0, totalValores = 0, totalPar = 0, totalImpar = 0, acimaCem = 0, mediaValor = 0; //declarando variáveis do tipo inteiro
        String listaValores = "<html>";
        // estrutura repeticao repita
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            
            s += n; // soma o total
            
            // estrutura condicional criada para desconsiderar o valor 0 (zero encerra o programa)
            if (n == 0){
                totalValores += 0; // somando 0 caso o usuário aperte 0 para encerrar
            } else{
                totalValores += 1; // contador total valores acima de 1
            }
            
            // listando valores diferente de 0 (zero encerra o programa)
            if (n != 0){
                listaValores += ("<br> (" + totalValores + "º) " + n);
            } else{
                listaValores += ("</html>");
            }            
            
            if (n > 100){ // verifica quais números são maior que cem
                acimaCem += 1;
            }
            // verificando quais números são par ou impar (0 encerra o programa)
            if (n % 2 == 0 && n != 0){
                totalPar += 1;
            } else if (n % 2 == 1 && n !=0){
                totalImpar += 1;
            }
        } while (n != 0);
        
        // tirando a média total
        mediaValor = s / totalValores;
        
        JOptionPane.showMessageDialog(null, "<html> Veja abaixo a soma dos valores digitados: <hr>" 
                + "<br>Valor Total: " + s +
                "<br> Total de Valores: " + totalValores +
                "<br> Total de Pares: " + totalPar +
                "<br> Total de Ímpares: " + totalImpar +
                "<br> Acima de 100: " + acimaCem +
                "<br> Média dos Valores: " + mediaValor + "<br>" +
                "<br>Lista de Valores: <br>" + listaValores
                + "</html>", "Resultado Final",JOptionPane.INFORMATION_MESSAGE);
        
        /* JOptionPane.showMessageDialog(null, "Você digitou o valor " + n); */
        
        
        
    }
    
}
