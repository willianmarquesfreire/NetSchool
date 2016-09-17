package entidades;

import sql.CreateTable;

class Telefone extends EntidadeAbstrata {

    private String ddd;
    private String numero;
    private Boolean mensagem;
    private Pessoa pessoa;
    private TipoTelefone tipoTelefone;

    public Telefone(Long id, String ddd, String numero, Boolean mensagem, Pessoa pessoa, TipoTelefone tipoTelefone) {
        this.id = id;
        this.ddd = ddd;
        this.numero = numero;
        this.mensagem = mensagem;
        this.pessoa = pessoa;
        this.tipoTelefone = tipoTelefone;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public TipoTelefone getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(TipoTelefone tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean getMensagem() {
        return mensagem;
    }

    public void setMensagem(Boolean mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String create() {
        return CreateTable.TELEFONE.getSql();
    }

    @Override
    public String insert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
