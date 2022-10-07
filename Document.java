import java.util.ArrayList;

/***
 * @author Jackson, Nathan, Kat, Chance, Luna
 */

public class Document {
    private String fileName;
    private ArrayList<String> lines;

    public Document(String name){
        
    }

    /**
     * Returns the lines in this document with a formatted border
     * @return String The formatted text
     */
    public String view(){
        String ret = "";
        //Determine max line length for border
        int len = 8;
        for(String line : lines){
            // Adds extra 8 spacing for decoration
            if(line.length() + 8 > len){
                len = line.length() + 8;
            }
        }
        //Print top border
        for(int i = 0; i < len + 2; i++)
            ret += "_";
        ret += "\n\n";
        //Print each line decorated
        for(String line : lines)
            //ret += "|    "+line+"    |\n";
            ret += String.format("|%-"+len+"s|%n", line);
        //Print bottom border
        for(int i = 0; i < len + 2; i++)
            ret += "_";
        ret += "\n";

        return ret;
    }

    public String append(String line){

    }

    public String write(String line){

    }

    public String save(){

    }
}
