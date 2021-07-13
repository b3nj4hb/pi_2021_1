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
public class Curso {

    private int idcurso;
    private String nombre;

    public Curso() {
    }

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
