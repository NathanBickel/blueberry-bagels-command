/***
 * @author Jackson
 */

 /***
  * A class defining SaveCommand behavior according to Command
  */
public class SaveCommand extends Command{
    
    /***
     * Creates a SaveCommand object with the specified Document
     * @param doc Document to be saved
     */
    public SaveCommand(Document doc){
        super(doc);
    }

    /***
     * Calls the document's save method and returns its output
     */
    public String execute(){
        return document.save();
    }
}
