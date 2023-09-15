
package peluqueria;

public class Persona {
    protected String nombres1;
    protected int edad;
    protected String profesion;

    public Persona(String nombre, int edad, String profesion){
       this.nombres1 = nombre; 
       this.edad = edad; 
       this.profesion = profesion; 
    }

    public String getNombre() {
        return nombres1;
    }

    public void setNombre(String nombre) {
        this.nombres1 = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
}
