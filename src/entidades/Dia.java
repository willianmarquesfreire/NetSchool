package entidades;

import java.util.Date;
import sql.CreateTable;

public class Dia extends EntidadeAbstrata {

    private Date referencia;
    private String descricao;
    private Calendario calendario;

    public Dia(Long id, Date referencia, String descricao, Calendario calendario) {
        this.id = id;
        this.referencia = referencia;
        this.descricao = descricao;
        this.calendario = calendario;
    }

    public Date getReferencia() {
        return referencia;
    }

    public void setReferencia(Date referencia) {
        this.referencia = referencia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }

    @Override
    public String create() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateTable.DIA);
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
