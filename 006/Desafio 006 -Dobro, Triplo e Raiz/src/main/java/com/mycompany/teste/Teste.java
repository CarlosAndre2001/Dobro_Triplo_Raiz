package com.mycompany.teste;

import java.util.Scanner;

public class Teste{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int a; 
        
        System.out.println("Digite um Valor inteiro.");
        
        a = Integer.parseInt(sc.nextLine());
        
        System.out.println("Dobro do valor é: " + (a*2));
        System.out.println("Tripo do valor é: " + (a*3));
        System.out.println("Raíz do Valor é: " + Math.sqrt(a));
    }
}