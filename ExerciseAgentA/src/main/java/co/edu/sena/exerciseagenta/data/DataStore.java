package co.edu.sena.exerciseagenta.data;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import static co.edu.sena.exerciseagenta.controller.ShedController.shedList;
import co.edu.sena.exerciseagenta.model.Shed;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aprendiz
 */
public class DataStore {
    private static List<Shed> shedlist = new ArrayList<>();
    
    static {
    shedList.add(new Shed(1, "DISPONIBLE"));
    shedList.add(new Shed(2, "DISPONIBLE"));
    shedList.add(new Shed(3, "OCUPADO"));
    }

    public static List<Shed> getShedlist() {
        return shedlist;
    }
}