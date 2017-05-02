/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.bean.form;

import aplicacion.modelo.dominio.ArregloNumeros;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Matías
 */
@ManagedBean
@ViewScoped
public class NumeroFormBean implements Serializable{
    private ArregloNumeros numeros;
    private int number, mayor, menor;
    private double promedio;

    /**
     * Creates a new instance of NumeroFormBean
     */
    public NumeroFormBean() {
        numeros= new ArregloNumeros();
    }
    
    public void agregarNumero(){
        getNumeros().agregarNumero(getNumber());
    }
    
    public void calcularMayMenProm(){
        setMayor(getNumeros().calcularMayor());
        setMenor(getNumeros().calcularMenor());
        setPromedio(getNumeros().calcularPromedio());
    }

    /**
     * @return the numeros
     */
    public ArregloNumeros getNumeros() {
        return numeros;
    }

    /**
     * @param numeros the numeros to set
     */
    public void setNumeros(ArregloNumeros numeros) {
        this.numeros = numeros;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the mayor
     */
    public int getMayor() {
        return mayor;
    }

    /**
     * @param mayor the mayor to set
     */
    public void setMayor(int mayor) {
        this.mayor = mayor;
    }

    /**
     * @return the menor
     */
    public int getMenor() {
        return menor;
    }

    /**
     * @param menor the menor to set
     */
    public void setMenor(int menor) {
        this.menor = menor;
    }

    /**
     * @return the promedio
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

}
