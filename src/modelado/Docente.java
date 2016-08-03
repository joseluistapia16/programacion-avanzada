
package modelado;
 
public class Docente extends Persona {

    private String cod_docente;
    private int cod_materias;

    public Docente(String cod_docente, int cod_materias, String tipo_persona, String identificacion, String nombres, String correo, String fono) {
        super(tipo_persona, identificacion, nombres, correo, fono);
        this.cod_docente = cod_docente;
        this.cod_materias = cod_materias;
    }

    public String getCod_docente() {
        return cod_docente;
    }

    public void setCod_docente(String cod_docente) {
        this.cod_docente = cod_docente;
    }

    public int getCod_materias() {
        return cod_materias;
    }

    public void setCod_materias(int cod_materias) {
        this.cod_materias = cod_materias;
    }

    public String getInfoDocente() {
        String informacion = "";
        informacion  = informacion  + "Identificación "+getIdentificacion() + "\n";
        informacion  = informacion  + "Nombre "+getNombres() + "\n";
        informacion = informacion + "E-mail "+getCorreo()+ "\n";
        informacion  = informacion  + "Teléfono  "+getFono() + "\n";
        informacion  = informacion  + "Tipo de Persona "+getTipo_persona() + "\n";    
        return informacion ;
    }

}
