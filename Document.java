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
        //Determine max line length for border
        int len = 8;
        for(String line : lines){
            // Adds extra 10 spacing for decoration
            if(line.length() + 10 > len){
                len = line.length() + 10;
            }
        }
        //Print top border
        for(int i = 0; i < len; i++)
            System.out.print("_");
        System.out.println();
        //Print each line decorated
        for(String line : lines)
            System.out.println("|    "+line+"    |");
        //Print bottom border
        for(int i = 0; i < len; i++)
            System.out.print("_");
        System.out.println();
    }

    public String append(String line){
        
    }

    /**
     * This method will clear the existing file and write the new string
     * @param line array of lines in the file
     * @return return message the line was writte
     */
    public String write(String line){
        lines.clear();
        lines.add(line);
        return "The line was written to the file";
    }

    public String save(){

    }
}
