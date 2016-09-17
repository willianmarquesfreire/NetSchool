/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author wmfsystem
 */
public abstract class EntidadeAbstrata implements Mapeavel {

    Long id;

    public EntidadeAbstrata() {
    }

    public EntidadeAbstrata(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}