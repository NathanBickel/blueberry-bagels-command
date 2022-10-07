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
