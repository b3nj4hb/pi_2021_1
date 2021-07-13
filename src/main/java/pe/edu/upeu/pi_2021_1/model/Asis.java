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
public class Asis {

    private int idasis;
    private String asistencia;
    private String observacion;

    public Asis() {
    }

    public Asis(String asistencia, String observacion) {
        this.asistencia = asistencia;
        this.observacion = observacion;
    }

    public int getIdasis() {
        return idasis;
    }

    public void setIdasis(int idasis) {
        this.idasis = idasis;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

}
