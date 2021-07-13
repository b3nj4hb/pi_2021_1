/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.pi_2021_1.dao;

import java.util.List;
import pe.edu.upeu.pi_2021_1.model.Curso;

/**
 *
 * @author benja
 */
public interface CursoDao {

    public int create(Curso a);

    public int update(Curso a);

    public int delete(int id);

    public Curso read(int id);

    public List<Curso> readAll();
}
