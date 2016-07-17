package model;

public class Cliente extends Pessoa {

    public Cliente(){
        super();
        super.setTipo(2);
    }
    
    public Cliente(String nome, String sexo, String email, String telefoneM, String telefoneF, String cpf, String rg, int tipo, Endereco endereco) {
        super(nome, cpf, sexo, email, telefoneM, telefoneF, endereco, 2, rg);
    }
}
