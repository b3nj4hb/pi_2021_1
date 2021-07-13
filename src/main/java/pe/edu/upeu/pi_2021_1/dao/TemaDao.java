/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.pi_2021_1.dao;

import java.util.List;
import pe.edu.upeu.pi_2021_1.model.Tema;

/**
 *
 * @author benja
 */
public interface TemaDao {

    public int create(Tema a);

    public int update(Tema a);

    public int delete(int id);

    public Tema read(int id);

    public List<Tema> readAll();
}
