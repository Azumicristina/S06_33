/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s06;

/**
 *
 * @author Windows
 */
public class Estudiante_33 {

     // Attributes
    private String nombre;
    private int edad;
    private double promedio;

    // Constructors
    public Estudiante_33() {
        // Default constructor
    }

    public Estudiante_33(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante_33(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    // Methods
    public void estudiar() {
        System.out.println(nombre + " está estudiando.");
    }

    public void estudiar(String materia) {
        System.out.println(nombre + " está estudiando " + materia + ".");
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }
}
  
