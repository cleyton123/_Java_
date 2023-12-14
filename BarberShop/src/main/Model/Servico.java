package Model;
public class Servico {
    //Atributos
    private int id;
    private String descricao;
    private float valor;
    
    //Construtor

    public Servico(int id, String descricao, float valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    //Getter e Setter 

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override //subscreve um método
   public String toString(){
       return descricao; //retorna a descrição
   } 
   

    
}

