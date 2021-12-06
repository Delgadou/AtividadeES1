Feature: Cadastrar Aluno
  Scenario: Inicio do Programa
    Given o app iniciou
    And foi criado o Controller
    And chamado o metodo de criacao
    Then o aluno foi salvo no repository