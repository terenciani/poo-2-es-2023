package br.ifpr.aula.construtores;

public class App {
    int x;

    public static void main(String[] args) throws Exception {
        Aluno joao = new Aluno();
        Aluno pedro = new Aluno("111.111.111-11");
        Aluno jean = new Aluno();
        Aluno aline = new Aluno("222.222.222-22");

        System.out.println("Quantidade Estatico = " + joao.quantidadeEstatico);
        System.out.println("Quantidade Atributo = " + joao.quantidadeAtributo);

        System.out.println(Aluno.quantidadeEstatico);

        somar(0);
        App ap = new App();
        ap.imprimir();
    }

    public void imprimir() {
        System.out.println(this.x);
    }

    public static int somar(int y) {
        this.x = this.x + y;
    }

}
