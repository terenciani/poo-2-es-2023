package br.ifpr.aula.construtores;

public class Aluno {
    static int quantidadeEstatico = 0;
    int quantidadeAtributo = 0;
    double notaUm;
    double notaDois;
    String cpf;

    public Aluno(){
        this.cpf = "";
        quantidadeEstatico++;
        this.quantidadeAtributo++;
    }

    public Aluno(String cpf){
        this.cpf = cpf;

        double media = (this.notaUm + this.notaDois) / 2;
        quantidadeEstatico++;
        this.quantidadeAtributo++;
    }
}
