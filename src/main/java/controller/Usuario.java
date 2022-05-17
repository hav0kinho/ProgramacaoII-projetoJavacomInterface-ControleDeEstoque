package controller;

import java.util.ArrayList;

//Objeto do Usuario que será colocado no Banco de dados.

//=======================CLASSE==========================
public class Usuario implements Validar{
    //Atributos
    private String usuario;
    private String senha;
    
    //Construtor
    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
     
    //GETTERS E SETTERS
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    //METODOS
    public Boolean validar(){
        if(getUsuario().length() < 3){
            return false;
        }
        if(getSenha().length() <= 6){
            return false;
        }
        
        return true;
    }
    
    
    @Override
    public String toString(){
        return "Usuario: " + getUsuario() + "\nSenha: " + getSenha();
    }
}
