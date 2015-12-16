/**
 *
 * @author FamiliaQuiroga
 */

package domgenerator;

public class Attr extends Node{
    private String name;
    private String value;
    
    public Attr(String name, String value) {
        this.name = name;
        this.value = value;
    }
    
    public String getName() {
        return name;
    }
    
    public String getValue() {
        return value;
    }
}
