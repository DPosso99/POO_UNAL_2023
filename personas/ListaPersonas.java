package personas;
import java.util.*;

public class ListaPersonas {
    Vector<Persona> listaPersonas; // Atributo que identifica un vector de personas
    public ListaPersonas() {
        listaPersonas = new Vector<Persona>(); // Crea el vector de personas
    }

    public void anadirPersona(Persona p) {
        listaPersonas.add(p);
    }

    public void eliminarPersona(int i) {
        listaPersonas.removeElementAt(i);
    }

    /**
     * Método que permite eliminar todos los elementos del vector de personas
     */
    public void borrarLista() {
        listaPersonas.removeAllElements();
    }

    public Persona anadirPersona(int index) {
        return null;
    }
}