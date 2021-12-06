package controller;

import model.Aluno;
import model.Telefone;
import repository.AlunoRepository;
import repository.ChaveExisteException;
import view.AlunoView;

import java.util.List;


public class AlunoController {


    public void criaTelefoneAluno(Aluno aluno, int ddd, String numero, char tipo) {
        aluno.addFone(new Telefone(ddd,numero,tipo, true,null));
        try {
            AlunoRepository.getInstance().insertAluno(aluno);
        } catch (ChaveExisteException e) {
            System.out.println("chave "+aluno.getMatricula()+" já cadastrada\n");
        }
    }

    public void alteraNome(Aluno aluno, String nome){
        aluno.setNome(nome);
    }

    public void alteraMatricula(Aluno aluno, long numero){
        aluno.setMatricula(numero);
    }

    public void deletaAluno(Aluno aluno){
        AlunoRepository.getInstance().deletaAluno(aluno.getMatricula());
    }

    public void alteraTelefone(Aluno aluno){

    }

    public void listaAlunos() {
        List<Aluno> lista = AlunoRepository.getInstance().buscaTodos();
        AlunoView.listaAlunos(lista);
    }
}
