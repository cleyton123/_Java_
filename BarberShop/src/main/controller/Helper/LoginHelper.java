package Controller.Helper;

import Model.Usuario;
import View.Login;

public class LoginHelper implements IHelper{
   
private final Login view;
   //Construtor
    public LoginHelper(Login view) {
        this.view = view;
    }
    
    //método e função
    
    public Usuario obterModelo(){
     //busca um usuário de View
     String nome = view.getTextUsuario().getText(); //retorna o texto do campo usuário
     String senha = view.getTextSenha().getText();//retorna a senha do campo senha
     
     //objeto Usuario dp pacote model
     Usuario modelo = new Usuario(0,nome,senha); 
     return modelo;
      }       
    
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTextUsuario().setText(nome);//escreve ou digita um texto no campo do usuário
        view.getTextSenha().setText(senha);//escreve ou digita uma senha no campo do senha
    }
    
    public void limparTela(){
        view.getTextUsuario().setText("");//limpa o campo usuário,deixa vazio
        view.getTextSenha().setText("");//limpa o campo senha
    }
}

