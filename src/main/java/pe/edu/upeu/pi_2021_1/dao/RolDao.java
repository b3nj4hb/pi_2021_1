/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.pi_2021_1.dao;

import java.util.List;
import pe.edu.upeu.pi_2021_1.model.Rol;

/**
 *
 * @author benja
 */
public interface RolDao {

    int create(Rol a);

    int update(Rol a);

    int delete(int id);

    Rol read(int id);

    List<Rol> readAll();

}
