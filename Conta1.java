/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

 */

package conta1;



/**

 *

 * @author IGOR

 */

import java.util.Scanner;



public class Conta1 {



    public static void main(String[] args) {

 

        Scanner scanner = new Scanner(System.in);



        System.out.print("Digite o faturamento de janeiro: ");

        int faturamentoJaneiro = scanner.nextInt();



        System.out.print("Digite o faturamento de fevereiro: ");

        int faturamentoFevereiro = scanner.nextInt();



        System.out.print("Digite o faturamento de marco: ");

        int faturamentoMarco = scanner.nextInt();



        int faturamentoTrimestre = faturamentoJaneiro + faturamentoFevereiro + faturamentoMarco;



        System.out.println("O faturamento do trimestre e: " + faturamentoTrimestre);



        scanner.close();

    }

}

