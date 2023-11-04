package com.mycompany.aumentodesalario;

public class CalcularReajuste {
    // Atributos
    public double salario, reajuste;

    // Método para calcular o reajuste
    public void calcularReajuste() {
        System.out.print("O percentual de aumento é: ");

        if (salario <= 280) {
            // Se o salário for menor ou igual a 280, aplicar um aumento de 20%
            System.out.println("20%");
            System.out.println("O valor do aumento é: R$" + salario * 0.2);
            System.out.println("O novo salário, após o aumento é: R$" + ((salario * 0.2) + salario));

        } else if (salario > 280 && salario <= 700) {
            // Se o salário estiver entre 280 e 700, aplicar um aumento de 15%
            System.out.println("15%");
            System.out.println("O valor do aumento é: R$" + salario * 0.15);
            System.out.println("O novo salário, após o aumento é: R$" + ((salario * 0.15) + salario));

        } else if (salario > 700 && salario <= 1500) {
            // Se o salário estiver entre 700 e 1500, aplicar um aumento de 10%
            System.out.println("10%");
            System.out.println("O valor do aumento é: R$" + salario * 0.1);
            System.out.println("O novo salário, após o aumento é: R$" + ((salario * 0.1) + salario));

        } else if (salario > 1500) {
            // Se o salário for maior que 1500, aplicar um aumento de 5%
            System.out.println("5%");
            System.out.println("O valor do aumento é: R$" + salario * 0.05);
            System.out.println("O novo salário, após o aumento é: R$" + ((salario * 0.05) + salario));
        }
    }
}
