package Controller;

import Controller.Helper.AgendaHelp;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import static Model.DAO.Banco.cliente;
import static Model.DAO.Banco.servico;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;

public class AgendaController {
    //campo view e helper
    private final Agenda view;
    private final AgendaHelp helper;
    //construtor

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelp(view);
    }
    
    //metodo
    
    public void atualizarTabela(){
    //Buscar lista com agendamentos do banco de dados
       AgendamentoDAO agendamento = new AgendamentoDAO();//instancia do objeto 
        ArrayList<Agendamento> agendamentos = agendamento.selectAll(); //retorna uma lista com todos os registros ou agendamentos do banco
        
        //Exibir esta lista na view
        this.helper.preencherTabela(agendamentos);
    }
    
    
    public void atualizarCliente(){
     //busca clientes no banco de dados
     ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll(); //retorna uma lista de todos os clientes do banco
        
        //imprimi-os no campo cliente da agenda
        helper.preencherCliente(cliente);//chamo o helper e passo a lista dos clientes para o método 'preencherCliente'
    }
    public void atualizaServico(){
       //buscar lista de serviço no banco 
       ServicoDAO servicoDAO = new ServicoDAO();
       ArrayList<Servico> servicos = servicoDAO.selectAll(); //retorna a lista de todos os serviços do banco
        
        //imprimir no campo servico da agenda
       helper.preencherServico(servicos);
    }
    //método para atualizar o valor de acordo com o serviço selecionado 
    public void atualizaValor(){
        Servico servico = helper.obterServico();//pega o serviço da tela
        helper.setarValor(servico.getValor());//seta o valor do serviço na tela
    }
    //método para agendar
    public void agendar(){
    //buscar objeto agendamento da tela
     Agendamento agendamento = helper.obterModelo();
     //salva objeto no banco de dados
     new AgendamentoDAO().insert(agendamento);
     //inseri elemento na tabela
     atualizarTabela();
     helper.limparTela();
    }
}
