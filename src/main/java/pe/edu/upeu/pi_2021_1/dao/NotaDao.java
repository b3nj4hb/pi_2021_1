/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.pi_2021_1.dao;

import java.util.List;
import pe.edu.upeu.pi_2021_1.model.Nota;

/**
 *
 * @author benja
 */
public interface NotaDao {

    public int create(Nota a);

    public int update(Nota a);

    public int delete(int id);

    public Nota read(int id);

    public List<Nota> readAll();
}
