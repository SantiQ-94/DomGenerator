/**
 *
 * @author FamiliaQuiroga
 */

package domgenerator;

import java.util.ArrayList;
import java.util.List;

public class Node {
    
    private List <Node> childNodes;
    
    public Node() {
        childNodes = new ArrayList<>();
    }
    
    public void appendChild(Node nodo) {
        childNodes.add(nodo);
    }
    
    public List<Node> getChilds() {
        return childNodes;
    }
}
