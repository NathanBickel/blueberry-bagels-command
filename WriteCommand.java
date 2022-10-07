import java.util.*;
/**
 * @author Katelyn Wyandt
 */
public class WriteCommand extends Command{
    private Scanner in = new Scanner(System.in);
    /**
     * Calls super class to write line to document
     * @param doc document being manipulated by child class
     */
    public WriteCommand(Document doc){
        super(doc);
    }
    /**
     * Calls the write method of the super class
     * @return document.write(string)
     */
    public String execute(){
        String string = in.next();
        return document.write(string);
    }
}