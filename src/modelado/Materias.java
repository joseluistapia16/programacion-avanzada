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
public class Materias {

    private Integer id_materia;
    private Integer id_alumno;
    private String nombre;

    public Materias(Integer id_materia, Integer id_alumno, String nombre) {
        this.id_materia = id_materia;
        this.id_alumno = id_alumno;
        this.nombre = nombre;
    }

    public Integer getId_materia() {
        return id_materia;
    }

    public void setId_materia(Integer id_materia) {
        this.id_materia = id_materia;
    }

    public Integer getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(Integer id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
