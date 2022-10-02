
package model;


public class Tripulante {
    int id;
    String Apellidos,nombres;

    public Tripulante() {
    }

    public Tripulante(int id, String Apellidos, String nombres) {
        this.id = id;
        this.Apellidos = Apellidos;
        this.nombres = nombres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    
    
    
}
