
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Importar1 {
    public LinkedList<EstudianteIng> ImportarA1() {
        String Ruta1 = "EstudiantesING.txt";
        LinkedList<EstudianteIng> lista1 = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Ruta1))) {
            String linea;
            EstudianteIng EI = null;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("La cédula es: ")) {
                    if (EI != null) {
                        lista1.add(EI);
                    }
                    EI = new EstudianteIng();
                    EI.setCedula((linea.substring(14)));
                } else if (linea.startsWith("Nombre:")) {
                    if (EI != null) {
                        EI.setNombre(linea.substring(8));
                    }

                } else if (linea.startsWith("Apellido:")) {
                    if (EI != null) {
                        EI.setApellido(linea.substring(10));
                    }

                } else if (linea.startsWith("Telefono: ")) {
                    if (EI != null) {
                        EI.setTelefono(linea.substring(10));

                    }
                } else if (linea.startsWith("Semestre: ")) {
                    if (EI != null) {
                        EI.setNumero(Integer.parseInt(linea.substring(10)));
                    }
                } else if (linea.startsWith("Promedio académico: ")) {
                    if (EI != null) {
                        EI.setPromedio_acum1(Float.parseFloat(linea.substring(20)));
                    }
                } else if (linea.startsWith(("Serial: "))) {
                    if (EI != null) {
                        EI.setSerial("NO PRESTADO");
                        lista1.add(EI);
                    }
                }
            }
            if (EI != null) {
                lista1.add(EI); // Esto asegura que el último estudiante se añada a la lista.
            }
            JOptionPane.showMessageDialog(null, "Archivo importado correctamente!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al importar archivo");
            return lista1;
        }
        return lista1;
    }

    public LinkedList<Computador> ImportarA3() {
        String Ruta3 = "ComputadorIMP.txt";
        LinkedList<Computador> lista2 = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Ruta3))) {
            String linea;
            Computador CP = null;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("El serial es ")) {
                    if (CP != null) {
                        lista2.add(CP);
                    }
                    CP = new Computador();
                    CP.setSerial(linea.substring(13));

                } else if (linea.startsWith("Marca: ")) {
                    if (CP != null) {
                        CP.setMarca(linea.substring(7));
                    }
                } else if (linea.startsWith("Memoria de: ")) {
                    if (CP != null) {
                        CP.setTamaño(Float.parseFloat(linea.substring(12)));
                    }
                } else if (linea.startsWith("Precio: ")) {
                    if (CP != null) {
                        CP.setPrecio(Float.parseFloat(linea.substring(8)));
                    }
                } else if (linea.startsWith("Sistema operativo: ")) {
                    if (CP != null) {
                        CP.setSistemaop(linea.substring(19));
                    }
                } else if (linea.startsWith("Procesador del equipo: ")) {
                    if (CP != null) {
                        CP.setProcesador(linea.substring(23));
                    }
                } else if (linea.startsWith("¿Equipo prestado? ")) {
                    if (CP != null) {
                        CP.setPrestamo(false);
                        lista2.add(CP);
                    }
                }
            }

            if (CP != null) {
                lista2.add(CP);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al importar archivo");
            return lista2;
        }
        return lista2;
    }
}