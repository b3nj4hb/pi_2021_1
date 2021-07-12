/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.pi_2021_1.model;

/**
 *
 * @author benja
 */
public class Capa {

    private int idcapa;
    private String especialidad;

    public Capa() {
    }

    public Capa(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getIdcapa() {
        return idcapa;
    }

    public void setIdcapa(int idcapa) {
        this.idcapa = idcapa;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
