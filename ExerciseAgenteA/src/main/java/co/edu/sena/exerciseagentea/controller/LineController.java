/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.controller;

import co.edu.sena.exerciseagentea.data.DataStore;
import co.edu.sena.exerciseagentea.model.Line;
import java.util.List;


/**
 * Fecha: 29/10/2026
 * @author afescobarv
 * Objetivo: controlador linea
 */
public class LineController implements ILineController {
    private List<Line> lineList = DataStore.getLineList();

    @Override
    public void insert(Line line) throws Exception {
        if(line == null)
        {
            throw new Exception("La Línea está vacía");
        }
        
        if(line.getId() == 0)
        {
            throw new Exception("El Id es obligatorio");
        }
        
        if("".equals(line.getName()))
        {
            throw new Exception("El nombre es obligatorio");
        }
        
        lineList.add(line);
    }

    @Override
    public void update(Line line) throws Exception {
        if(line == null)
        {
            throw new Exception("La Línea está vacía");
        }
        
        if(line.getId() == 0)
        {
            throw new Exception("El Id es obligatorio");
        }
        
        if("".equals(line.getName()))
        {
            throw new Exception("El nombre es obligatorio");
        }
        
        //verificar existencia de la linea a actualizar
        boolean exists = false;
        for (int i = 0; i < lineList.size(); i++) {
            if(lineList.get(i).getId() == line.getId())
            {
                lineList.set(i, line);  //actualiza
                exists = true;
                break;
            }
        }
        
        if(!exists)
        {
            throw new Exception("La línea no existe");
        } 
    }

    @Override
    public void delete(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El id es obligatorio");
        }
        
        //verificar existencia de la linea a eliminar
        boolean exists = false;
        for (int i = 0; i < lineList.size(); i++) {
            if(lineList.get(i).getId() == id)
            {
                lineList.remove(i);  //elimina
                exists = true;
                break;
            }
        }
        
        if(!exists)
        {
            throw new Exception("La línea no existe");
        } 
    }

    @Override
    public Line find(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El id es obligatorio");
        }
        
        Line line = null;
        for (Line l : lineList) {
            if(l.getId() == id)
            {
                line = l;
                break;
            }
        } 
        
        return line;
    }

    @Override
    public List<Line> findAll() throws Exception {
        return lineList;
    }
    
}
