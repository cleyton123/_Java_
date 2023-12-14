package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract public class Pessoa {
 //Atributos 
    protected int id;
    protected String nome;
    protected char sexo;
    protected Date datanasc;
    protected String telefone;
    protected String email;
    protected String RG;
    
    //Construtor

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Pessoa(int id, String nome, char sexo, String datanasc, String telefone, String email, String RG) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        try {
            this.datanasc = new SimpleDateFormat("dd/MM/yyyy").parse(datanasc);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.telefone = telefone;
        this.email = email;
        this.RG = RG;
    }
    
    //getter e setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getData() {
        return datanasc;
    }

    public void setData(Date data) {
        this.datanasc = data;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
    
}
