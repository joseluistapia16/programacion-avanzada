/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelado;

import java.math.BigInteger;
import java.sql.Date;

/**
 *
 * @author mayra
 */
public class RegistroAcademico {
    private BigInteger id_registro;
    private Date fecha_registro;
    private String periodo_academico;
    private String status;

    public RegistroAcademico(BigInteger id_registro, Date fecha_registro, String periodo_academico, String status) {
        this.id_registro = id_registro;
        this.fecha_registro = fecha_registro;
        this.periodo_academico = periodo_academico;
        this.status = status;
    }

    public BigInteger getId_registro() {
        return id_registro;
    }

    public void setId_registro(BigInteger id_registro) {
        this.id_registro = id_registro;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getPeriodo_academico() {
        return periodo_academico;
    }

    public void setPeriodo_academico(String periodo_academico) {
        this.periodo_academico = periodo_academico;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
