package br.ifpr.aula.heranca;

public class Pessoa extends Humano{
    protected String nome;
    private String rg;
    private String endereco;


    public Pessoa() {
        this.dizOi();
    }

    public Pessoa(String nome, String rg, String endereco) {
        this.nome = nome;
        this.rg = rg;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    protected void dizOi(){
        System.out.println("Hello");
    }

    
}
