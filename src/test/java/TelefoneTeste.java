import model.Aluno;
import model.Telefone;
import repository.AlunoRepository;
import repository.ChaveExisteException;
import repository.ChaveInexisteException;

public class TelefoneTeste {
    @io.cucumber.java.en.Given("^inicia testes$")
    public void iniciaTeste() {
    }

    @io.cucumber.java.en.And("^chamado o metodo de alterar telefone$")
    public void chamadoOMetodoDeAlteracao() throws ChaveExisteException, ChaveInexisteException {
        Aluno aluno = new Aluno("Joao", 123232);
        AlunoRepository.getInstance().insertAluno(aluno);
        aluno.addFone(new Telefone(12, "434343", 'R', true, "Rato"));

    }

    @io.cucumber.java.en.Then("^o telefone foi alterado$")
    public void telefoneSalvoNoRepository() {
    }
}

