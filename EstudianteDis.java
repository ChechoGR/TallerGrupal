public class EstudianteDis {
    String Cedula; //cadena de texto, no se permiten caracteres especiales.
    String Nombre; //cadena de texto, no se permiten números ni caracteres especiales.
    String Apellido; //cadena de texto, no se permiten números ni caracteres especiales
    String Teléfono; //cadena de texto, no se permiten caracteres especiales.
    String Modalidad; //Modalidad: a distancia o presencial
    float Asignaturas; //Numero flotante.
    String Serial;
    public String getCedula() {
        return Cedula;
    }
    public void setCedula(String cedula) {
        Cedula = cedula;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getTeléfono() {
        return Teléfono;
    }
    public void setTeléfono(String teléfono) {
        Teléfono = teléfono;
    }
    public String getModalidad() {
        return Modalidad;
    }
    public void setModalidad(String modalidad) {
        Modalidad = modalidad;
    }
    public float getAsignaturas() {
        return Asignaturas;
    }
    public void setAsignaturas(float asignaturas) {
        Asignaturas = asignaturas;
    }
    public String getSerial() {
        return Serial;
    }
    public void setSerial(String serial) {
        Serial = serial;
    }
    
    
}
