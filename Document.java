import java.util.ArrayList;

/***
 * @author Jackson, Nathan, Kat, Chance, Luna
 */

public class Document {
    private String fileName;
    private ArrayList<String> lines;

    public Document(String name){
        
    }

    public String view(){

    }

    public String append(String line){
        
    }

    public String write(String line){
        lines.clear();
        lines.add(line);
        return "The line was written to the file";
    }

    public String save(){

    }
}
