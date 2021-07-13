/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.pi_2021_1.dao;

import java.util.List;
import pe.edu.upeu.pi_2021_1.model.Usuario;

/**
 *
 * @author benja
 */
public interface UsuarioDao {

    public Usuario validar(String user, String pass);

    public int create(Usuario u);

    public int update(Usuario u);

    public int delete(int id);

    public Usuario read(int id);

    public List<Usuario> readAll();

}
