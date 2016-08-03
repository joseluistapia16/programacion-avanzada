/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelado;

/**
 *
 * @author mayra
 */
public class Docente_Titular extends Docente {
    
    private String horario_clases;

    public Docente_Titular(String cod_docente, int cod_materias, String tipo_persona, String identificacion, String nombres, String correo, String fono) {
        super(cod_docente, cod_materias, tipo_persona, identificacion, nombres, correo, fono);
    }

    public String getHorario_clases() {
        return horario_clases;
    }

    public void setHorario_clases(String horario_clases) {
        this.horario_clases = horario_clases;
    }
    
    public double Sueldo(){
        return 0;
        
    }
    
}
