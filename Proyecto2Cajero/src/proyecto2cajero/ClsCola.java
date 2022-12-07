package proyecto2cajero;

public class ClsCola {

    //Atributos
    private static final int MAXTAM = 10; // variable constante
    private static int frente;
    private static int ultimo;
    private final int[] cola;

    
    //Constructor
    public ClsCola() {
        frente = 0;
        ultimo = -1;
        cola = new int[MAXTAM];
    }

    //Metodos para las colas
    public void Insertar(int elemento) throws Exception {
        if (!Filallena()) {
            cola[++ultimo] = elemento;
        } else {
            throw new Exception("Limite de personas en la fila");
        }
    }

    public int Eliminar() throws Exception {
        if (!FilaVacia()) {
            return cola[frente++];
        } else {
            throw new Exception("No hay personas en la fila");
        }
    }

    public int Frente() throws Exception {
        if (!FilaVacia()) {
            return cola[frente];
        } else {
            throw new Exception("No hay personas en la fila");
        }
    }

    public boolean Filallena() {
        return ultimo == MAXTAM - 1;
    }

    public boolean FilaVacia() {
        return frente > ultimo;
    }

    public int tamanio(){
        
        int test=0;
        for (int i = 0; i < cola.length; i++) {
            if (cola[i] != 0) {
                test+=1;
            }
        }
        return test;
    }
    
}
