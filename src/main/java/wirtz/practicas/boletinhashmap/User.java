/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wirtz.practicas.boletinhashmap;

/**
 *
 * @author nicolas.gareacidre
 */
public class User {
    private String nombre;
    private String password;
    private String apellidos;
    private String dni;
    private String direccion;

    public User(String nombre, String password, String apellidos, String dni, String direccion) {
        this.nombre = nombre;
        this.password = password;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDirection(String direction) {
        this.direccion = direction;
    }
    
    
}
