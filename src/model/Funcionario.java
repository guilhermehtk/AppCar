package model;

public class Funcionario extends Pessoa {

    private Login login;

    public Funcionario(String nome, String sexo, String email, String telefoneM, String telefoneF, String cpf, String rg, Endereco endereco, Login login) {
        super(nome, cpf, sexo, email, telefoneM, telefoneF, endereco, 3, rg);
        this.login = login;
    }

    public Funcionario() {
        super();
        super.setTipo(3);
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

}
