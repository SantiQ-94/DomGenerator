/**
 *
 * @author FamiliaQuiroga
 */

package domgenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Componente {
    
    private Map <String, String> atributos;
    private List <Componente> hijos;
    
    public Componente () {
        this.atributos = new HashMap<>();
        this.hijos = new ArrayList<>();
    }
    
    public void agregarAtributo (String atributo, String valor) {
        this.atributos.put(atributo, valor);
    }
    
    public void agregarHijo (Componente hijo) {
        this.hijos.add(hijo);
    }
}
