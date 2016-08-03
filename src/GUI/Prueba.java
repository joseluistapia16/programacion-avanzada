/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import base_de_datos.Conectar;
import java.math.BigInteger;
import java.sql.Connection;

/**
 *
 * @author mayra
 */
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Prueba {

    public static void main(String jk[]) {
//        try {
//            Consulta();
//        } catch (SQLException ex) {
//            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
//        }

        //    actualizarUsuarios("lan_airlines","0915101620");
        listarUsuarios("lan_airlines");
    }

    public static void Consulta() throws SQLException {
        Connection connMY = null;
        Conectar con = new Conectar();
        try {
            connMY = con.Conexion("cursos");
            connMY.setAutoCommit(false);

            PreparedStatement funcion = connMY.prepareCall("{ select Saludo(?,?) }");
            ResultSet resultado = funcion.executeQuery();
            resultado.next();
            String resu = resultado.getString(1);

            System.out.println(resu);
//            prcProcedimientoAlmacenado.setString(1, h);
//            prcProcedimientoAlmacenado.setString(2, nm);
//            prcProcedimientoAlmacenado.execute();
            connMY.commit();
        } catch (Exception e) {
            connMY.rollback();
            e.printStackTrace();
        } finally {
            connMY.close();
        }
    }

    public static void actualizarUsuarios(String base, String clave) {
        Connection connMY = null;
        Conectar con = new Conectar();
        try {
            connMY = con.Conexion(base);
            connMY.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = connMY.prepareCall(
                    "{ call ActualizarUsuario(?,?,?,?,?,?,?) }");
            prcProcedimientoAlmacenado.setString(1, "GIL");
            prcProcedimientoAlmacenado.setString(2, "PEPE");
            prcProcedimientoAlmacenado.setString(3, "CRUZ");
            prcProcedimientoAlmacenado.setString(4, "1234567");
            prcProcedimientoAlmacenado.setString(5, "CUENCA");
            prcProcedimientoAlmacenado.setString(6, "PEPE@GG.COM");
            prcProcedimientoAlmacenado.setString(7, clave);
            prcProcedimientoAlmacenado.executeUpdate();
            connMY.commit();
        } catch (Exception e) {
            try {
                connMY.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                connMY.close();
            } catch (SQLException ex) {
                Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void Insertar() throws SQLException {
        Connection connMY = null;
        Conectar con = new Conectar();
        try {
            // creamos la conexion
            connMY = con.Conexion("cursos");
            //  ConexionMySQL.conectar("192.168.1.100", "sa", "*******", "devtroce");
            // establecemos que no sea autocommit,
            // asi controlamos la transaccion de manera manual
            connMY.setAutoCommit(false);
            /* instanciamos el objeto callable statement
             * que usaremos para invocar el SP
             * La cantidad de "?" determina la cantidad
             * parametros que recibe el procedimiento
             */
            String h = "Bobo", nm = "22/Junio/2016";
            CallableStatement prcProcedimientoAlmacenado = connMY.prepareCall("{ call Insertar(?,?) }");
            // cargar parametros al SP
            prcProcedimientoAlmacenado.setString(1, h);
            prcProcedimientoAlmacenado.setString(2, nm);

            // ejecutar el SP
            prcProcedimientoAlmacenado.execute();
            // confirmar si se ejecuto sin errores
            connMY.commit();
        } catch (Exception e) {
            //System.out.println(e);
            // deshacer la ejecucion en caso de error
            connMY.rollback();
//            // informar por consola
            e.printStackTrace();
        } finally {
            // cerrar la conexion
            connMY.close();
        }
    }

    public static void listarUsuarios(String base) {
        Connection connMY = null;
        Conectar con = new Conectar();
        ResultSet resul = null;
        try {
            connMY = con.Conexion(base);
            connMY.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = connMY.prepareCall(
                    "{ call listarUsuarios() }");
            prcProcedimientoAlmacenado.execute();
            resul = prcProcedimientoAlmacenado.getResultSet();
            while (resul.next()) {

                System.out.println("" + BigInteger.valueOf(resul.getInt("id_usuario"))
                        + " " + resul.getString("cedula"));

            }
            connMY.commit();
        } catch (Exception e) {
            try {
                connMY.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                connMY.close();
            } catch (SQLException ex) {
                Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void filtarUsuarios(String base, String usuario, String clave) {
        Connection connMY = null;
        Conectar con = new Conectar();
        ResultSet resul = null;
        try {
            connMY = con.Conexion(base);
            connMY.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = connMY.prepareCall(
                    "{ call listarUsuarios() }");
            prcProcedimientoAlmacenado.setString(1, usuario);
            prcProcedimientoAlmacenado.setString(2, clave);
            prcProcedimientoAlmacenado.execute();
            resul = prcProcedimientoAlmacenado.getResultSet();
            while (resul.next()) {

                System.out.println("" + BigInteger.valueOf(resul.getInt("id_usuario"))
                        + " " + resul.getString("cedula"));

            }
            connMY.commit();
        } catch (Exception e) {
            try {
                connMY.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                connMY.close();
            } catch (SQLException ex) {
                Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
