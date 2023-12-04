
package accesoadatosconjavadom;

import Clases.AccesoDOM;
import java.io.File;


public class AccesoADatosCOnJavaDom {

    
    public static void main(String[] args) {
    AccesoDOM as=new AccesoDOM();
    
File f=new File("Libros.xml");//necesitamos Libros.xml en la ruta correcta

as.abrirXMLaDOM(f);
as.recorreDOMyMuestra();
as.insertarLibroEnDOM("DonDavidSuarez90", "David suarez", "22-4-20023");
as.deleteNode("El Nombre de la Rosa");
as.guardarDOMcomoArchivo("LibrosDeDOM3.xml");
}
    }
    

