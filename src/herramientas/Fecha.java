package herramientas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JOSE LUIS
 */
public class Fecha {

    public static String Fecha() {
        String gui, me;
        Calendar c1 = Calendar.getInstance();
        String dia = Integer.toString(c1.get(Calendar.DATE));
        String mes = Integer.toString(c1.get(Calendar.MONTH) + 1);
        String ano = Integer.toString(c1.get(Calendar.YEAR));
        if (c1.get(Calendar.MONTH) + 1 == 1) {
            mes = "Enero";
        }
        if (c1.get(Calendar.MONTH) + 1 == 2) {
            mes = "Febrero";
        }
        if (c1.get(Calendar.MONTH) + 1 == 3) {
            mes = "Marzo";
        }
        if (c1.get(Calendar.MONTH) + 1 == 4) {
            mes = "Abril";
        }
        if (c1.get(Calendar.MONTH) + 1 == 5) {
            mes = "Mayo";
        }
        if (c1.get(Calendar.MONTH) + 1 == 6) {
            mes = "Junio";
        }
        if (c1.get(Calendar.MONTH) + 1 == 7) {
            mes = "Julio";
        }
        if (c1.get(Calendar.MONTH) + 1 == 8) {
            mes = "Agosto";
        }
        if (c1.get(Calendar.MONTH) + 1 == 9) {
            mes = "Septiembre";
        }
        if (c1.get(Calendar.MONTH) + 1 == 10) {
            mes = "Octubre";
        }
        if (c1.get(Calendar.MONTH) + 1 == 11) {
            mes = "Noviembre";
        }
        if (c1.get(Calendar.MONTH) + 1 == 12) {
            mes = "Diciembre";
        }

        gui = (dia + "/" + mes + "/" + ano);
        return gui;
    }

    public int Anio() {
        Calendar c1 = Calendar.getInstance();
        return c1.get(Calendar.YEAR);
    }

    public int Mes() {
        Calendar c1 = Calendar.getInstance();
        return c1.get(Calendar.MONTH) + 1;
    }

    public int Dia() {
        Calendar c1 = Calendar.getInstance();
        return c1.get(Calendar.DATE);
    }

    public static String getHoraActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("hh:mm:ss");
        return formateador.format(ahora);
    }

    public static Integer Mes(String mes) {
        Integer gui = null;

        if ("ene".equals(mes) || "Ene".equals(mes) || "Enero".equals(mes)) {
            gui = 1;
        }

        if ("feb".equals(mes) || "Feb".equals(mes) || "Febrero".equals(mes)) {
            gui = 2;
        }

        if ("mar".equals(mes) || "Mar".equals(mes) || "Marzo".equals(mes)) {
            gui = 3;
        }

        if ("abr".equals(mes) || "Abr".equals(mes) || "Abril".equals(mes)) {
            gui = 4;
        }

        if ("may".equals(mes) || "May".equals(mes) || "Mayo".equals(mes)) {
            gui = 5;
        }

        if ("jun".equals(mes) || "Jun".equals(mes) || "Junio".equals(mes)) {
            gui = 6;
        }

        if ("jul".equals(mes) || "Jul".equals(mes) || "Julio".equals(mes)) {
            gui = 7;
        }

        if ("ago".equals(mes) || "Ago".equals(mes) || "Agosto".equals(mes)) {
            gui = 8;
        }
        if ("sep".equals(mes) || "Sep".equals(mes) || "Septiembre".equals(mes)) {
            gui = 9;
        }

        if ("oct".equals(mes) || "Octubre".equals(mes) || "Oct".equals(mes)) {
            gui = 10;
        }

        if ("nov".equals(mes) || "Nov".equals(mes) || "Noviembre".equals(mes)) {
            gui = 11;
        }

        if ("dic".equals(mes) || "Dic".equals(mes) || "Diciembre".equals(mes)) {
            gui = 12;
        }

        return gui;
    }

//       public static boolean compararFechas(String fecha1, String fechafin) {
//       boolean resultado = false;
//       try{
//        ArrayList<String> valores = Generacion.descompnerCadena1(fecha1, '-');
//        Integer mes = Fecha.Mes(valores.get(1));
//        fecha1 = valores.get(0) + "/" + mes.toString() + "/" + valores.get(2);
//        valores.clear();
//        valores = Generacion.descompnerCadena1(fechafin, '-');
//        mes = Fecha.Mes(valores.get(1));
//        fechafin = valores.get(0) + "/" + mes.toString() + "/" + valores.get(2);
//        valores.clear();
//        
//        try {
//            /**
//             * Obtenemos las fechas enviadas en el formato a comparar
//             */
//            SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
//            Date fechaDate1 = formateador.parse(fecha1);
//            Date fechaDate2 = formateador.parse(fechafin);
//
//            if (fechaDate1.before(fechaDate2)) {
//                resultado = true;
//            } else {
//                if (fechaDate2.before(fechaDate1)) {
//                    resultado = false;
//                } else {
//                    resultado = true;
//                }
//            }
//        } catch (ParseException e) {
//
//        }
//       }
//       catch(Exception e){
//           resultado = false;
//       }
//        
//        return resultado;
//    }
}
