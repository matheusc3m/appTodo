/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unipam.service;

import br.edu.unipam.entity.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author josereis
 */
public class UsuarioService {

    @PersistenceContext(name = "pu_todo")
    private EntityManager entityManager;

    public Usuario salvarUsuario(Usuario usuario) {
        entityManager.persist(usuario);
        return usuario;
    }
    
    //Listar Todos os usuários
    
    //
}
