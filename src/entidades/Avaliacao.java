package entidades;

import sql.CreateTable;

class Avaliacao extends EntidadeAbstrata {

    private String descricao;
    private PeriodoDisciplina periodoDisciplina;
    private TipoAvaliacao tipoAvaliacao;

    public Avaliacao(Long id, String descricao, PeriodoDisciplina periodoDisciplina, TipoAvaliacao tipoAvaliacao) {
        this.id = id;
        this.descricao = descricao;
        this.periodoDisciplina = periodoDisciplina;
        this.tipoAvaliacao = tipoAvaliacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public PeriodoDisciplina getPeriodoDisciplina() {
        return periodoDisciplina;
    }

    public void setPeriodoDisciplina(PeriodoDisciplina periodoDisciplina) {
        this.periodoDisciplina = periodoDisciplina;
    }

    public TipoAvaliacao getTipoAvaliacao() {
        return tipoAvaliacao;
    }

    public void setTipoAvaliacao(TipoAvaliacao tipoAvaliacao) {
        this.tipoAvaliacao = tipoAvaliacao;
    }

    @Override
    public String create() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateTable.AVALIACAO);
        return sb.toString();
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
