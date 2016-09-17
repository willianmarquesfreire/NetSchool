package entidades;

import sql.CreateTable;

public class Aluno extends PessoaFisica {

    private String registroAcademico;
    private Turma turma;

    public Aluno(String registroAcademico, Turma turma) {
        this.registroAcademico = registroAcademico;
        this.turma = turma;
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
        StringBuilder sb = new StringBuilder();
        sb.append(CreateTable.ALUNO);
        return sb.toString();
    }

    public String getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(String registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
