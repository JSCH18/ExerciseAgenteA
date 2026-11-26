/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.sena.exerciseagentea.controller;

import co.edu.sena.exerciseagentea.model.User;
import java.util.List;

/**
 * Fecha: 29/10/2026
 * @author afescobarv
 * Objetivo: interface controlador linea
 */
public interface IUserController {
    public void insert(User user) throws Exception;
    public void update(User user) throws Exception;
    public void delete(int id) throws Exception;
    public User find(int id) throws Exception;
    public List<User> findAll() throws Exception;
}
