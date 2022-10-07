import java.util.*;
/**
 * @author Katelyn Wyandt
 */
public class WriteCommand extends Command{
    private Scanner scanner = new Scanner(System.in);
    public WriteCommand(Document doc){
        super(doc);
    }
    public String execute(){
        return document.write(Scanner.in);
    }
}