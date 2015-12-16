/**
 *
 * @author FamiliaQuiroga
 */

package domgenerator;

public class Text extends Node {
    private String wholeText;
    
    public Text(String wholeText) {
        this.wholeText = wholeText;
    }
    
    public String getWholeText() {
        return wholeText;
    }
}
