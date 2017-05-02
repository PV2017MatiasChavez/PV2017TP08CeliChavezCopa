/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.bean.form;

import aplicacion.datos.ColeccionLibros;
import aplicacion.modelo.dominio.Libro;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Matías
 */
@ManagedBean
@ViewScoped
public class LibroFormBean {
    private ColeccionLibros libros;
    private Libro libro;
    private int isbn;
    private String titulo;
    private String autor;
    private double precio;
    /**
     * Creates a new instance of LibroFormBean
     */
    public LibroFormBean() {
        libros = new ColeccionLibros();        
    }
    public void agregarLibros(){
        setLibro(new Libro(getIsbn(), getTitulo(), getAutor(), getPrecio()));
        getLibros().agregarAutos(getLibro());
    }
    public void establecerLibro(Libro unLibro){
        setLibro(unLibro);
    }

    /**
     * @return the libros
     */
    public ColeccionLibros getLibros() {
        return libros;
    }

    /**
     * @param libros the libros to set
     */
    public void setLibros(ColeccionLibros libros) {
        this.libros = libros;
    }

    /**
     * @return the libro
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * @param libro the libro to set
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    /**
     * @return the isbn
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
