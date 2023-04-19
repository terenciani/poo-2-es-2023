package br.ifpr.aula.heranca;

public class Humano {
    protected String sexo;
    protected String dna;

    public Humano() {
    }

    public Humano(String sexo) {
        this.sexo = sexo;
    }


    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
}
