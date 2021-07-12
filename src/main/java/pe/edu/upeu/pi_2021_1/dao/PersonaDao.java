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

    int create(Persona a);

    int update(Persona a);

    int delete(int id);

    Persona read(int id);

    List<Persona> readAll();
}
