 
package modelado;
 
public class Docente_Auxiliar extends Docente {
    
     private String horario_tutorias;

    public Docente_Auxiliar(String horario_tutorias, String cod_docente, int cod_materias, String tipo_persona, String identificacion, String nombres, String correo, String fono) {
        super(cod_docente, cod_materias, tipo_persona, identificacion, nombres, correo, fono);
        this.horario_tutorias = horario_tutorias;
    }
     
     
    

    public String getHorario_tutorias() {
        return horario_tutorias;
    }

    public void setHorario_tutorias(String horario_tutorias) {
        this.horario_tutorias = horario_tutorias;
    }

   
     
    
    
    
}
