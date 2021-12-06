import controller.AlunoController;
import model.Aluno;

public class ModificarDadosAlunoTeste {
    @io.cucumber.java.en.Given("^inicia teste$")
    public void iniciaTeste() {
    }

    @io.cucumber.java.en.And("^valida troca de nome$")
    public void validaAlteraNome() {
        AlunoController controller = new AlunoController();
        Aluno henrique = new Aluno("Henrique", 123);

        controller.alteraNome(henrique, "Ricardo");

        assert (henrique.getNome() == "Ricardo");
    }

    @io.cucumber.java.en.And("^valida troca de matricula$")
    public void validaAlteraMatricula(){
        AlunoController controller = new AlunoController();
        Aluno henrique = new Aluno("Henrique", 123);

        controller.alteraMatricula(henrique, 345);

        assert(henrique.getMatricula() == 345);
    }

    @io.cucumber.java.en.And("^exclui aluno$")
    public void validaExclusaoAluno(){
        AlunoController controller = new AlunoController();
        Aluno henrique = new Aluno("Henrique", 123);

        controller.deletaAluno(henrique);
    }

    @io.cucumber.java.en.Then("^testes bem sucedidos$")
    public void testesPassaram() {
    }

}

