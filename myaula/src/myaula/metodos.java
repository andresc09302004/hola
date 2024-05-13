/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myaula;
import java.util.Scanner;
/**
 *
 * @author utpl
 */
public class metodos {
    Scanner entrada ;
    alumno[] myaula;
    int ev;

    public metodos(int lim) {
        this.entrada = new Scanner(System.in) ;
        this.myaula =new alumno[lim];
        this.ev= 0;
        
    }
    public int menu () {
        System.out.println("Insertar    [1]");
        System.out.println("Precentar    [2]");
        System.out.println("salir     [3]");
        System.out.println("Insertar    [4]");
        System.out.println("Insertar    [0]");
        return entrada.nextInt();
    }
    public boolean eulallena(){
        return  (ev == myaula.length);
    }
    public boolean eulaVacia(){
        return  (ev == 0);
    }
    public alumno leerDatos(){
        int id;
        String Nom;
        char sexo;
        float[] nota = new float[3];
        entrada.nextLine();
        System.out.println("ingresa id: ");
        id = entrada.nextInt();
        System.out.println("ingresa nombre: ");
        Nom = entrada.nextLine();
        System.out.println("ingresa sexo: ");
        sexo = entrada.next().charAt(0);
        for (int i = 0; i < 3; i++) {
            System.out.println("ingresa nota "+ (i+1));
            nota[i] = entrada.nextFloat();
            
        }
        alumno nuevo = new alumno( id, Nom, sexo, nota);
        return nuevo;
    }
    public void insertar(){
        if(!eulallena()){
            
            myaula[ev]=Nom;
            ev++;
        }else
            System.out.println("AULA ESTA LLENA");
    }    
    public void precentar() {
        if (!eulaVacia()){ 
            for (int i = 0; i <ev; i++) {
                System.out.println("id: " +myaula[i].id);
                System.out.println("nombre " +myaula[i].Nom);
                System.out.println("sexo: " +myaula[i].sexo);
                System.out.println("nota 1 : " +myaula[i].id);
                System.out.println("nota 2  " +myaula[i].id);
                System.out.println("id; " +myaula[i].id);
                System.out.println("id; " +myaula[i].id);
                System.out.println("id; " +myaula[i].id);

            }
         
            
            
        }
        
    }
    
}
