/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.pi_2021_1.dao;

import java.util.List;
import pe.edu.upeu.pi_2021_1.model.Unidad;

/**
 *
 * @author benja
 */
public interface UnidadDao {

    public int create(Unidad a);

    public int update(Unidad a);

    public int delete(int id);

    public Unidad read(int id);

    public List<Unidad> readAll();
}
