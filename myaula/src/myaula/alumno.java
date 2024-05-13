/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myaula;

/**
 *
 * @author utpl
 */
public class alumno extends persona {
    float[] calif;

    public alumno(int id, String Nom, char sexo,float[] nota) { //float 
        super(id, Nom, sexo);
        this.calif = nota;
    }
    
}
