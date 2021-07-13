/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.pi_2021_1.dao;

import java.util.List;
import pe.edu.upeu.pi_2021_1.model.Capa;

/**
 *
 * @author benja
 */
public interface CapaDao {

    public int create(Capa a);

    public int update(Capa a);

    public int delete(int id);

    public Capa read(int id);

    public List<Capa> readAll();
}
