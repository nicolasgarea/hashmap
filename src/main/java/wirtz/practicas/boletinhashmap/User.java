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
    private String name;
    private String password;
    private String surnames;
    private String dni;
    private String direction;

    public User(String name, String password, String surnames, String dni, String direction) {
        this.name = name;
        this.password = password;
        this.surnames = surnames;
        this.dni = dni;
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getSurnames() {
        return surnames;
    }

    public String getDni() {
        return dni;
    }

    public String getDirection() {
        return direction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    
    
}
