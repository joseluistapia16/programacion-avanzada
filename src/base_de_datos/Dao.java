package base_de_datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dao {

    public void Editar(String Base, String cadena, String cadena1, String tabla, String clav, String clave) {
        ArrayList<String> lista = new ArrayList<String>();
        ArrayList<String> lista1 = new ArrayList<String>();
        String consu = "", consu1 = "";
        lista = Acumula(cadena);      
        lista1 = null;
        lista1 = Acumula(cadena1);   
        if (lista.size() > 1) {
            consu = "UPDATE " + tabla + " set " + lista.get(0) + "='" + lista1.get(0);
            consu1 = consu + "'";
            for (int i = 1; i < lista.size(); i++) {
                consu1 = consu1 + "," + lista.get(i) + "='" + lista1.get(i) + "'";
            }
            consu = consu1 + " where " + clav + "='" + clave + "';";
        } else {
            consu = "UPDATE " + tabla + " set " + lista.get(0) + "='" + lista1.get(0);
            consu = consu1 + " where " + clav + "='" + clave + "';";
        }
        lista.clear();
        lista1.clear();   
        Conectar con = new Conectar();
        Connection conect = null;
        ResultSet rs = null;
        try {
            String query = consu;
            conect = con.Conexion(Base);
            java.sql.Statement st = conect.createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            
        }

    }

    public static ArrayList<String> Acumula(String cadena) {          //METODO QUE DESCOMPONE Y SELECCIONA LAS CADENAS VALIDAS
        int i = 0;
        String h;
        ArrayList<String> lista1 = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(cadena, ",'", true);
        while (st.hasMoreTokens()) {
            h = st.nextToken();
            if (!",".equals(h) && !"'".equals(h)) {
                {
                    lista1.add(h);

                }
            }
        }
        return lista1;
    }

//**************************************************************************************************************************** 
    public ArrayList<String> Traer(String base, String tabla, String campos, String clave, String vclave) throws SQLException {
        ArrayList<String> lista = new ArrayList<String>();
        ArrayList<String> lista1 = new ArrayList<String>();
        lista = Acumula(campos);
        String B, A = "SELECT " + campos + " from " + tabla + " where " + clave + "='" + vclave + "';";
        System.out.println(A);
        int i = 0;
        String sq = A;
        Conectar cone = new Conectar();
        Connection cn = cone.Conexion(base);
        java.sql.Statement sti = cn.createStatement();

        for (i = 0; i < lista.size(); i++) {
            ResultSet ru = sti.executeQuery(sq);
            while (ru.next()) {
                lista1.add(i, ru.getString(lista.get(i)));
            }
        }
        lista.clear();
        return lista1;

    }

    public void borrarElemento(String base, String tabla, String columna, String atri) {
        try {
            Conectar coni = new Conectar();
            Connection conecta = null;
            ResultSet rs;
            java.sql.Statement sti = null;
            String nom = null;
            int s = 0;
            String query = "delete from " + tabla + " where " + columna + "='" + atri + "'";
            conecta = coni.Conexion(base);
            sti = conecta.createStatement();
            int retorn = sti.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Guardar(String base, String Tabla, String Campos, String val) throws Exception {
        Conectar con = new Conectar();
        Connection conect = null;
        try {
            String query = "insert into " + Tabla + "(" + Campos + ")values (" + val + ")";
            conect = con.Conexion(base);
            java.sql.Statement st = conect.createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
 
}
