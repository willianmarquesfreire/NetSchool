package entidades;

import sql.CreateTable;

public class AlunoPeriodoDisciplina extends EntidadeAbstrata {

    private Aluno aluno;
    private PeriodoDisciplina periodoDisciplina;

    public AlunoPeriodoDisciplina(Long id, Aluno aluno, PeriodoDisciplina periodoDisciplina) {
        this.id = id;
        this.aluno = aluno;
        this.periodoDisciplina = periodoDisciplina;
    }

    public PeriodoDisciplina getPeriodoDisciplina() {
        return periodoDisciplina;
    }

    public void setPeriodoDisciplina(PeriodoDisciplina periodoDisciplina) {
        this.periodoDisciplina = periodoDisciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public String create() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateTable.ALUNOPERIODODISCIPLINA);
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
