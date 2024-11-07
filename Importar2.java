import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Importar2 {
     public  LinkedList<EstudianteDis> ImportarA2(){
        String Ruta2 = "EstudiantesDIS.txt";
        LinkedList<EstudianteDis> lista3 =  new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Ruta2))){
            String linea;
            EstudianteDis ED = null;
            while((linea = br.readLine()) != null){
                if(linea.startsWith("La cédula es: ")){
                    if (ED != null){
                        lista3.add(ED);
                    }
                    ED = new EstudianteDis();
                    ED.setCedula((linea.substring(14)));
                } else if (linea.startsWith("Nombre:")){
                    if (ED !=null){
                        ED.setNombre(linea.substring(8));
                    }
                    
                } else if (linea.startsWith("Apellido:")){
                    if (ED !=null){
                        ED.setApellido(linea.substring(10));
                    }
                    
                } else if (linea.startsWith("Telefono: ")){
                    if (ED != null){
                        ED.setTelefono(linea.substring(10));

                    }
                } else if (linea.startsWith("Modalidad: ")) {
                    if (ED !=null){
                        ED.setModalidad(linea.substring(11));
                    }
                } else if (linea.startsWith("Cantidad asignaturas: ")){
                    if (ED !=null){
                        ED.setAsignaturas(Integer.parseInt(linea.substring(22)));
                    }
                } else if (linea.startsWith(("Serial: "))){
                    if (ED !=null){
                        ED.setSerial("NO PRESTADO");
                        lista3.add(ED);
                    }
                }
            }
            if (ED != null) {
                lista3.add(ED);  // Esto asegura que el último estudiante se añada a la lista.
            }
            JOptionPane.showMessageDialog(null, "Archivo importado correctamente!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al importar archivo");
            return lista3;
        }
    return lista3;
    }
}
