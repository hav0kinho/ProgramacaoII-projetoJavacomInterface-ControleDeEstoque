package fachada;

import controller.Database;
import controller.Produto;
import controller.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import view.LoginView;

public class Fachada {
    //Atributos
    private Database db;
    private LoginView loginView;
    
    //Construtor
    public Fachada() {
        this.db = new Database();
    }
    
    public Fachada(LoginView view) {
        this.db = new Database();
        this.loginView = view;
    }
    

    //Getters e Setters
    public Database getDb() {
        return db;
    }
    
    
    
    //Metódos
    //Adiciona um usuário no Banco de dados.
    public Boolean adicionarUsuario(String nome, String senha){
        Usuario novoUsuario = new Usuario(nome, senha); //Cria o objeto
        
        //Valida o Objeto. Caso seja valido, adiciona ele no banco de dados, mostra uma mensagem e retorna true
        if(novoUsuario.validar()){
            db.adicionarUsuario(novoUsuario);
            JOptionPane.showMessageDialog(loginView, "Usuario Cadastrado");
            return true;

        } else { //Caso não, exibi uma mensagem dizendo oque é necessario para o usuário ser valido e retorna false
            JOptionPane.showMessageDialog(loginView, "Cadastro Inválido. Usuario deve ter no mínimo 3 caracteres e Senha no minimo 6");
            return false;
        }
    }
    
    //Verifica no Banco de dados se o usuario existe nele. Retorna true ou false dependendo do resultado do verificarUsuario() do Banco de Dados
    public boolean verificarUsuario(String nome, String senha){
        Usuario usuarioParaVerificar = new Usuario(nome, senha); //Cria o objeto
        System.out.println("Verificando Usuario");
        return db.verificarUsuario(usuarioParaVerificar);
    }
    
    //Adiciona um produto no Banco de dados. Caso ele seja Válido, adiciona-o, Caso não, exibi uma mensagem dizendo oque é necessário para o produto ser adicionado
    public Boolean adicionarProduto(String nome, Integer quantidade){
        Produto novoProduto = new Produto(nome, quantidade);
        if(novoProduto.validar()){
            db.adicionarProduto(novoProduto);
            return true;
        } else {
            JOptionPane.showMessageDialog(loginView, "Produto deve ter um nome e uma quantidade >= 0\nSe o campo for vazio, a quantidade será definida como 0");
            return false;
        }


    }
    
    //Retorna uma lista dos produtos contidos no Banco De Dados
    public ArrayList<Produto> retornarProdutos(){
        return db.getEstoque();
    }
    
    //Retorna uma lista dos usuarios contidos no Banco de Dados
    public ArrayList<Usuario> retornarUsuarios(){
        return db.getUsuarios();
    }
    
    //Remove um produto do Banco de dados.
    public Boolean removerProduto(String nome){
        Produto produto = new Produto(nome, 0);
        db.removerProduto(produto);
        
        return true;
        
    }
    
}
