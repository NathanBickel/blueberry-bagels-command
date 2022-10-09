import java.util.*;
/**
 * @author Hailey Lamere
 */
public class AppendCommand  extends Command{
    private Scanner in = new Scanner(System.in);

    /**
     * Calls the super class to append a line to the document
     * @param doc
     */
    public AppendCommand(Document doc){
        super(doc);
    }

    
    /** 
     * Calls the append method of the super class
     * @return document.append(string)
     */
    public String execute(){
        String string = in.next();
        return document.append(string);
    }
    
}
