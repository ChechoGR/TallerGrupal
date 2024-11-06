//Main, solo para añadir los métodos

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Metodos m = new Metodos();
        JOptionPane.showMessageDialog(null, "Bienvenido a la plataforma!");
        LinkedList<EstudianteIng> lista1 = new LinkedList<>();
        LinkedList<Computador> lista2 = new LinkedList<>();
        LinkedList<EstudianteDis> lista3 = new LinkedList<>();
        LinkedList<Tableta> lista4 = new LinkedList<>();
        boolean bandera = true;
        while (bandera) {
            int seleccion_opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU PRINCIPAL \n" +
                    "Seleccione una opción \n" + "Opción 1: Llenar listas \n" +
                    "Opción 2: Mostrar listas \n" +
                    "Opción 3: Importar listas \n" + "Opción 4: Exportar listas\n"
                    + "Opción 5: Modificar nombre o marca de las listas \n" + "Opción 6: ABIERTA \n" + "Opción 9: Salir del sistema."));
            switch (seleccion_opcion) {
                case 1: // Llenar lista estudiantes ingenieria
                    boolean bandera1 = true;
                    while (bandera1) {
                        int seleccion_opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "***MENÚ LLENAR LISTAS ***" +
                                        "Seleccione una opción \n" + "Opción 1: Llenar lista estudiantes ingeniería\n" +
                                        "Opción 2: Llenar lista estudiantes diseño\n" +
                                        "Opción 3: Llenar lista de computadores\n"
                                        + "Opción 4: Llenar lista de tabletas\n"
                                        + "Opción 5: Volver al menú principal\n"));
                        switch (seleccion_opcion2) {
                            case 1:
                                lista1 = m.IngresarRegistro1(lista1); // Llenar lista estudiantes ingeniería
                                bandera1 = false;
                                break;
                            case 2:
                                lista3 = m.IngresarRegistro3(lista3); // Llenar lista estudiantes diseño
                                bandera1 = false;
                                break;
                            case 3: // Llenar lista computador
                                lista2 = m.IngresarRegistro2(lista2);
                                bandera1 = false;
                                break;
                            case 4:// Llenar lista Tableta
                                lista4 = m.IngresarRegistro4(lista4);
                                bandera1 = false;
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "Volviendo al menú principal");
                                bandera1 = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
                                break;
                        }
                    }
                    break;
                case 2: // Mostrar las listas
                    boolean bandera2 = true;
                    while (bandera2) {
                        int seleccion_opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "*** MENU MOSTRAR LISTAS*** " +
                                        "Seleccione una opción \n" + "Opción 1: Mostrar estudiantes ingeniería\n" +
                                        "Opción 2: Mostrar lista estudiantes diseño\n" +
                                        "Opción 3: Mostrar lista de computadores\n"
                                        + "Opción 4: Mostrar lista de tabletas\n"
                                        + "Opción 5: Volver al menú principal\n"));
                        switch (seleccion_opcion3) {
                            case 1: // Mostrar lista ingeniería
                                m.MostrarRegistro1(lista1);
                                break;
                            case 2: // Mostrar lista diseño
                                m.MostrarRegistro3(lista3);
                                break;
                            case 3: // Mostrar lista computadores
                                m.MostrarRegistro2(lista2);
                                break;
                            case 4: // Mostrar lista Tabletas
                                m.MostrarRegistro4(lista4);
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "Volviendo al menú principal");
                                bandera2 = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
                                break;
                        }
                    }
                    break;
                case 3: // Importar listas
                    boolean bandera3 = true;
                    while (bandera3) {
                        int seleccion_opcion4 = Integer
                                .parseInt(JOptionPane.showInputDialog(null, "***MENÚ IMPORTAR LISTAS*** \n" +
                                        "Seleccione una opción \n" + "Opción 1: Importar lista estudiantes Ing. \n" +
                                        "Opción 2: Importar lista estudiantes Diseño \n" +
                                        "Opción 3: Importar lista computadores \n"
                                        + "Opción 4: Importar listas tabletas\n"
                                        + "Opción 5: Volver al menú \n"));
                        switch (seleccion_opcion4) {
                            case 1:
                                bandera3 = false;

                                break;
                            case 2:
                                bandera3 = false;

                                break;
                            case 3:
                                bandera3 = false;

                                break;
                            case 4:
                                bandera3 = false;

                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "Volviendo al menú principal");
                                bandera3 = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
                                break;

                        }
                    }

                    break;
                case 4: // Exportar listas
                    boolean bandera4 = true;
                    while (bandera4) {
                        int seleccion_opcion5 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "***MENÚ EXPORTAR LISTAS*** \n" +
                                        "Seleccione una opción \n" + "Opción 1: Exportar lista estudiantes Ing. \n" +
                                        "Opción 2: Exportar lista estudiantes Diseño \n" +
                                        "Opción 3: Exportar lista computadores \n"
                                        + "Opción 4: Exportar listas tabletas\n"
                                        + "Opción 5: Volver al menú \n"));
                        switch (seleccion_opcion5) {
                            case 1:
                                bandera4 = false;
                                break;
                            case 2:
                                bandera4 = false;
                                break;
                            case 3:
                                bandera4 = false;
                                break;
                            case 4:
                                bandera4 = false;
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "Volviendo al menú principal");
                                bandera4 = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
                                break;
                        }
                    }
                    break;
                case 5:
                    boolean bandera5 = true;
                    while (bandera5) {
                        int seleccion_opcion6 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "***MODIFICAR NOMBRE DE USUARIO A PARTIR DE LA CÉDULA*** \n" +
                                        "Seleccione una opción \n" + "Opción 1: Modificar estudiantes Ing. \n" +
                                        "Opción 2: Modificar estudiantes Diseño \n" +
                                        "Opción 3: Modificar (marca) computadores \n"
                                        + "Opción 4: ]Modificar (marca)tabletas\n"
                                        + "Opción 5: Volver al menú \n"));
                        switch (seleccion_opcion6) {
                            case 1:
                                m.ModificarRegistro1(lista1);
                                bandera5 = false;
                                break;
                            case 2:
                                bandera5 = false;
                                break;
                            case 3:
                                bandera5 = false;
                                break;
                            case 4:
                                bandera5 = false;
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "Volviendo al menú principal");
                                bandera5 = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
                                break;
                        }

                    }
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Finalizando el programa \n" + "Vuelva pronto!");
                    bandera = false;

                    break;
            }
        }
    }
}