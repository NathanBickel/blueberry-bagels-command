/**
 * @author Nathan Bickel
 */
public abstract class Command {
    
    protected Document document;

    /**
     * Constructor for Command
     * @param document document taken in
     */
    public Command(Document document) {
        this.document = document;
    }

    /**
     * @return String from code executing
     */
    public abstract String execute();

}