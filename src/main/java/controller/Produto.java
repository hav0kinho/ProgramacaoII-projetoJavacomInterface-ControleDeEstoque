package controller;
//===============================CLASSE=========================================
public class Produto implements Validar {
    //ATRIBUTOS
    private String nome;
    private Integer quantidade;

    //CONSTRUTOR
    public Produto(String nome, Integer quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
    
    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    //MÉTODOS
    public Boolean validar(){
        if(getNome().length() < 1 || getNome().equals(null)){
            return false;
        }
        if(getQuantidade() < 0 || getQuantidade().equals(null)){
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return "Nome: " + getNome() + "\nQuantidade: " + getQuantidade();
    }
    
}
