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
public class Persona {

    private String identificacion;
    private String nombres;
    private String tipo_persona;
    private String correo;
    private String fono;

    public Persona() {

    }

    public Persona(String identificacion, String nombres, String tipo_persona, String correo, String fono) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.tipo_persona = tipo_persona;
        this.correo = correo;
        this.fono = fono;
    }
    
    

    public String getTipo_persona() {
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona) {
        this.tipo_persona = tipo_persona;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public void ingresar_persona() {

    }

    public void obtener_Personas() {

    }

    public void eliminar_registro_persona(String identificacion) {

    }
}
