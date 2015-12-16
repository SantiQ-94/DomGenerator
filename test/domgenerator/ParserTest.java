/**
 *
 * @author FamiliaQuiroga
 */

package domgenerator;

import org.junit.Test;
import static org.junit.Assert.*;

public class ParserTest {
    
    private Parser parser;
    
    public ParserTest() {
        Parser parser = new Parser();
    }

    @Test
    public void testParseTag() {
        Element elemento = new Element("p");
        Attr atributo = new Attr("name","parrafo");
        Text texto = new Text("texto");
        
        elemento.setAttributeNode(atributo);
        elemento.appendChild(texto);
        Element elementoAComparar = parser.parse("<p name:\"parrafo\">texto</p>");
        assertEquals(elemento, elementoAComparar);
    }
    
}
/**
 * "<p name:\"parrafo\">texto</p>"
 * */

 