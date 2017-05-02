/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos;

import aplicacion.modelo.dominio.Libro;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class ColeccionLibros implements Serializable{
    private ArrayList<Libro> libros;

    public ColeccionLibros() {
        libros = new ArrayList();
    }
    
    public void agregarAutos(Libro unLibro){
        getLibros().add(unLibro);
    }

    /**
     * @return the libros
     */
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    /**
     * @param libros the libros to set
     */
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
}
