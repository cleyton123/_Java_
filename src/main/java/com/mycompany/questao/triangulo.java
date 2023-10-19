package com.mycompany.questao;

public class triangulo {
    // Atributos
    public double cateto_1, cateto_2, hipotenusa, H;
    

    // Método para calcular a hipotenusa
    public void Result() {
        
        // Utiliza o teorema de Pitágoras para calcular a hipotenusa
        hipotenusa = Math.sqrt((cateto_1 * cateto_1) + (cateto_2 * cateto_2));
        
        // Imprime o valor da hipotenusa no console
        System.out.println("O valor da hipotenusa é: " + hipotenusa);
        
    }
    }


