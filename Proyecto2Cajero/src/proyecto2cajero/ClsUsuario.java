package proyecto2cajero;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ClsUsuario {

    //Atributos
    protected String user;
    protected String  pass;
    private int opcion = 0;
    BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

    //Constructor
    public ClsUsuario(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    //Constructor vacío para instanciar en otras clases
    public ClsUsuario() {
    }

    //Getters & Setters de atributos
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
