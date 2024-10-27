import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    public LinkedList<EstudianteIng> IngresarRegistro(LinkedList<EstudianteIng> lista1) {
        boolean continuar = true;
        while (continuar == true){
            EstudianteIng EI = new EstudianteIng();
            EI.setCedula (JOptionPane.showInputDialog("Ingrese la cédula"));
            EI.setNombre(JOptionPane.showInputDialog("Ingrese el nombre"));
            EI.setApellido(JOptionPane.showInputDialog("Ingrese el apellido"));
            EI.setTelefono(JOptionPane.showInputDialog("Ingrese el telefono"));
            EI.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el semestre actual")));
            EI.setPromedio_acum1(Float.parseFloat(JOptionPane.showInputDialog("Ingrese su promedio")));
            EI.setSerial(JOptionPane.showInputDialog("Ingrese el serial"));
            lista1.add(EI);
            int opt = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro registro?", "Continuar", JOptionPane.YES_NO_OPTION);
            continuar = (opt == JOptionPane.YES_OPTION);
            
            }
            return lista1;
        }
         

    }
    

