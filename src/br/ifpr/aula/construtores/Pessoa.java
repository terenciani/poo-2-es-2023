package br.ifpr.aula.construtores;

public class Pessoa {
    String nome;
    String idade;
    int anoNascimento;
    
    public Pessoa(String nome){
        
        this.anoNascimento = 1990;
        this.nome = nome;
        this.log();
    }

    public void log(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(anoNascimento);
    }

}
