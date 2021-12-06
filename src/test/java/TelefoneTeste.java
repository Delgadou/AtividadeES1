import model.Aluno;
import model.Telefone;
import repository.AlunoRepository;
import repository.ChaveExisteException;
import repository.ChaveInexisteException;

public class TelefoneTeste {
    @io.cucumber.java.en.Given("^inicia testes$")
    public void iniciaTeste() {
    }

    @io.cucumber.java.en.And("^altera telefone teste$")
    public void chamadoOMetodoDeAlteracao() throws ChaveExisteException, ChaveInexisteException {
        Aluno andre = new Aluno("Andre", 999);
        AlunoRepository.getInstance().insertAluno(andre);
        andre.addFone(new Telefone(12, "434343", 'R', true, "Rato"));

        AlunoRepository.getInstance().atualizaAluno(andre);
        assert((AlunoRepository.getInstance().buscaAlunoMatricula(999).getFones().size() == 0));

    }

    @io.cucumber.java.en.Then("^telefone alterado com sucesso$")
    public void telefoneSalvoNoRepository() {
    }
}

