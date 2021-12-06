import controller.AlunoController;
import model.Aluno;
import repository.AlunoRepository;

public class Main {
    public static void main(String[] args) {
        AlunoController controller = new AlunoController();
        Aluno henrique =  new Aluno("Henrique", 123);
        Aluno guilherme = new Aluno("Guilherme", 456);
        Aluno selita = new Aluno("Selita", 789);

        controller.criaTelefoneAluno(henrique, 51, "999999", 'R');
        controller.criaTelefoneAluno(guilherme, 11, "34930249", 'R');
        controller.criaTelefoneAluno(selita, 46, "322323321", 'R');
        controller.listaAlunos();

        controller.alteraNome(henrique, "Carlos");
        controller.alteraMatricula(henrique, 394);

        controller.listaAlunos();
    }
}
