package br.com.jaklyra;

public class Quadrilatero {

    //SOBRECARGA - MANTENDO O NOME DO MÉTODO E ALTERANDO A LISTA DE PARÂMETROS
    //NÃO PODE CONTER DOIS MÉTODOS COM O MESMO NOME E O MESMO TIPO DE PARÂMETRO
    public static void area(double lado){

        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void area(double baseMaior, double baseMenor, double altura){

        System.out.println("Área do trapézio: " + ((baseMaior+baseMenor) * altura)/2);
    }

    //NOS EXEMPLOS ABAIXO, EMBORA O NÚMERO DE PARAMETROS SEJAM IGUAIS ,
    // O TIPO DA VARIÁVEL É DIFERENTE O QUE PERMITE A SOBRECARGA DO MÉTODO AREA

    public static void area(double lado1, double lado2){

        System.out.println("Área do retângulo: " + lado1 * lado2);
    }

    public static void area(float diagonal1, float diagonal2){

        System.out.println("Área do losango: " + (diagonal1 * diagonal2) /2);
    }
}
