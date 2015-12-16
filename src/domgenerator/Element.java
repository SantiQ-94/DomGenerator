/**
 *
 * @author FamiliaQuiroga
 */

package domgenerator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Element extends Node {
    private String tagName;
    private Map <String, String> attributes;
    
    public Element(String tagName) {
        this.tagName = tagName;
        attributes = new HashMap<>();
    }
    
    public void setAttributeNode(Attr attribute) {
        attributes.put(attribute.getName(), attribute.getValue());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean esIgual = true;
        boolean tagEquality = true, attributesEquality = true, equalContent = true, childEquality = true;
        if (obj == null || getClass() != obj.getClass() ) {
            esIgual = false;
        }
        
        if (obj instanceof Element ) {
            Element other = (Element) obj;
            tagEquality = this.tagName.equals(other.tagName);
            
            Iterator thisIterator = this.attributes.entrySet().iterator();
            Iterator otherIterator = other.attributes.entrySet().iterator();
            
            while(thisIterator.hasNext() && otherIterator.hasNext()) {
                Object myAttribute = thisIterator.next();
                Object otherAttribute = otherIterator.next();
                if(!myAttribute.equals(otherAttribute)) {
                    equalContent = false;
                }
            }
            attributesEquality = equalContent && this.attributes.size() == other.attributes.size();
            childEquality = this.getChilds().equals(other.getChilds());
            esIgual = attributesEquality && tagEquality && childEquality;         
        }
        return esIgual;
    }
    
    
    
}
