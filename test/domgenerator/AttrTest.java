/**
 *
 * @author FamiliaQuiroga
 */

package domgenerator;

import org.junit.Test;
import static org.junit.Assert.*;

public class AttrTest {
    
    private Attr atributo;
    
    public AttrTest() {
        atributo = new Attr("Name", "atributo");
    }

    @Test
    public void testGetName() {
        String nombreEsperado = "Name";
        assertEquals(nombreEsperado, atributo.getName());
    }


    @Test
    public void testGetValue() {
        String valorEsperado = "atributo";
        assertEquals(valorEsperado, atributo.getValue());
    }
}
