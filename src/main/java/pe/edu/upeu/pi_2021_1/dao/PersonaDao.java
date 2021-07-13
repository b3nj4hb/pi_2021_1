/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.pi_2021_1.dao;

import java.util.List;
import pe.edu.upeu.pi_2021_1.model.Persona;

/**
 *
 * @author benja
 */
public interface PersonaDao {

    public int create(Persona a);

    public int update(Persona a);

    public int delete(int id);

    public Persona read(int id);

    public List<Persona> readAll();
}
