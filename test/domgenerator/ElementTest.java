/**
 *
 * @author FamiliaQuiroga
 */

package domgenerator;

import org.junit.Test;
import static org.junit.Assert.*;

public class ElementTest {
    private Element elemento;
    
    public ElementTest() {
        elemento = new Element("p");
    }

    @Test
    public void testEquals() {
        Attr atributo = new Attr("name", "parrafo");
        Element elementoDeComparacion = new Element("p");
        Text texto = new Text("Texto");
        elemento.setAttributeNode(atributo);
        elemento.appendChild(texto);
        elementoDeComparacion.setAttributeNode(atributo);
        elementoDeComparacion.appendChild(texto);
        assertEquals(elementoDeComparacion, elemento);
    }
    
        @Test
    public void testNotEquals() {
        Attr atributo = new Attr("name", "parrafo");
        Element elementoDeComparacion = new Element("p");
        elemento.setAttributeNode(atributo);
        assertFalse(elementoDeComparacion.equals(elemento));
    }
    
}
