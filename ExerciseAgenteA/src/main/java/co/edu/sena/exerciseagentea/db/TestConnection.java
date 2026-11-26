/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.db;

/**
 * Fecha: 25/11/2026
 * @author afescobar
 * Objetivo: clase para probar conexion a base de datos
 */
public class TestConnection {
    public static void main(String[] args) {
        DBConnection dbc = new DBConnection();
        dbc.connect();
        dbc.disconnect();
    }
}
