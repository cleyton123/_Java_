package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

public class LoginController {

    private final Login view;
    private LoginHelper helper;
    
//Construtor
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
//Regras de negócio da tela de login

//método
 public void entrarNoSistema(){   
  //pegar um usuario da view

    Usuario usuario = helper.obterModelo();
 
 //pesquisa usuario no banco   
    
 //Instancia o objeto usuarioDAO
 UsuarioDAO usuarioDAO = new UsuarioDAO();
 Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);//retorna usuario encontrado no banco de dados
 
 //se  usuario da view tiver a mesmo usuario e senha do banco será direcionado para o menu principal
 if(usuarioAutenticado != null){
     //navegar para menu principal
     MenuPrincipal menu = new MenuPrincipal();//instancia o objeto 
     menu.setVisible(true);//usuario tem acesso ao menu principal
     this.view.dispose();//fecha a tela de login ao entrar na tela de menu principal
 }else{
     //mensagem de erro do login
     view.exibeMensagem("Usuário ou senha inválidos");
 }
             
 }    
public  void fizTarefa(){
    System.out.println("Busquei algo do banco de dados");
    
    this.view.exibeMensagem("Executei o fiz tarefa");
}   
    
    
}
