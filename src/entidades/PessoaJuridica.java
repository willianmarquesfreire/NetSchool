package entidades;

import sql.CreateTable;

public class PessoaJuridica extends Pessoa {

    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;

    public PessoaJuridica(String nomeFantasia, String razaoSocial, String cnpj) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
        return CreateTable.PESSOA_JURIDICA.getSql();
    }

}
