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
            while (!Validacion_nombre) {
                String Validez_nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
                if (Validez_nombre == null || Validez_nombre.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se ha ingresado nombre correctamente!", "Error de entrada",
                            JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                EI.setNombre(Validez_nombre);
                Validacion_nombre = true;
            }
            boolean Validacion_apellido = false;
            while (!Validacion_apellido) {
                String Validez_apellido = JOptionPane.showInputDialog("Ingrese el apellido");
                if (Validez_apellido == null || Validez_apellido.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se ha ingresado apellido correctamente!",
                            "Error de entrada",
                            JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                EI.setApellido(Validez_apellido);
                Validacion_apellido = true;
            }
            boolean Validacion_telefono = false;
            while (!Validacion_telefono) {
                String Validez_telefono = JOptionPane.showInputDialog("Ingrese el telefóno");
                if (Validez_telefono == null || Validez_telefono.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se ha ingresado el número de teléfono correctamente!",
                            "Error de entrada",
                            JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                EI.setTelefono(Validez_telefono);
                Validacion_telefono = true;

            }
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
                        + "Telefono: " + EI.getTelefono() + "\n"
                        + "Semestre: " + EI.getNumero() + "\n"
                        + "Promedio académico: " + EI.getPromedio_acum1() + "\n" + "Serial: " + EI.getSerial());
            }
        }
    }

    public LinkedList<Computador> IngresarRegistro2(LinkedList<Computador> lista2) {
        boolean continuar1 = true;
        while (continuar1 == true) {
            Computador CP = new Computador();
            CP.setSerial(JOptionPane.showInputDialog("Ingrese el serial del equipo"));
            boolean Validacion_marca = false;
            while (!Validacion_marca) {
                String Val_marca = JOptionPane.showInputDialog("Ingrese la marca del equipo");
                if (Val_marca == null || Val_marca.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Debe ingresar la marca del equipo",
                            "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                CP.setMarca(Val_marca);
                Validacion_marca = true;
            }
            boolean ValTamaño = false;
            while (!ValTamaño) {
                String Val_tamaño = JOptionPane.showInputDialog(("Ingrese el tamaño (pantalla) del equipo"));
                if (Val_tamaño == null || Val_tamaño.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Debe ingresar una tamaño válido",
                            "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                Val_tamaño = Val_tamaño.replace(",", ".");
                float Val_tamaño1 = Float.parseFloat(Val_tamaño);
                try {
                    if (Val_tamaño1 < 10) {
                        JOptionPane.showMessageDialog(null,
                                "Entrada no válida. Debe ingresar una tamaño mayor a 10' y menor a 25' ",
                                "Error de entrada", JOptionPane.ERROR_MESSAGE);
                        continue;

                    } else if (Val_tamaño1 > 25) {
                        JOptionPane.showMessageDialog(null,
                                "Entrada no válida. Debe ingresar una tamaño mayor a 10' y menor a 25' ",
                                "Error de entrada", JOptionPane.ERROR_MESSAGE);
                        continue;
                    } else {
                        CP.setTamaño((Val_tamaño1));
                        ValTamaño = true;
                    }
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

    public LinkedList<EstudianteDis> IngresarRegistro3(LinkedList<EstudianteDis> lista3) {
        boolean continuar3 = true;
        while (continuar3 == true) {
            EstudianteDis ED = new EstudianteDis();
            boolean Validacion_cedula = false;
            while (!Validacion_cedula) {
                String ValidezCedula = JOptionPane.showInputDialog("Ingrese la cédula: ");
                if (ValidezCedula == null || ValidezCedula.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se ha ingresado una cédula válida!", "Error de entrada",
                            JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                ED.setCedula(ValidezCedula);
                Validacion_cedula = true;
            }
            boolean Validacion_nombre = false;
            while (!Validacion_nombre) {
                String Validez_nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
                if (Validez_nombre == null || Validez_nombre.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se ha ingresado nombre correctamente!", "Error de entrada",
                            JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                ED.setNombre(Validez_nombre);
                Validacion_nombre = true;
            }
            boolean Validacion_apellido = false;
            while (!Validacion_apellido) {
                String Validez_apellido = JOptionPane.showInputDialog("Ingrese el apellido");
                if (Validez_apellido == null || Validez_apellido.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se ha ingresado apellido correctamente!",
                            "Error de entrada",
                            JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                ED.setApellido(Validez_apellido);
                Validacion_apellido = true;
            }
            boolean Validacion_telefono = false;
            while (!Validacion_telefono) {
                String Validez_telefono = JOptionPane.showInputDialog("Ingrese el telefóno");
                if (Validez_telefono == null || Validez_telefono.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se ha ingresado el número de teléfono correctamente!",
                            "Error de entrada",
                            JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                ED.setTelefono(Validez_telefono);
                Validacion_telefono = true;

            }
            boolean ValidezModalidad = false;
            while (!ValidezModalidad) {
                String Validez_modalidad = JOptionPane
                        .showInputDialog("Ingrese su modalidad: \n" + "1. Virtual \n" + "2. Presencial \n");
                if (Validez_modalidad == null || Validez_modalidad.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se ha ingresado una opción válida. Intente nuevamente!",
                            "Error de entrada",
                            JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                if (Validez_modalidad.equals("1")) {
                    JOptionPane.showMessageDialog(null, "La modalidad del estudiante es virtual");
                    ED.setModalidad("Virtual");
                    ValidezModalidad = true;

                } else if (Validez_modalidad.equals("2")) {
                    JOptionPane.showMessageDialog(null, "La modalidad del estudiante es presencial");
                    ED.setModalidad("Presencial");
                    ValidezModalidad = true;

                } else {
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                }
            }
            boolean ValidezAsignaturas = false;
            while (!ValidezAsignaturas) {
                String Validacion_asignaturas = JOptionPane
                        .showInputDialog("Ingrese la cantidad de asignaturas que está cursando");
                if (Validacion_asignaturas == null || Validacion_asignaturas.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se ha ingresado una cantidad válida. Intente nuevamente!",
                            "Error de entrada",
                            JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                try {
                    int ValidezAsignaturas1 = Integer.parseInt(Validacion_asignaturas);
                    if (ValidezAsignaturas1 < 0) {
                        JOptionPane.showMessageDialog(null, "El estudiante no tiene asignaturas inscritas");
                        ED.setAsignaturas(0);
                        ValidezAsignaturas = true;
                    } else if (ValidezAsignaturas1 >= 1 && ValidezAsignaturas1 <= 15) {
                        JOptionPane.showMessageDialog(null,
                                "El estudiante tiene inscritas " + ValidezAsignaturas1 + " asignaturas");
                        ED.setAsignaturas(ValidezAsignaturas1);
                        ValidezAsignaturas = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Verificar las asignaturas declaradas.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un número válido.", "Error de entrada",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            ED.setSerial(JOptionPane.showInputDialog("Ingrese el serial"));
            lista3.add(ED);
            int opt = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro registro?", "Continuar",
                    JOptionPane.YES_NO_OPTION);
            continuar3 = (opt == JOptionPane.YES_OPTION);

        }
        return lista3;
    }
    public void MostrarRegistro3(LinkedList<EstudianteDis> lista3) {
        if (lista3.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else {
            for (EstudianteDis ED : lista3) {
                JOptionPane.showMessageDialog(null, "La cédula es: " + ED.getCedula() + "\n"
                        + "Nombre: " + ED.getNombre() + "\n"
                        + "Apellido: " + ED.getApellido() + "\n"
                        + "Telefono: " + ED.getTelefono() + "\n"
                        + "Modalidad: " + ED.getModalidad() + "\n"
                        + "Cantidad asignaturas: " + ED.getAsignaturas() + "\n" + "Serial: " + ED.getSerial());
            }
        }
    }
}
