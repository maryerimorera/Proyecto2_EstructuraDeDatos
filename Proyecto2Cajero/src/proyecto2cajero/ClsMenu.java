package proyecto2cajero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClsMenu extends ClsUsuario {

    static int opcion = 0;
    static int nombre = 0;

    ClsCola cola = new ClsCola();
    ClsCola cajero1 = new ClsCola();
    ClsCola cajero2 = new ClsCola();
    ClsCola cajero3 = new ClsCola();
    ClsCola cajero4 = new ClsCola();
    BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

    //Objetos

    public ClsMenu(String user, String pass) {
        super(user, pass);
    }

    public ClsMenu(){}


    //Metodos para Menu
    public void MenuCliente() {
        boolean ValidarOpcion = true;
        while (ValidarOpcion) {
            try {
                System.out.println("**** Elija una opcion ****");
                System.out.println("1- Ingresar a un cajero");
                System.out.println("2- Salir");
                opcion = Integer.parseInt(leer.readLine());

                if (opcion == 1) {
                    if (cola.Filallena()) {
                        System.out.println("La fila esta llena");
                    } else {
                        nombre = 1;
                        try {
                            
                            System.out.println("Cajeros disponibles, seleccione uno");
                            System.out.println("1 - El cajero 1 tiene por atender a " + cajero1.tamanio() + " personas");
                            System.out.println("2 - El cajero 2 tiene por atender a " + cajero2.tamanio() + " personas");
                            System.out.println("3 - El cajero 3 tiene por atender a " + cajero3.tamanio() + " personas");
                            System.out.println("4 - El cajero 4 tiene por atender a " + cajero4.tamanio() + " personas");
                            System.out.println("5 - Salir");
                            opcion = Integer.parseInt(leer.readLine());

                            switch (opcion) {
                                case 1:
                                    cajero1.Insertar(nombre);
                                    System.out.println("Se registro al el cajero 1 una persona con EXITO");
                                    break;
                                case 2:
                                    cajero2.Insertar(nombre);
                                    System.out.println("Se registro al el cajero 2 una persona con EXITO");
                                    break;
                                case 3:
                                    cajero3.Insertar(nombre);
                                    System.out.println("Se registro al el cajero 3 una persona con EXITO");
                                    break;
                                case 4:
                                    cajero4.Insertar(nombre);
                                    System.out.println("Se registro al el cajero 4 una persona con EXITO");
                                    break;
                                default:
                                    System.out.println("Digite una opcion valida");
                                    break;
                            }

                        } catch (Exception ex) {
                            Logger.getLogger(ClsInicio.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    if (opcion == 5) {
                        ValidarOpcion = false;
                        System.out.println("Gracias por usar nuestro Sistema Escolar");
                    } else {
                        System.out.println("Ingrese una opción válida");
                    }
                }else{
                    ValidarOpcion = false;
                }
            } catch (IOException ex) {
                Logger.getLogger(ClsInicio.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }

    public void MenuCajero() throws IOException {
        boolean ValidarOpcion = true;
        while (ValidarOpcion) {
            try {
                System.out.println("**** Elija una opcion ****");
                System.out.println("1- Seleccionar un cajero");
                System.out.println("2- Salir");
                opcion = Integer.parseInt(leer.readLine());
                if (opcion == 1) {

                    try {
                        System.out.println("Seleccione el cajero del que desea eliminar un cliente");
                        System.out.println("Cajeros disponibles, seleccione uno");
                        System.out.println("1 - El cajero 1 tiene por atender a " + cajero1.tamanio() + " personas");
                        System.out.println("2 - El cajero 2 tiene por atender a " + cajero2.tamanio() + " personas");
                        System.out.println("3 - El cajero 3 tiene por atender a " + cajero3.tamanio() + " personas");
                        System.out.println("4 - El cajero 4 tiene por atender a " + cajero4.tamanio() + " personas");

                        switch (opcion) {
                            case 1:
                                if (cajero1.FilaVacia()) {
                                    System.err.println("");
                                } else {
                                    try {
                                        System.out.println(cajero1.Eliminar());
                                    } catch (Exception ex) {
                                        Logger.getLogger(ClsInicio.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                                break;
                            case 2:
                                if (cajero1.FilaVacia()) {
                                    System.err.println("");
                                } else {
                                    try {
                                        System.out.println(cajero1.Eliminar());
                                    } catch (Exception ex) {
                                        Logger.getLogger(ClsInicio.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                                break;
                            case 3:
                                if (cajero1.FilaVacia()) {
                                    System.err.println("");
                                } else {
                                    try {
                                        System.out.println(cajero1.Eliminar());
                                    } catch (Exception ex) {
                                        Logger.getLogger(ClsInicio.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                                break;
                            case 4:
                                if (cajero1.FilaVacia()) {
                                    System.err.println("");
                                } else {
                                    try {
                                        System.out.println(cajero1.Eliminar());
                                    } catch (Exception ex) {
                                        Logger.getLogger(ClsInicio.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                                break;
                            default:
                                System.out.println("Digite una opcion valida");
                                break;
                        }

                    } catch (Exception ex) {
                        Logger.getLogger(ClsInicio.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    ValidarOpcion = false;
                }
            } catch (IOException ex) {
                Logger.getLogger(ClsInicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //Metodo solicitar credenciales
    public void SolicitarCredenciales() throws IOException {
        
        boolean ValidarOpcion = true;
        while(ValidarOpcion){   
            System.out.println("Por favor ingrese si su perfil es de 1: cajero, o 2: cliente");
            user = leer.readLine();       
            if ("1".equals(user)) {
                System.out.println("Ingrese su contraseña");
                pass = leer.readLine();
                ValidarCredenciales();
                MenuCajero();
            } else if ("2".equals(user)){
                MenuCliente();
            }else{
                ValidarOpcion = true;
            }
        }       
    }

    //Metodo para validar credenciales
    public void ValidarCredenciales() {
        int contador = 0;
        while (contador < 1) {
            if (this.pass.equals("123")) {
                MostrarMensaje();
                contador = 1;
            } else {
                System.out.println("Credenciales no válidas");
                contador = contador + 1;
            }

        }
    }

    //si ingresa muestra este método de mensaje, pertenece a validar credenciales
    public void MostrarMensaje() {
        System.out.println("Usted ha ingresado de forma exitiosa en el rol de cajero");
    }

}
