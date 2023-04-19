package br.ifpr.aula.heranca;

public class TesteHeranca {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("João");
        aluno.setRg("231412342");

        Professor professor = new Professor();

        System.out.println(professor.getNome());

        Pessoa pessoa = new Pessoa();

        pessoa.dizOi();
        aluno.dizOi();
        professor.dizOi();
    }
}

