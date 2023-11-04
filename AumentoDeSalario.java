package com.mycompany.aumentodesalario;
import java.util.Scanner;

public class AumentoDeSalario {

    public static void main(String[] args) {
        // Solicita o salário ao usuário
        System.out.print("Informe seu salário: R$");
        Scanner ler = new Scanner(System.in);
        
        // Cria uma instância de CalcularReajuste
        CalcularReajuste X = new CalcularReajuste();
        
        // Lê o salário informado pelo usuário
        X.salario = ler.nextDouble();
        
        // Chama o método para calcular o reajuste de salário
        X.calcularReajuste();
    }
}
