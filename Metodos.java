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
            EI.setSerial("NO PRESTADO");
            JOptionPane.showMessageDialog(null, "No se tiene equipo en préstamo");
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
            CP.setPrestamo(false);
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
                        + "Procesador del equipo: " + CP.getProcesador() + "\n" + "¿Equipo prestado? "
                        + CP.isPrestamo());
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
            ED.setSerial("No cuenta aún con préstamo");
            JOptionPane.showMessageDialog(null, "No se tiene equipo en préstamo");
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

    public LinkedList<Tableta> IngresarRegistro4(LinkedList<Tableta> lista4) {
        boolean continuar1 = true;
        while (continuar1 == true) {
            Tableta TB = new Tableta();
            TB.setSerial(JOptionPane.showInputDialog("Ingrese el serial del equipo"));
            boolean Validacion_marca = false;
            while (!Validacion_marca) {
                String Val_marca = JOptionPane.showInputDialog("Ingrese la marca de la tableta");
                if (Val_marca == null || Val_marca.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Debe ingresar la marca de la tableta",
                            "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                TB.setMarca(Val_marca);
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
                    if (Val_tamaño1 < 8) {
                        JOptionPane.showMessageDialog(null,
                                "Entrada no válida. Debe ingresar una tamaño mayor a 8' y menor a 15' ",
                                "Error de entrada", JOptionPane.ERROR_MESSAGE);
                        continue;

                    } else if (Val_tamaño1 > 15) {
                        JOptionPane.showMessageDialog(null,
                                "Entrada no válida. Debe ingresar una tamaño mayor a 10' y menor a 15' ",
                                "Error de entrada", JOptionPane.ERROR_MESSAGE);
                        continue;
                    } else {
                        TB.setTamaño((Val_tamaño1));
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
                    TB.setPrecio(Float.parseFloat(Val_Precio));
                    ValPrecio = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número válido.",
                            "Error de entrada", JOptionPane.ERROR_MESSAGE);
                }
            }
            boolean Check_almacenamiento = false;
            while (!Check_almacenamiento) {
                String Check_almc = JOptionPane.showInputDialog("Ingrese el almacenamiento requerido\n"
                        + "1- 256 GB \n" + "2- 512 GB \n" + "3- 1 TB \n");
                if (Check_almc == null || Check_almc.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Debe ingresar una opción válida",
                            "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    continue;

                }

                if (Check_almc.equals("1")) {
                    TB.setAlmacenamiento("256 GB");
                    JOptionPane.showMessageDialog(null, "El equipo cuenta con 256 GB de memoria");
                    Check_almacenamiento = true;
                } else if (Check_almc.equals("2")) {
                    TB.setAlmacenamiento("512 GB");
                    JOptionPane.showMessageDialog(null, "El equipo cuenta con 512 GB de memoria");
                    Check_almacenamiento = true;
                } else if (Check_almc.equals("3")) {
                    TB.setAlmacenamiento("1 TB");
                    JOptionPane.showMessageDialog(null, "El equipo cuenta con 1 TB de memoria");
                    Check_almacenamiento = true;
                } else {
                    JOptionPane.showMessageDialog(null, "No has seleccionado una opción válida");
                }

            }
            boolean Verif_Peso = false;
            while (!Verif_Peso) {
                String VerificacionPeso = JOptionPane.showInputDialog("Ingrese el peso del equipo en kg");
                if (VerificacionPeso == null || VerificacionPeso.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Debe ingresar un peso válido",
                            "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                try {
                    float VerificacionPeso1 = Float.parseFloat(VerificacionPeso);
                    if (VerificacionPeso1 <= 0) {
                        JOptionPane.showMessageDialog(null, "Se ha ingresado un peso no válido, verifique nuevamente");
                    } else if (VerificacionPeso1 <= 3) {
                        TB.setPeso(VerificacionPeso1);
                        JOptionPane.showMessageDialog(null, "El peso del equipo es " + VerificacionPeso1 + "kg");
                        Verif_Peso = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "El peso ingresado es muy alto. Verificar nuevamente");
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un número válido.", "Error de entrada",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
            TB.setPrestamo(false);
            lista4.add(TB);
            int opt2 = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro registro?", "Continuar",
                    JOptionPane.YES_NO_OPTION);
            continuar1 = (opt2 == JOptionPane.YES_OPTION);
        }
        return lista4;

    }

    public void MostrarRegistro4(LinkedList<Tableta> lista4) {
        if (lista4.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        } else {
            for (Tableta TB : lista4) {
                JOptionPane.showMessageDialog(null, "El serial es " + TB.getSerial() + "\n"
                        + "Marca: " + TB.getMarca() + "\n"
                        + "Tamaño pantalla: " + TB.getTamaño() + "\n"
                        + "Precio: " + TB.getPrecio() + "\n"
                        + "Almacenamiento: " + TB.getAlmacenamiento() + "\n"
                        + "Peso: " + TB.getPeso() + "\n" + "¿Equipo prestado? " + TB.isPrestamo());
            }
        }
    }

    public LinkedList<EstudianteIng> ModificarRegistro1(LinkedList<EstudianteIng> lista1) {
        String cedula1 = JOptionPane.showInputDialog("Ingrese la cédula a la cual se le modificará el nombre");
        JOptionPane.showMessageDialog(null, "Buscando al usuario " + cedula1 + " para modificar su nombre");
        boolean cedulaEncontrada = false;
        for (EstudianteIng EI : lista1) {
            if (EI.getCedula().equals(cedula1)) {
                cedulaEncontrada = true;
                String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nombre a cambiar");
                EI.setNombre(nuevoNombre);
                JOptionPane.showMessageDialog(null, "Nombre modificado exitosamente a: " + nuevoNombre);
                break; // Termina el bucle al encontrar y modificar la cédula
            }
        }

        if (!cedulaEncontrada) {
            JOptionPane.showMessageDialog(null, "No se encontró un estudiante con la cédula ingresada.");
        }

        return lista1;
    }

    public LinkedList<EstudianteDis> ModificarRegistro2(LinkedList<EstudianteDis> lista3) {
        String cedula2 = JOptionPane.showInputDialog("Ingrese la cédula a la cual se le modificará el nombre");
        JOptionPane.showMessageDialog(null, "Buscando al usuario " + cedula2 + " para modificar su nombre");
        boolean cedulaEncontrada = false;
        for (EstudianteDis ED : lista3) {
            if (ED.getCedula().equals(cedula2)) {
                cedulaEncontrada = true;
                String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nombre a cambiar");
                ED.setNombre(nuevoNombre);
                JOptionPane.showMessageDialog(null, "Nombre modificado exitosamente a: " + nuevoNombre);
                break; // Termina el bucle al encontrar y modificar la cédula
            }
        }
        if (!cedulaEncontrada) {
            JOptionPane.showMessageDialog(null, "No se encontró un estudiante con la cédula ingresada.");
        }
        return lista3;
    }

    public LinkedList<Computador> ModificarRegistro3(LinkedList<Computador> lista2) {
        String serial1 = JOptionPane.showInputDialog("Ingrese el serial al cual se le modificará la marca");
        JOptionPane.showMessageDialog(null, "Buscando el equpo " + serial1 + " para modificar su marca");
        boolean MarcaEncontrada = false;
        for (Computador CP : lista2) {
            if (CP.getSerial().equals(serial1)) {
                MarcaEncontrada = true;
                String nuevaMarca = JOptionPane.showInputDialog("Ingrese la marca a cambiar");
                CP.setMarca(nuevaMarca);
                JOptionPane.showMessageDialog(null, "Marca modificada exitosamente a: " + nuevaMarca);
                break;
            }
            if (!MarcaEncontrada) {
                JOptionPane.showMessageDialog(null, "No se encontró un equipo con la marca ingresada.");
            }
        }
        return lista2;
    }

    public LinkedList<Tableta> ModificarRegistro4(LinkedList<Tableta> lista4) {
        String serial2 = JOptionPane.showInputDialog("Ingrese el serial al cual se le modificará la marca");
        JOptionPane.showMessageDialog(null, "Buscando el equpo " + serial2 + " para modificar su marca");
        boolean MarcaEncontrada = false;
        for (Tableta TB : lista4) {
            if (TB.getSerial().equals(serial2)) {
                MarcaEncontrada = true;
                String nuevaMarca = JOptionPane.showInputDialog("Ingrese la marca a cambiar");
                TB.setMarca(nuevaMarca);
                JOptionPane.showMessageDialog(null, "Marca modificada exitosamente a: " + nuevaMarca);
                break;
            }
            if (!MarcaEncontrada) {
                JOptionPane.showMessageDialog(null, "No se encontró un equipo con la marca ingresada.");
            }
        }
        return lista4;
    }

    public LinkedList<Prestamo1> RegistrarPrestamo1(LinkedList<EstudianteIng> lista1, LinkedList<Computador> lista2,
            LinkedList<Prestamo1> listap) {
        boolean continuar5 = true;
        while (continuar5 == true) {
            Prestamo1 PS1 = new Prestamo1();
            String cedula_buscar = JOptionPane
                    .showInputDialog("Ingrese la cédula del estudiante que solicita el préstamo: \n"
                            + "Para volver al menú principal, ingrese 0 \n");
            if (cedula_buscar.equals("0")) {
                continuar5 = false;
                break;
            }
            if (cedula_buscar == null || cedula_buscar.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Cédula no ingresada. Intente de nuevo.");
                continue; // vuelve al inicio del bucle
            }
            EstudianteIng Estudiantico = null;
            for (EstudianteIng EI : lista1) {
                if (EI.getCedula().equals(cedula_buscar)) {
                    Estudiantico = EI;
                    break;
                }
            }
            if (Estudiantico == null) {
                JOptionPane.showMessageDialog(null, "Estudiante no encontrado!");
                continue;
            }
            String serial_computador = JOptionPane
                    .showInputDialog("Ingrese el serial del computador para el préstamo: ");
            if (serial_computador.equals("0")) {
                continuar5 = false;
                break;
            }
            if (serial_computador == null || serial_computador.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Serial del computador no ingresado. Intente de nuevo.");
                continue; // vuelve al inicio del bucle
            }
            Computador computadorSeleccionado = null;
            for (Computador CP : lista2) {
                if (CP.getSerial().equals(serial_computador) && !CP.isPrestamo()) {
                    computadorSeleccionado = CP;
                    break;
                }
            }
            if (computadorSeleccionado == null) {
                JOptionPane.showMessageDialog(null, "Computador no encontrado o en préstamo");
                continue;
            }
            PS1.setEstudianteIng(Estudiantico);
            PS1.setComputador(computadorSeleccionado);
            Estudiantico.setSerial(computadorSeleccionado.getSerial());
            computadorSeleccionado.setPrestamo(true);
            listap.add(PS1);
            JOptionPane.showMessageDialog(null, "Préstamo registrado con éxito!");

            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea registrar otro préstamo?", "Continuar",
                    JOptionPane.YES_NO_OPTION);
            continuar5 = (opcion == JOptionPane.YES_OPTION);
        }
        return listap;
    }

    public void MostrarRegistro5(LinkedList<Prestamo1> listap) {
        if (listap.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay préstamos en el momento en la facultad de ingeniería");
        } else {
            for (Prestamo1 PS1 : listap) {
                JOptionPane.showMessageDialog(null, "Prestamos: \n" + "Nombre estudiante: \n" + PS1.getEstudianteIng().getNombre() + "Serial del PC prestado: \n" + PS1.getComputador().getSerial() );
            }
        }
    }
    public LinkedList<Prestamo2> RegistrarPrestamo2 (LinkedList<EstudianteDis> lista3, LinkedList<Tableta> lista4, LinkedList<Prestamo2> listad){
        boolean continuar6 = true;
        while(continuar6 == true){
            Prestamo2 PS2 = new Prestamo2();
            String cedula_buscar = JOptionPane
                    .showInputDialog("Ingrese la cédula del estudiante que solicita el préstamo: \n"
                            + "Para volver al menú principal, ingrese 0 \n");
            if (cedula_buscar.equals("0")) {
                continuar6 = false;
                break;
            }
            if (cedula_buscar == null || cedula_buscar.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Cédula no ingresada. Intente de nuevo.");
                continue; // vuelve al inicio del bucle
            }
            EstudianteDis diseñito = null;
            for (EstudianteDis ED : lista3) {
                if (ED.getCedula().equals(cedula_buscar)) {
                    diseñito = ED;
                    break;
                }
            }
            if (diseñito == null) {
                JOptionPane.showMessageDialog(null, "Estudiante no encontrado!");
                continue;
            }
            String serial_tableta = JOptionPane
                    .showInputDialog("Ingrese el serial de la tableta para el préstamo: ");
            if (serial_tableta.equals("0")) {
                continuar6 = false;
                break;
             }
             if (serial_tableta == null || serial_tableta.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Serial de la tableta no ingresado. Intente de nuevo.");
                continue; // vuelve al inicio del bucle
            }
            Tableta tabletica = null;
            for(Tableta TB : lista4){
                if (TB.getSerial().equals(serial_tableta) && !TB.isPrestamo()) {
                    tabletica = TB;
                    break;
                }

            }
            if (tabletica == null) {
                JOptionPane.showMessageDialog(null, "Computador no encontrado o en préstamo");
                continue;
            }
            PS2.setEstudianteDis(diseñito);
            PS2.setTableta(tabletica);
            diseñito.setSerial(tabletica.getSerial());
            tabletica.setPrestamo(true);
            listad.add(PS2);
            JOptionPane.showMessageDialog(null, "Préstamo registrado con éxito!");

            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea registrar otro préstamo?", "Continuar",
                    JOptionPane.YES_NO_OPTION);
            continuar6 = (opcion == JOptionPane.YES_OPTION);
         }
        return listad;
    }
}
