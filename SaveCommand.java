/***
 * @author Jackson
 */

 /***
  * A class defining SaveCommand behavior according to Command
  */
public class SaveCommand extends Command{
    
    public SaveCommand(Document doc){
        super(doc);
    }

    public String execute(){
        return document.save();
    }
}
