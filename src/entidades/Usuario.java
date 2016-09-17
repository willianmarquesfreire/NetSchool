/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author wmfsystem
 */
public class Usuario extends EntidadeAbstrata {

    private String login;
    private String senha;

    public Usuario() {
    }

    public Usuario(Long id, String login, String senha) {
        super(id);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String create() {
        StringBuilder sb = new StringBuilder();
        sb.append("create table usuario (");
        sb.append("id bigint not null primary key, ");
        sb.append("login varchar(100) not null, ");
        sb.append("senha varchar(100) not null)");
        return sb.toString();
    }

    @Override
    public String insert() {
        StringBuilder sb = new StringBuilder();
        return sb.toString();
    }

    @Override
    public String update() {
        StringBuilder sb = new StringBuilder();
        return sb.toString();
    }

    @Override
    public String select() {
        StringBuilder sb = new StringBuilder();
        return sb.toString();
    }

    @Override
    public String delete() {
        StringBuilder sb = new StringBuilder();
        return sb.toString();
    }
    
    

}