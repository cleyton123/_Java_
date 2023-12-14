package Model;

import java.util.Date;

public class Cliente extends Pessoa {
    //Atributos 
  
    private String endereço;
    private String CEP;
    
    //Contrutor
    public Cliente(int id,String nome,char sexo,String datanasc,String telefone,String email,String RG,String endereço,String CEP) {
        super(id, nome, sexo, datanasc, telefone, email, RG);//construtor da classe Pessoa
        this.endereço = endereço;
        this.CEP = CEP;
    }

    public Cliente( int id, String nome,String endereço, String CEP) {
        super(id, nome);
        this.endereço = endereço;
        this.CEP = CEP;
    }
    
    
   //getter e setter

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
    
    
    @Override //subscreve um método
    public String toString(){
        return getNome();//retorna o nome do cliente
    }
 
}