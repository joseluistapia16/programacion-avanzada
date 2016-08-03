/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.math.BigInteger;

/**
 *
 * @author mayra
 */
public class Docente_Auxiliar_Dominio {

    private BigInteger id_docente_auxiliar;

    private String identificacion;
    private String nombres;
    private String correo;
    private int fono;
    private String tipo_persona;
    private int num_materias;
    private String horario_tutorias;
    private String cod_docente;
    private int hora_trabajadas;
    private double sueldo;

    public Docente_Auxiliar_Dominio() {

    }

    public Docente_Auxiliar_Dominio(BigInteger id_docente_auxiliar, String identificacion, String nombres, String correo, int fono, String tipo_persona, int num_materias, String horario_tutorias, String cod_docente, int hora_trabajadas) {
        this.id_docente_auxiliar = id_docente_auxiliar;
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.correo = correo;
        this.fono = fono;
        this.tipo_persona = tipo_persona;
        this.num_materias = num_materias;
        this.horario_tutorias = horario_tutorias;
        this.cod_docente = cod_docente;
        this.hora_trabajadas = hora_trabajadas;

    }

    public BigInteger getId_docente_auxiliar() {
        return id_docente_auxiliar;
    }

    public void setId_docente_auxiliar(BigInteger id_docente_auxiliar) {
        this.id_docente_auxiliar = id_docente_auxiliar;
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

    public int getFono() {
        return fono;
    }

    public void setFono(int fono) {
        this.fono = fono;
    }

    public String getTipo_persona() {
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona) {
        this.tipo_persona = tipo_persona;
    }

    public int getNum_materias() {
        return num_materias;
    }

    public void setNum_materias(int num_materias) {
        this.num_materias = num_materias;
    }

    public String getHorario_tutorias() {
        return horario_tutorias;
    }

    public void setHorario_tutorias(String horario_tutorias) {
        this.horario_tutorias = horario_tutorias;
    }

    public String getCod_docente() {
        return cod_docente;
    }

    public void setCod_docente(String cod_docente) {
        this.cod_docente = cod_docente;
    }

    public int getHora_trabajadas() {
        return hora_trabajadas;
    }

    public void setHora_trabajadas(int hora_trabajadas) {
        this.hora_trabajadas = hora_trabajadas;
    }

    public double getSueldo() {

        return sueldo;
    }

    public void setSueldo(Double num_horas) {
        if ("DA".equals(cod_docente)) {
            sueldo = (5.50 * num_horas);
        }
        if ("DT".equals(cod_docente)) {
            sueldo = 800;
        }
        
    }

}
