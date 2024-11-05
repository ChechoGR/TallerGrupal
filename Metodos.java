import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public LinkedList<EstudianteIng> IngresarRegistro1(LinkedList<EstudianteIng> lista1) {
        boolean continuar = true;
        while (continuar == true) {
            EstudianteIng EI = new EstudianteIng();
            boolean Validacion_cedula = false;
            while (!Validacion_cedula) {
                String ValidezCedula = JOptionPane.showInputDialog("Ingrese la cédula: ");
                if (ValidezCedula == null || ValidezCedula.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se ha ingresado una cédula válida!", "Error de entrada",
                            JOptionPane.ERROR_MESSAGE);
                    continue;
                }
            EI.setCedula(ValidezCedula);
            Validacion_cedula = true;
            }
            boolean Validacion_nombre = false;
            while (!Validacion_nombre){
                String Validez_nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
                if (Validez_nombre ==null || Validez_nombre.trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "No se ha ingresado nombre correctamente!", "Error de entrada",
                            JOptionPane.ERROR_MESSAGE);
                    continue;
                }
            EI.setNombre(Validez_nombre);
            Validacion_nombre = true;
            }
            EI.setApellido(JOptionPane.showInputDialog("Ingrese el apellido"));
            EI.setTelefono(JOptionPane.showInputDialog("Ingrese el telefono"));
            boolean ValidezSemestre = false;
            while (!ValidezSemestre) { // Bucle hasta que se tenga un semestre válido
                String Verif_semestre = JOptionPane.showInputDialog("Ingrese el semestre actual");
                if (Verif_semestre == null || Verif_semestre.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Debe ingresar un número entero.",
                            "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                try {
                    EI.setNumero(Integer.parseInt(Verif_semestre));
                    ValidezSemestre = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número entero válido.",
                            "Error de entrada", JOptionPane.ERROR_MESSAGE);
                }
            }
            boolean ValidezPromedio = false;
            while (!ValidezPromedio) {
                String Verif_promedio = JOptionPane.showInputDialog(("Ingrese su promedio académico"));
                if (Verif_promedio == null || Verif_promedio.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Debe ingresar un número entre 0 y 5",
                            "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                Verif_promedio = Verif_promedio.replace(",", ".");
                try {
                    EI.setPromedio_acum1(Float.parseFloat(Verif_promedio));
                    ValidezPromedio = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número válido.",
                            "Error de entrada", JOptionPane.ERROR_MESSAGE);
                }
            }
            EI.setSerial(JOptionPane.showInputDialog("Ingrese el serial"));
            lista1.add(EI);
            int opt = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro registro?", "Continuar",
                    JOptionPane.YES_NO_OPTION);
            continuar = (opt == JOptionPane.YES_OPTION);

        }
        return lista1;
    }

    public void MostrarRegistro1(LinkedList<EstudianteIng> lista1) {
        if (lista1.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else {
            for (EstudianteIng EI : lista1) {
                JOptionPane.showMessageDialog(null, "La cédula es: " + EI.getCedula() + "\n"
                        + "Nombre: " + EI.getNombre() + "\n"
                        + "Apellido: " + EI.getApellido() + "\n"
                        + "Teléfono: " + EI.getTelefono() + "\n"
                        + "Semestre actual: " + EI.getNumero() + "\n"
                        + "Promedio acumulado: " + EI.getPromedio_acum1() + "\n"
                        + "Serial actual: " + EI.getSerial());

            }
        }
    }

    public LinkedList<Computador> IngresarRegistro2(LinkedList<Computador> lista2) {
        boolean continuar1 = true;
        while (continuar1 == true) {
            Computador CP = new Computador();
            CP.setSerial(JOptionPane.showInputDialog("Ingrese el serial del equipo"));
            CP.setMarca(JOptionPane.showInputDialog("Ingrese la marca del equipo"));
            boolean ValTamaño = false;
            while (!ValTamaño) {
                String Val_tamaño = JOptionPane.showInputDialog(("Ingrese el tamaño (memoria)del equipo"));
                if (Val_tamaño == null || Val_tamaño.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Debe ingresar una memoria válida",
                            "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                Val_tamaño = Val_tamaño.replace(",", ".");
                try {
                    CP.setTamaño(Float.parseFloat(Val_tamaño));
                    ValTamaño = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número válido.",
                            "Error de entrada", JOptionPane.ERROR_MESSAGE);
                }
            }
            boolean ValPrecio = false;
            while (!ValPrecio) {
                String Val_Precio = JOptionPane.showInputDialog(("Ingrese el precio del equipo"));
                if (Val_Precio == null || Val_Precio.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Debe ingresar un precio válido",
                            "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                Val_Precio = Val_Precio.replace(",", ".");
                try {
                    CP.setPrecio(Float.parseFloat(Val_Precio));
                    ValPrecio = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número válido.",
                            "Error de entrada", JOptionPane.ERROR_MESSAGE);
                }
            }
            boolean Check_sistema = false;
            while (!Check_sistema) {
                String Sist_Op = JOptionPane.showInputDialog("Ingrese el sistema operativo requerido\n"
                        + "1- Windows 7 \n" + "2- Windows 10 \n" + "3- Windows 11 \n");
                if (Sist_Op == null || Sist_Op.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Debe ingresar una opción válida",
                            "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    continue;

                }

                if (Sist_Op.equals("1")) {
                    CP.setSistemaop("Windows 7");
                    JOptionPane.showMessageDialog(null, "Has agregado Windows 7 como sistema operativo");
                    Check_sistema = true;
                } else if (Sist_Op.equals("2")) {
                    CP.setSistemaop("Windows 10");
                    JOptionPane.showMessageDialog(null, "Has agregado Windows 10 como sistema operativo");
                    Check_sistema = true;
                } else if (Sist_Op.equals("3")) {
                    CP.setSistemaop("Windows 11");
                    JOptionPane.showMessageDialog(null, "Has agregado Windows 11 como sistema operativo");
                    Check_sistema = true;
                } else {
                    JOptionPane.showMessageDialog(null, "No has seleccionado una opción válida");
                }

            }
            boolean check_proc = false;
            while (!check_proc) {
                String Selec_proc = JOptionPane.showInputDialog(
                        "Ingrese el procesador del equipo\n" + "1- AMD Ryzen \n" + "2- Intel® Core™ i5. \n");
                if (Selec_proc == null || Selec_proc.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Debe ingresar una opción válida",
                            "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                if (Selec_proc.equals("1")) {
                    CP.setProcesador("AMD Ryzen");
                    JOptionPane.showMessageDialog(null, "Has agregado AMD Ryzen como procesador del equipo");
                    check_proc = true;
                } else if (Selec_proc.equals("2")) {
                    CP.setProcesador("Intel® Core™ i5");
                    JOptionPane.showMessageDialog(null, "Has agregado Intel® Core™ i5 como procesador del equipo");
                    check_proc = true;
                } else {
                    JOptionPane.showMessageDialog(null, "No has seleccionado una opción válida");
                }
            }
            // CP.setProcesador(JOptionPane.showInputDialog("Ingrese el procesador del
            // equipo"));
            lista2.add(CP);
            int opt2 = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro registro?", "Continuar",
                    JOptionPane.YES_NO_OPTION);
            continuar1 = (opt2 == JOptionPane.YES_OPTION);
        }
        return lista2;

    }

    public void MostrarRegistro2(LinkedList<Computador> lista2) {
        if (lista2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else {
            for (Computador CP : lista2) {
                JOptionPane.showMessageDialog(null, "El serial es " + CP.getSerial() + "\n"
                        + "Marca: " + CP.getMarca() + "\n"
                        + "Memoria de: " + CP.getTamaño() + "\n"
                        + "Precio: " + CP.getPrecio() + "\n"
                        + "Sistema operativo: " + CP.getSistemaop() + "\n"
                        + "Procesador del equipo: " + CP.getProcesador());
            }
        }
    }
}
