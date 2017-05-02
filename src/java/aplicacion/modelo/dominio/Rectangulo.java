/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Alumno
 */
public class Rectangulo implements Serializable {
    private int x1,y1;
    private int base;
    private int altura;
    private int sup;
    private int per;

    public Rectangulo() {
    }

    public Rectangulo(int x1,int y1, int base, int altura, int sup, int per) {
        this.x1 = x1;
        this.y1 = y1;
        this.base = base;
        this.altura = altura;
        this.sup = sup;
        this.per = per;
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
