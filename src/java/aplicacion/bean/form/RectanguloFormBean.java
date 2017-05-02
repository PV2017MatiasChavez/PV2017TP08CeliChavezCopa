/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.bean.form;

import aplicacion.datos.ColeccionRectangulo;
import aplicacion.modelo.dominio.Rectangulo;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class RectanguloFormBean implements Serializable {
    private ColeccionRectangulo rectangulos;
    private Rectangulo rectangulo;
    private int puntos,x1,y1;
    private int base;
    private int altura;
    private int sup;
    private int per;
    /**
     * Creates a new instance of RectanguloFormBean
     */
    public RectanguloFormBean() {
        rectangulos= new ColeccionRectangulo();
    }
    
    public void agregarRectangulos(){
        setRectangulo(new Rectangulo(getX1(),getY1(),getBase(),getAltura(),getSup(),getPer()));
        getRectangulos().agregarRectangulos(getRectangulo());
    }
    
    public void establecerRectangulo(Rectangulo unRec){
        setRectangulo(unRec);
        
    }
    
    public void eliminarRectangulos(){
        getRectangulos().eliminarRectangulos(getRectangulo());
    }

    public double calcularSuperficie(){
        setSup(getAltura() * getBase());
        return getSup();
    }
    public double calcularPerimetro(){
        setPer(getAltura() * 2 + getBase() * 2);
        return getPer();
    }
    
    
    /**
     * @return the rectangulos
     */
    public ColeccionRectangulo getRectangulos() {
        return rectangulos;
    }

    /**
     * @param rectangulos the rectangulos to set
     */
    public void setRectangulos(ColeccionRectangulo rectangulos) {
        this.rectangulos = rectangulos;
    }

    /**
     * @return the rectangulo
     */
    public Rectangulo getRectangulo() {
        return rectangulo;
    }

    /**
     * @param rectangulo the rectangulo to set
     */
    public void setRectangulo(Rectangulo rectangulo) {
        this.rectangulo = rectangulo;
    }

    /**
     * @return the puntos
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * @param puntos the puntos to set
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the sup
     */
    public int getSup() {
        return sup;
    }

    /**
     * @param sup the sup to set
     */
    public void setSup(int sup) {
        this.sup = sup;
    }

    /**
     * @return the per
     */
    public int getPer() {
        return per;
    }

    /**
     * @param per the per to set
     */
    public void setPer(int per) {
        this.per = per;
    }

    /**
     * @return the x1
     */
    public int getX1() {
        return x1;
    }

    /**
     * @param x1 the x1 to set
     */
    public void setX1(int x1) {
        this.x1 = x1;
    }

    /**
     * @return the y1
     */
    public int getY1() {
        return y1;
    }

    /**
     * @param y1 the y1 to set
     */
    public void setY1(int y1) {
        this.y1 = y1;
    }
    
    
}
