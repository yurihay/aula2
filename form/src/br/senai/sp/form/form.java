package br.senai.sp.form;

import java.util.Scanner;

public class form {
    public static void main(String[] args) {

        /** Declaração  das variaveis */

       /** import da class Scanner */
        Scanner teclado= new Scanner(System.in);

        /** Coleta dados do User */
        System.out.print("Bom dia! Qual é o seu nome: ");
        String nome= teclado.nextLine();

        System.out.print("Bom dia! Qual é a sua  idade: ");
       int idade= teclado.nextInt();

        System.out.print("Bom dia! Qual é o seu peso: ");
        int peso= teclado.nextInt();

        System.out.print("Bom dia! Qual é o sua altura: ");
       float altura= teclado.nextInt();

        System.out.print("Bom dia! Qual é o seu Rg: ");
       int rg= teclado.nextInt();

        System.out.print("Bom dia! Qual é o seu cpf: ");
        long cpf= teclado.nextLong();

        System.out.print("Bom dia! Qual é o sua profissao: ");
       String profissao= teclado.next();

        System.out.print("Bom dia! Qual é o seu curso: ");
        String curso= teclado.next();


        /** Printa as informações*/
        System.out.println("_____________");
        System.out.println("_____________Formulario______");
        System.out.println("Olá"  + nome +"Seja Bem vindo");
        System.out.println("Sua idade é: "  + idade );
        System.out.println("Seu peso é: "  + peso );
        System.out.println("Sua altura é: "  + altura );
        System.out.println("Seu RG é: "  + rg );
        System.out.println("Seu CPF é: "  + cpf );
        System.out.println("Sua profissao é: "  + profissao );
        System.out.println("Seu curso é: "  + curso );
        System.out.println("_____________");
        System.out.println("_____________");












    }




}
