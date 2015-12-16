/**
 *
 * @author FamiliaQuiroga
 */

package domgenerator;

import org.junit.Test;
import static org.junit.Assert.*;

public class TextTest {
    
    private Text texto;
    
    public TextTest() {
        texto = new Text("Texto");
    }

    @Test
    public void testGetWholeText() {
        String textoEsperado ="Texto";
        assertEquals(textoEsperado, texto.getWholeText());
    }
    
    @Test
    public void testNotGetWholeText() {
        String textoEsperado = "texto";
        assertFalse(textoEsperado.equals(texto.getWholeText()));
    }
}
