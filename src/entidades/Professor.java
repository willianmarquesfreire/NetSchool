package entidades;

import sql.CreateTable;

class Professor extends PessoaFisica {

    private String titulo;

    public Professor(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String create() {
        return CreateTable.PROFESSOR.getSql();
    }

    @Override
    public String insert() {
        return super.insert(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update() {
        return super.update(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String select() {
        return super.select(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete() {
        return super.delete(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
