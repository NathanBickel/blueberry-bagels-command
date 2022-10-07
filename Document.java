import java.util.ArrayList;

/***
 * @author Jackson, Nathan, Kat, Chance, Luna
 */

public class Document {
    private String fileName;
    private ArrayList<String> lines;

    /***
     * Sets fileName to name
     * Initializes lines to an empty ArrayList of Strings
     * @param name the intended fileName
     */
    public Document(String name){
        fileName = name;
        lines = new ArrayList<String>();
    }

    public String view(){

    }

    public String append(String line){

    }

    public String write(String line){

    }

    /**
     * Saves lines to the file specified by fileName
     * @return String specific to success or failure of saving
     */
    public String save(){
        if(FileManipulator.writeFile(fileName, lines)){
            return "The file has been saved";
        }
        return "Sorry, we cannot save at this time.";
    }
}
