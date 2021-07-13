/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.pi_2021_1.dao;

import java.util.List;
import pe.edu.upeu.pi_2021_1.model.Asis;

/**
 *
 * @author benja
 */
public interface AsisDao {

    public int create(Asis a);

    public int update(Asis a);

    public int delete(int id);

    public Asis read(int id);

    public List<Asis> readAll();
}
