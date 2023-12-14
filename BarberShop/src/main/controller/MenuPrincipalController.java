package Controller;

import View.Agenda;
import View.MenuPrincipal;

public class MenuPrincipalController {
     private final MenuPrincipal view;
     
    //construtor
    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
     //metodo
    public void navegarParaAgenda(){
        //Instancia o objeto Agenda
        Agenda agenda = new Agenda();
        agenda.setVisible(true);//tem acesso a agenda
      //  this.view.dispose();//fecha a tela de menu ao acessar a tela agenda
    }
}
