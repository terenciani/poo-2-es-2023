package br.ifpr.aula.construtores;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro valor para calcular a media");
        int a = teclado.nextInt();

        System.out.println("Informe o segundo valor para calcular a media");
        int b = teclado.nextInt();

        System.out.println("Informe o terceiro valor para calcular a media");
        int c = teclado.nextInt();
        double media = media(a,b,c);
        imprimir(media);
    }
    static double media(int a, int b, int c){
        int soma = a+b+c;
        double media = soma/3;
        return media;
    }
    static void imprimir(double media){
        System.out.println("Sua media é: "+media);
    }

    /*def imprimir(media):
        print(f"Sua media é: {media}")

    /*def media(a,b,c):
        soma = a+b+c
        media = soma/3
        return media*/
}
