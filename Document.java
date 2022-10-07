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

    public String write(String line){

    }

    public String save(){

    }
}
