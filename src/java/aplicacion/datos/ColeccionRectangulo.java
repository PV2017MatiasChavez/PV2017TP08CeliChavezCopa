/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos;

import aplicacion.modelo.dominio.Rectangulo;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class ColeccionRectangulo implements Serializable {
    private ArrayList<Rectangulo> rectangulos;

    public ColeccionRectangulo() {
        rectangulos= new ArrayList();
    }
    
      public void agregarRectangulos(Rectangulo unRec){
        getRectangulos().add(unRec);
    }
    
    
    public void eliminarRectangulos(Rectangulo unRec){
        for(Rectangulo a: getRectangulos()){
            if(a.getX1()==unRec.getX1()){
                getRectangulos().remove(getRectangulos().indexOf(a));
                break;
            }
        }
    }

    /**
     * @return the rectangulos
     */
    public ArrayList<Rectangulo> getRectangulos() {
        return rectangulos;
    }

    /**
     * @param rectangulos the rectangulos to set
     */
    public void setRectangulos(ArrayList<Rectangulo> rectangulos) {
        this.rectangulos = rectangulos;
    }
    
    
}
