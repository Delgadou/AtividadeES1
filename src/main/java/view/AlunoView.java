package view;

import model.Aluno;

import java.util.List;

public class AlunoView {
    public static void listaAluno(Aluno aluno) {
        System.out.println(aluno.getMatricula()+" - "+aluno.getNome() +"("+aluno.getFones().get(0)+"\n");
    }

    public static void listaAlunos(List<Aluno> lista) {
        for(Aluno al : lista) {
            listaAluno(al);
        }
    }
}
