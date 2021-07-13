/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.pi_2021_1.dao;

import java.util.List;
import pe.edu.upeu.pi_2021_1.model.Empre;

/**
 *
 * @author benja
 */
public interface EmpreDao {

    public int create(Empre a);

    public int update(Empre a);

    public int delete(int id);

    public Empre read(int id);

    public List<Empre> readAll();
}
