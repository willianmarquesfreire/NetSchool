package entidades;

import sql.CreateTable;

public class Presenca extends EntidadeAbstrata {

    private Boolean confirmada;
    private AlunoPeriodoDisciplina alunoPeriodoDisciplina;
    private Dia dia;

    public Presenca(Long id, Boolean confirmada, AlunoPeriodoDisciplina alunoPeriodoDisciplina, Dia dia) {
        this.id = id;
        this.confirmada = confirmada;
        this.alunoPeriodoDisciplina = alunoPeriodoDisciplina;
        this.dia = dia;
    }

    public Boolean getConfirmada() {
        return confirmada;
    }

    public void setConfirmada(Boolean confirmada) {
        this.confirmada = confirmada;
    }

    public AlunoPeriodoDisciplina getAlunoPeriodoDisciplina() {
        return alunoPeriodoDisciplina;
    }

    public void setAlunoPeriodoDisciplina(AlunoPeriodoDisciplina alunoPeriodoDisciplina) {
        this.alunoPeriodoDisciplina = alunoPeriodoDisciplina;
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    @Override
    public String create() {
        return CreateTable.PRESENCA.getSql();
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
