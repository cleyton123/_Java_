package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class AgendaHelp implements IHelper {
    
   private final Agenda view;
   
  //construtor
    public AgendaHelp(Agenda view) {//tenho acesso a view
        this.view = view;
    }
   //método para preencher os campos da Tabela
    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTable1().getModel();//chama a tabela da classe Agenda e tenho acesso a conteudo da tabela
        tableModel.setNumRows(0);
        
        //percorrer a lista preenchendo a table model
        for (Agendamento agendamento : agendamentos) {  //tenho acesso a cada agendamento da lista agendamento a cada for
            
            tableModel.addRow( new Object[]{
            
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDateFormatada(),
                agendamento.getHoraFormatadda(),
                agendamento.getObservacao()
            } ); //adiciona linha na tabela e os dados conforme cada coluna
        
    }
   
    
    }
    //metodo para preencher o campo cliente ou jComboBoxCliente
    public void preencherCliente(ArrayList<Cliente> clientes) { //lista de clientes do banco de dados
      //converte o Model para Default(padrão)  
      DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxCliente().getModel(); //chama o campo cliente e tenho acessa ao seu conteudo
     
       //percorre a lista de cliente 
        for (Cliente cliente : clientes) {//cada cliente encontrado é armazenado na variável 'cliente'
           comboBoxModel.addElement(cliente); //adiciona o objeto cliente no campo
        }
        
    }
    
       //metodo para preencher o campo cliente ou jComboBoxServico
    public void preencherServico(ArrayList<Servico> servicos) {//lista de servicos do banco
      //converte o Model para Default(padrão)  
     DefaultComboBoxModel comboBoxModel =  (DefaultComboBoxModel) view.getjComboBoxServico().getModel(); //chama o campo serviço e tenho acessa ao seu conteudo
   
     //percorre a lista de cliente 
        for (Servico servico : servicos) { //cada serviço da lista serviço é armazenado na variável 'servico'
          comboBoxModel.addElement(servico); //adiciona o objeto serviço no campo
        }     
    }
    
    //método para pegar o cliente selecionado
      public Cliente obterCliente() {
      return  (Cliente) view.getjComboBoxCliente().getSelectedItem();//pega o item selecionado no comboBoxCliente  
   }
    
    //método para pegar o serviço selecionado
      public Servico obterServico() {
      return  (Servico) view.getjComboBoxServico().getSelectedItem();//pega o item selecionado no comboBoxServico  
   }
   
      public void setarValor(float valor) {
      view.getjTextValor().setText(valor+"");
      }

    @Override
    //método que retorna o agendamento
    public Agendamento obterModelo() {
        String idString  = view.getjTextID().getText();//aramazena o texto do campo ID
        int id = Integer.parseInt(idString);//converte a string ID para inteiro
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = view.getjTextValor().getText();//armaxena a string do campo valor
        float valor = Float.parseFloat(valorString);//converte o texto do valor para float
        String data = view.getjTextData().getText();//aramazena o texto do campo data
        String hora = view.getjTextHora().getText();//aramazena o texto do campo hora
        String dataHora = data+ " " +hora;//aramazena a data e a hora
        String observacao = view.getjTextcampoAgenda().getText();//aramazena o texto do campo agendamento
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor,dataHora, observacao);
        return agendamento;
    }

    @Override
     //método que retorna o limparTela
    public void limparTela() {
      view.getjTextID().setText("");//seta o texto do campo ID para vazio
      view.getjTextData().setText(""); //seta o texto do campo data para vazio  
      view.getjTextHora().setText("");//seta o texto do campo hora para vazio
      view.getjTextcampoAgenda().setText("");//seta o texto do campo observação ou agendar para vazio
    }
}
