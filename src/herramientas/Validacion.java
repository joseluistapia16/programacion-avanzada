package herramientas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class Validacion {
    public boolean Cedula(String c) {
        Pattern ced = Pattern.compile("^[0-9]{10}");//Aqui
        Matcher cm = ced.matcher(c);
        boolean exis = cm.matches();
        if (exis) {
            return true;
        } else {
            System.out.println("Cédula Invalida !");
            return false;
        }

    }

    public boolean Correo(String co) {
        boolean u;
        u = isEmail(co);
        return u;

    }

    public boolean isEmail(String valor) {
        return validar("^[\\w-\\.]+\\@[\\w\\.-]+\\.[a-z]{2,4}$", valor);
    }

    public boolean validar(String expReg, String valor) {
        Pattern patron = Pattern.compile(expReg);
        Matcher encajador = patron.matcher(valor);
        return encajador.matches();
    }

}
