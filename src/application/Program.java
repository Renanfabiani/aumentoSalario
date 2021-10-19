package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Fazer um programa para ler os dados de um funcionario (nome, salario bruto e imposto).
	 Em seguida, mostrar os dados do funcionario (nome e salario liquido). Em seguida, aumentar
	 o salario do funcionaro com base em uma porcentagem dada (somente o salario bruto é 
	 afetado pela porcentagem) e mostrar novamente os dados do funcionario*/ 
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
		
	Funcionario rect = new Funcionario();	
	
	System.out.print("Name: ");
	rect.name = sc.nextLine();
	System.out.print("Gross salary: ");
	rect.GrossSalary = sc.nextDouble();
	System.out.print("Tax: ");
	rect.tax = sc.nextDouble();
	
	System.out.println();
	System.out.println ("Funcionario: " + rect);
	System.out.println();
	System.out.println("Qual a porcentagem de aumento do seu salario? ");
	double porcentagem = sc.nextDouble();
	rect.aumentoSalario(porcentagem);
	
	System.out.println();
	System.out.println("Atualize o salário: " + rect);
	sc.close();
	
	}

}
