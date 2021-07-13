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
public class Empre {

    private int idempre;
    private String necesidad;

    public Empre() {
    }

    public Empre(String necesidad) {
        this.necesidad = necesidad;
    }

    public int getIdempre() {
        return idempre;
    }

    public void setIdempre(int idempre) {
        this.idempre = idempre;
    }

    public String getNecesidad() {
        return necesidad;
    }

    public void setNecesidad(String necesidad) {
        this.necesidad = necesidad;
    }

}
