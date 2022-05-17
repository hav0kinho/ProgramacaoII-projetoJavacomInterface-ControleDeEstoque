package controller;

import java.util.ArrayList;
//==========================CLASSE==================================
public class Database {
    //Atributos
    private ArrayList<Usuario> usuarios;
    private ArrayList<Produto> estoque;
    
    //Construtor
    public Database(){
        this.estoque = new ArrayList();
        this.usuarios = new ArrayList();
    }    
   
    public Database(ArrayList<Usuario> usuarios, ArrayList<Produto> estoque) {
        this.usuarios = usuarios;
        this.estoque = estoque;
    }
    
    //Getters e Setters

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Produto> getEstoque() {
        return estoque;
    }

    public void setEstoque(ArrayList<Produto> estoque) {
        this.estoque = estoque;
    }
    
    
    
    
    
    //Metodos
    public void adicionarUsuario(Usuario user){
        //Tenta adicionar o usuario. Caso de algum problema, mostra o erro no console.
        try{
            usuarios.add(user);
            System.out.println("Usuario Cadastrado");
        } catch (Exception err){
            System.out.println("Aconteceu algum erro durante o cadastro do usuario no Banco de Dados: " + err);
        }
    }
    
    public Boolean verificarUsuario(Usuario user){
        //Verifica se o usuario está no Banco de dados, retorna true ou false caso encontre-o ou não. 
        for(int i = 0; i < getUsuarios().size(); i++){
            if(getUsuarios().get(i).getUsuario().equals(user.getUsuario()) && getUsuarios().get(i).getSenha().equals(user.getSenha())){
                System.out.println("Achou Usuario");
                return true;
            }
        }
        System.out.println("Usuario não encontrado");
        return false;
    }
    
    public void mostrarUsuarios(){
       //Metodo usado mais para debug. Mostra todos os usuários cadastrados;
       for(int i = 0; i < getUsuarios().size(); i++){
           System.out.println(getUsuarios().get(i));
       }
    }
    
    //Produtos
    public void adicionarProduto(Produto produto){
        //Tenta adicionar o produto no Banco de Dados. Caso de algum problema, exibe uma mensagem de erro.
        try{
            estoque.add(produto);
            System.out.println("Produto Adicionado");
        } catch(Exception err){
            System.out.println("DATABASE!\nAconteceu um erro ao tentar adicionar o usuario no DB: " + err);
        }
    }
    
    public void removerProduto(Produto produto){
        //Tenta encontrar e remover um produto do Banco de Dados. Caso não encontre, não faz nada.
        try{
            
            for(int i = 0; i < estoque.size(); i++){
                if(estoque.get(i).getNome().equals(produto.getNome())){
                    estoque.remove(i);
                    System.out.println("Produto Removido!");
                }
            }

        } catch (Exception err){
            System.out.println("Erro ao tentar remover produto: " + err);
        }
    }
    
}
