package com.mycompany.questao;
import java.util.Scanner;

public class Questao {

    public static void main(String[] args) {
        // Cria um objeto Scanner para entrada de dados
        Scanner ler = new Scanner(System.in);

        // Cria uma instância da classe Triangulo
        triangulo X = new triangulo();

        // Solicita e lê o valor do primeiro cateto
        System.out.println("Digite o valor do primeiro cateto:");
        X.cateto_1 = ler.nextDouble();

        // Solicita e lê o valor do segundo cateto
        System.out.println("Digite o valor do segundo cateto:");
        X.cateto_2 = ler.nextDouble();

        // Chama o método Result() para calcular e exibir a hipotenusa
        X.Result();
    }
}
