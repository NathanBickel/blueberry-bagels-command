
/**
 * @author Chance Storey
 */
public class ViewCommand extends Command{
    /**
     * Command to view a document
     * @param doc The document for this command to reference
     */
    public ViewCommand(Document doc){
        super(doc);
    }

    /**
     * Calls the given Document's view method
     * @return String The document printed with added formatting
     */
    public String execute(){
        return document.view();
    }
}