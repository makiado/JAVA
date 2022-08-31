/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class cadastro {
 public static void registro () {
    Scanner sc = new Scanner(System.in);
    // abrindo novo funcionado na db
    funca f1;
    f1 = new funca();
    System.out.println("Username is: ");
    f1.nome = sc.nextLine();
    System.out.println("rg is: ");
    f1.rg = sc.nextLine();
    System.out.println("departamento is: ");
    f1.departamento = sc.nextLine();
    System.out.println("join group data: ");
    f1.entrada = sc.nextLine();
    System.out.println("salario is: ");
    f1.salario = sc.nextDouble();
    System.out.println("Bem vindo porco esses sao seus dados ");        
    System.out.println("Nome: " + f1.nome);
    System.out.println("entrou: " + f1.entrada);
    System.out.println("funcao: " + f1.departamento);
    System.out.println("identidade: " + f1.rg);
    System.out.println("Soldo: " + f1.salario);
}    
}
