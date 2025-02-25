/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wirtz.practicas.boletinhashmap;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author nicolas.gareacidre
 */
public class UtilLog {
     public static ArrayList<User> generarUsuarios(int cantidad) {
        ArrayList<User> usuarios = new ArrayList<>();
        Random random = new Random();

        String[] nombres = {"fer1", "luis86", "ana_cps2002", "MariaFernandez", "JZm46Y", "___121aZ", "M.Rajoy", "Usuario"};
        String[] passwords = {"123456", "000000", "AzLmR56", "655786995", "zxcvbnm", "qwerty", "password", "666666"};
        String[] apellidos = {"González", "Fernández", "López", "Martínez", "Sánchez", "Ramírez", "Torres", "Díaz"};
        String[] dnis = {"12345678A", "87654321B", "11223344C", "44332211D", "99887766E", "66554433F", "22334455G", "77889900H"};
        String[] direcciones = {"Calle Mayor 1", "Avenida Siempre Viva 742", "Calle Falsa 123", "Paseo del Prado 25", "Gran Vía 10", "Rambla Cataluña 33", "Calle del Sol 5", "Plaza Mayor 7"};
        
        // Agregar usuarios predefinidos
        for (int i = 0; i < nombres.length; i++) {
            usuarios.add(new User(nombres[i], passwords[i], apellidos[i], dnis[i], direcciones[i]));
        }

        // Generar usuarios adicionales
        for (int i = 0; i < cantidad; i++) {
            String nombre = nombres[random.nextInt(nombres.length)] + i;
            String password = passwords[random.nextInt(passwords.length)];
            String apellido = apellidos[random.nextInt(apellidos.length)];
            String dni = "0000000" + i + "X"; // Generar un DNI ficticio
            String direccion = direcciones[random.nextInt(direcciones.length)];
      
            usuarios.add(new User(nombre, password, apellido, dni, direccion));
        }
        
        return usuarios;
    }
     
    public static int potencia(int base, int exponente){
         if (exponente==0){
             return 1;
         } else if(base==0){
             return 0;
         }else{
             return base * potencia(base, exponente-1);
         }
     }
    
    public static int multiplicacion(int numero, int numeroVeces){
        if(numeroVeces==0){
            return 0;
        }else{
            return numero + multiplicacion(numero, numeroVeces-1);
        }
    }
    
    public static String obtenerReverso(String cadena, int pos){
        if (pos<0){
            return "";
        }else{
            return cadena.charAt(pos) + obtenerReverso(cadena, pos - 1);
        }
    }
    
    public static boolean esPrimo(int numero, int n){
        if(n==1){
        return true;
        }else if(numero%n==0){
            return false;
        }else{
            return esPrimo(numero, n-1);
        }
    }
}
