package modelado;
public class Alumno extends Persona {

    private int id_alumno;
    private int id_matricula;
    private int num_materias;
    private String materias[];

    public Alumno() {

    }

    public Alumno(int id_alumno, String identificacion, String nombres, String tipo_persona, String correo, String fono, int id_matricula, int num_materias) {
        super(identificacion, nombres, tipo_persona, correo, fono);
        this.id_alumno = id_alumno;
        this.id_matricula = id_matricula;
        this.num_materias = num_materias;

    }

    public Alumno(String identificacion, String nombres, String tipo_persona, String correo, String fono, int id_matricula, int num_materias, String[] materias) {
        super(identificacion, nombres, tipo_persona, correo, fono);
        this.id_matricula = id_matricula;
        this.num_materias = num_materias;
        this.materias = materias;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public int getId_matricula() {
        return id_matricula;
    }

    public void setId_matricula(int id_matricula) {
        this.id_matricula = id_matricula;
    }

    public int getNum_materias() {
        return num_materias;
    }

    public void setNum_materias(int num_materias) {
        this.num_materias = num_materias;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public String getInfoAlumno() {
        String informacion = "";
        informacion  = informacion  + "Identificación "+getIdentificacion() + "\n";
        informacion  = informacion  + "Nombre "+getNombres() + "\n";
        informacion = informacion + "E-mail "+getCorreo()+ "\n";
        informacion  = informacion  + "Teléfono  "+getFono() + "\n";
        informacion  = informacion  + "Tipo de Persona "+getTipo_persona() + "\n";
        informacion  = informacion  +"Número de Materias "+ getNum_materias() + "\n";       
        return informacion ;

    }

}
