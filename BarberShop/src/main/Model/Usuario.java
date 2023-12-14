package Model;

import java.util.Date;

public class Usuario extends Pessoa{
    //Atributos 
    protected String senha;
    protected String nivelacesso;
 
    //construtor

    public Usuario(int id,String nome, String senha) {
        super(id, nome);
        this.senha = senha;
    }
    
    

    public Usuario(int id,String nome,char sexo,String datanasc,String telefone,String email,String RG,String senha,String nivelacesso) {
        super(id, nome, sexo, datanasc, telefone, email, RG);
        this.senha = senha;
        this.nivelacesso = nivelacesso;
    }
    
    //getter e setter

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelacesso() {
        return nivelacesso;
    }

    public void setNivelacesso(String nivelacesso) {
        this.nivelacesso = nivelacesso;
    }
    
    

}
