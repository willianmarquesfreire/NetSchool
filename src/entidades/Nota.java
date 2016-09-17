package entidades;

import java.math.BigDecimal;
import sql.CreateTable;

public class Nota extends EntidadeAbstrata {

    private BigDecimal valor;
    private AlunoPeriodoDisciplina alunoPeriodoDisciplina;
    private Avaliacao avaliacao;

    public Nota(Long id, BigDecimal valor, AlunoPeriodoDisciplina alunoPeriodoDisciplina, Avaliacao avaliacao) {
        this.id = id;
        this.valor = valor;
        this.alunoPeriodoDisciplina = alunoPeriodoDisciplina;
        this.avaliacao = avaliacao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public AlunoPeriodoDisciplina getAlunoPeriodoDisciplina() {
        return alunoPeriodoDisciplina;
    }

    public void setAlunoPeriodoDisciplina(AlunoPeriodoDisciplina alunoPeriodoDisciplina) {
        this.alunoPeriodoDisciplina = alunoPeriodoDisciplina;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public String create() {
        return CreateTable.NOTA.getSql();
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
