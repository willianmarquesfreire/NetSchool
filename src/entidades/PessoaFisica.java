package entidades;

import java.util.Date;
import sql.CreateTable;

public class PessoaFisica extends Pessoa {

    private String nome;
    private Date nascimento;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String delete() {
        return super.delete(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String select() {
        return super.select(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update() {
        return super.update(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insert() {
        return super.insert(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String create() {
        return CreateTable.PESSOA_FISICA.getSql();
    }

}
