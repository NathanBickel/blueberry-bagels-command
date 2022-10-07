import java.util.HashMap;

/**
 * @author Nathan Bickel
 */
public class InputHandler {
    
    private HashMap<String, Command> commands;

    /**
     * Constructor for InputHandler
     * @param document Document given
     */
    public InputHandler(Document document) {
        commands = new HashMap<String, Command>();
        commands.put("view", new ViewCommand(document));
        commands.put("append", new AppendCommand(document));
        commands.put("write", new WriteCommand(document));
        commands.put("save", new SaveCommand(document));
    }

    /**
     * Calls Command from command string
     * @param data Command that maps to HashMap
     */
    public void inputEntered(String data) {
        commands.get(data).execute();
    } 

}