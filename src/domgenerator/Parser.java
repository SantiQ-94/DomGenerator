/**
 *
 * @author FamiliaQuiroga
 */

package domgenerator;

public class Parser {    
    
    public Element parse(String HTML) {
        Element elemento;
        int inicioTag = 0,finTag = 0;
        int i=0;
        while(i < HTML.length()) {
            if (HTML.charAt(i) == '<' && HTML.charAt(i+1) != '/') {
                inicioTag = i;
            } else if (HTML.charAt(i) == '>') {
                finTag = i;
                break;
            }
            i++;
        }
                    System.out.println(inicioTag+" - "+finTag);
        String tag = HTML.substring(inicioTag+1, finTag);
        String[] componentesTag = tag.split(":\"|\"");
                    System.out.println("ComponentesTag tiene tamaño :"+componentesTag.length);
        elemento = new Element(componentesTag[0]);
        Attr atributo = new Attr(componentesTag[1], componentesTag[2]);
                System.out.println(componentesTag[1]+" - "+componentesTag[2]);
        String contenido = HTML.substring(finTag+1,HTML.length());
        String[] contenidoReal = contenido.split("</");
                System.out.println(contenidoReal[0]);
        Text texto = new Text(contenidoReal[0]);
        
        elemento.setAttributeNode(atributo);
        elemento.appendChild(texto);
        return elemento;
    }
    

}
