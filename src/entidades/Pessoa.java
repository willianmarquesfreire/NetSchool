package entidades;

import sql.CreateTable;

/** Autores de todas as classes: Lucas e Willian */
public class Pessoa extends EntidadeAbstrata{
    
    @Override
    public String create() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateTable.PESSOA);        
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
