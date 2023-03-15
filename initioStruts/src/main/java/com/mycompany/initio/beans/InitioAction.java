 
package com.mycompany.initio.beans;
  
import org.apache.logging.log4j.*;

/*a ésta clase llegué porque 
index -> path saludar
-> xml tiene quién es path "name" (quién es saludar(class es saludar)) y quién es class,
ésta es la class
-> pide execute()
-> execute dice que el atributo de la clase se modifica (saludosAtr)
   y que return "EXITO"
-> ahora el xml identifica que la cadena EXITO coincide con name de un <result>
-> toma result, que en este caso es un jsp y le pasa los parámetros
-> el JSP pide el atributo saludosAtr que ya lo tenemos definido y muestra su <value>
*/


public class InitioAction {
    Logger log = LogManager.getLogger(InitioAction.class);
    
    //atributo que va a usar el JSP para poder mandar información hacia el cliente
    private String saludosAtr;

    //método para que sea un Action de Struts
    public String execute(){
        log.info("ejecutando método execute desde Struts2");
        this.saludosAtr = "salu2 desde struts 2"; //procesa algo
        return "EXITO"; //un retorno, coincide con un <action><result name= ?
    }
    
    public String getSaludosAtr() {
        return saludosAtr;
    }

    public void setSaludosAtr(String saludosAtr) {
        this.saludosAtr = saludosAtr;
    }
}
