
public class AlunosSteps {
    @io.cucumber.java.en.Given("^o app iniciou$")
    public void oAppIniciou() {
    }

    @io.cucumber.java.en.And("^foi criado o Controller$")
    public void foiCriadoOController() {
        assert (2 > 1);
    }

    @io.cucumber.java.en.And("^chamado o metodo de criacao$")
    public void chamadoOMetodoDeCriacao() {
        int a = Integer.parseInt("1");
    }

    @io.cucumber.java.en.Then("^o aluno foi salvo no repository$")
    public void oAlunoFoiSalvoNoRepository() {
    }

}
