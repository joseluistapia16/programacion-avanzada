package base_de_datos;

import dominio.Docente_Auxiliar_Dominio;
import modelado.Alumno;
import modelado.Docente_Auxiliar;
import modelado.Materias;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JOSE LUIS
 */
public class Consultas {

    Conectar con = new Conectar();
    Connection conect = null;
    ResultSet rs;
    java.sql.Statement st = null;
    String query;

    public ArrayList<Docente_Auxiliar_Dominio> tablaDocenteAuxiliar(String base, String cedula) {
        String query = "select * from  docente_auxiliar"
                + " where identificacion='" + cedula + "'";
        ArrayList<Docente_Auxiliar_Dominio> lista = new ArrayList<Docente_Auxiliar_Dominio>();

        try {
            conect = con.Conexion(base);
            st = conect.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {

                Docente_Auxiliar_Dominio objeto = new Docente_Auxiliar_Dominio(
                        BigInteger.valueOf(rs.getInt("id_docente_auxiliar")),
                        rs.getString("identificacion"),
                        rs.getString("nombres"),
                        rs.getString("correo"),
                        rs.getInt("fono"),
                        rs.getString("tipo_persona"),
                        rs.getInt("num_materias"),
                        rs.getString("horario"),
                        rs.getString("cod_docente"),
                        rs.getInt("horas_trabajadas")
                );

                lista.add(objeto);
            }
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public ArrayList<Docente_Auxiliar_Dominio> listaDocenteAuxiliar(String base, String query) {
//        String query = "select * from  docente_auxiliar"
//                + " where identificacion='" + cedula + "'";
        ArrayList<Docente_Auxiliar_Dominio> lista = new ArrayList<Docente_Auxiliar_Dominio>();

        try {
            conect = con.Conexion(base);
            st = conect.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {

                Docente_Auxiliar_Dominio objeto = new Docente_Auxiliar_Dominio(
                        BigInteger.valueOf(rs.getInt("id_docente_auxiliar")),
                        rs.getString("identificacion"),
                        rs.getString("nombres"),
                        rs.getString("correo"),
                        rs.getInt("fono"),
                        rs.getString("tipo_persona"),
                        rs.getInt("num_materias"),
                        rs.getString("horario"),
                        rs.getString("cod_docente"),
                        rs.getInt("horas_trabajadas")
                );

                lista.add(objeto);
            }
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public ArrayList<Alumno> listaAlumno(String base, String query) {
        ArrayList<Alumno> lista = new ArrayList<Alumno>();

        try {
            conect = con.Conexion(base);
            st = conect.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {

                Alumno objeto = new Alumno(0,
                        rs.getString("identificacion"),
                        rs.getString("nombres"),
                        rs.getString("tipo_persona"),
                        rs.getString("correo"),
                        rs.getString("fono"),
                        rs.getInt("id_matricula"),
                        rs.getInt("num_materias")
                );

                lista.add(objeto);
            }
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public ArrayList<Materias> listaMaterias(String base, String query) {
        ArrayList<Materias> lista = new ArrayList<Materias>();

        try {
            conect = con.Conexion(base);
            st = conect.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {

                Materias objeto = new Materias(
                        rs.getInt("id_materia"),
                        rs.getInt("id_alumno"),
                        rs.getString("nombre")
                );

                lista.add(objeto);
            }
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
//
//    public ArrayList<Vehiculos> ConsultasVehiculos(String base, String query) {
//        ArrayList<Vehiculos> lista = new ArrayList<Vehiculos>();
//
//        try {
//            conect = con.Conexion(base);
//            st = conect.createStatement();
//            rs = st.executeQuery(query);
//            while (rs.next()) {
//                Vehiculos objeto = new Vehiculos(BigInteger.valueOf(rs.getInt("id")), rs.getString("Placa"), rs.getString("Marca"), rs.getString("Modelo"), rs.getString("Tipo"),
//                        rs.getString("Color"), rs.getString("Chasis"), rs.getString("Bastidor"),rs.getString("Motor"), rs.getString("Cedula_propietario"), rs.getString("link_imagen"));
//                lista.add(objeto);
//            }
//            conect.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return lista;
//    }
//    
//    public ArrayList<Personal> ConsultaPersonal(String base, String query) {
//        ArrayList<Personal> lista = new ArrayList<Personal>();
//
//        try {
//            conect = con.Conexion(base);
//            st = conect.createStatement();
//            rs = st.executeQuery(query);
//            while (rs.next()) {
//                Personal objeto = new Personal(BigInteger.valueOf(rs.getInt("id")), rs.getString("Cedula"), rs.getString("Nombres"), rs.getString("Apellidos"), rs.getString("Estado_Civil"),
//                        rs.getString("Fecha_Nacimiento"),rs.getString("Direccion"),rs.getString("Telefono"),rs.getString("Email"),
//                        rs.getString("link_Imagen"));
//                lista.add(objeto);
//            }
//            conect.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return lista;
//    }
//    
//       public ArrayList<Equipo> ConsultasEquipos(String base, String query) {
//        ArrayList<Equipo> lista = new ArrayList<Equipo>();
//
//        try {
//            conect = con.Conexion(base);
//            st = conect.createStatement();
//            rs = st.executeQuery(query);
//            while (rs.next()) {
//                Equipo objeto = new Equipo(BigInteger.valueOf(rs.getInt("id")),rs.getString("Codigo"), rs.getString("Marca"), rs.getString("Modelo"), rs.getString("Serie"),
//                        rs.getString("Color"), rs.getString("Cedula_propietario"), rs.getString("link_imagen"));
//                lista.add(objeto);
//            }
//            conect.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return lista;
//    }
//    
//       public ArrayList<Reparacion_Vehiculo> ConsultaReparacionVehiculos(String base, String query) {
//        ArrayList<Reparacion_Vehiculo> lista = new ArrayList<Reparacion_Vehiculo>();
//
//        try {
//            conect = con.Conexion(base);
//            st = conect.createStatement();
//            rs = st.executeQuery(query);
//            while (rs.next()) {
//                Reparacion_Vehiculo objeto = new Reparacion_Vehiculo(BigInteger.valueOf(rs.getInt("id")),rs.getString("Codigo"), rs.getString("Fecha"), rs.getString("Placa"),rs.getBigDecimal("Total")
//                ,rs.getString("Nota"));                    
//                lista.add(objeto);
//            }
//            conect.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return lista;
//    }
//       
//     public ArrayList<Reparacion_Equipo> ConsultaReparacionEquipos(String base, String query) {
//        ArrayList<Reparacion_Equipo> lista = new ArrayList<Reparacion_Equipo>();
//
//        try {
//            conect = con.Conexion(base);
//            st = conect.createStatement();
//            rs = st.executeQuery(query);
//            while (rs.next()) {
//                Reparacion_Equipo objeto = new Reparacion_Equipo(BigInteger.valueOf(rs.getInt("id")),rs.getString("Codigo"), rs.getString("Fecha"), rs.getString("Serie"),rs.getBigDecimal("Total"),
//                rs.getString("Nota"));                    
//                lista.add(objeto);
//            }
//            conect.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return lista;
//    }
//          
//       
//       
//       
//    public ArrayList<Detalle_Vehiculos> ConsultaDetalleVehiculos(String base, String query) {
//        ArrayList<Detalle_Vehiculos> lista = new ArrayList<Detalle_Vehiculos>();
//
//        try {
//            conect = con.Conexion(base);
//            st = conect.createStatement();
//            rs = st.executeQuery(query);
//            while (rs.next()) {
//                Detalle_Vehiculos objeto = new Detalle_Vehiculos(BigInteger.valueOf(rs.getInt("id")),rs.getString("Codigo"), rs.getString("Fecha"),BigInteger.valueOf(rs.getInt("Item")),rs.getString("Detalle"),
//                        rs.getDouble("Valor"),rs.getDouble("Subtotal"),rs.getDouble("Iva"),rs.getDouble("Total"),rs.getString("Tipo"));                    
//                lista.add(objeto);
//            }
//            conect.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return lista;
//    }   
//    public ArrayList<Detalle_Equipos> ConsultaDetalleVEquipos(String base, String query) {
//        ArrayList<Detalle_Equipos> lista = new ArrayList<Detalle_Equipos>();
//
//        try {
//            conect = con.Conexion(base);
//            st = conect.createStatement();
//            rs = st.executeQuery(query);
//            while (rs.next()) {
//                Detalle_Equipos objeto = new Detalle_Equipos(BigInteger.valueOf(rs.getInt("id")),rs.getString("Codigo"), rs.getString("Fecha"),BigInteger.valueOf(rs.getInt("Item")),rs.getString("Detalle"),
//                        rs.getDouble("Valor"),rs.getDouble("Subtotal"),rs.getDouble("Iva"),rs.getDouble("Total"),rs.getString("Tipo"));                    
//                lista.add(objeto);
//            }
//            conect.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return lista;
//    }      

    public boolean Verificar1(String Base, String tabla, String Campo, String valor) {     // Cedula

        int s = 0;
        query = "SELECT * FROM " + tabla + " WHERE " + Campo + "='" + valor + "'";

        try {
            conect = con.Conexion(Base);

            st = conect.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                if (rs.getString(1) == null) {
                    s = 0;
                } else {
                    s = 1;
                }
            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error -- " + ex);
        }
        if (s == 1) {
            return true;
        } else {
            return false;
        }

    }

    public String NR(String Tabla, String Atri) {

        int nom = 0;
        int s = 0;
        query = "SELECT * FROM " + Tabla + " WHERE " + Atri + "= (SELECT MAX(" + Atri + ") FROM " + Tabla + ")";
        // JOptionPane.showMessageDialog(null,query);
        try {
            conect = con.Conexion("Mantenimiento");
            st = conect.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                nom = rs.getInt("Id");
                System.out.println(nom);
                if (nom <= 0) {

                    s = 0;
                } else {
                    s = 1;
                }
            }
        } catch (SQLException ex) {

            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            // JOptionPane.showMessageDialog(null,"No hay -- " +ex);
        }
        if (s == 1) {
            return String.valueOf(nom);
        } else {
            s = 0;
            return String.valueOf(s);
        }

    }

}
