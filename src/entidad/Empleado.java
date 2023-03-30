/*
 Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado 
en función de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado 
tiene más de 30 años o del 5% si tiene menos de 30 años.

 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class Empleado {
    private String nombre;
    private int edad;
    private float salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void calcular_aumento(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del empleado");
        nombre=leer.next();
        System.out.println("Ingrese la edad");
        edad=leer.nextInt();
        System.out.println("Ingrese el salario actual");
        salario=leer.nextFloat();
        
        if (edad>30) {
            salario=salario*1.1f;
            
            System.out.println("El aumento corresponde al 10%, por lo tanto el sueldo deberia ser de "+salario);
            
        }else if (edad<30) {
            salario=salario*1.05f;
            
            System.out.println("El aumento corresponde al 5%, por lo tanto deberia ser de "+salario);
            
        }
        
        
    }
}
