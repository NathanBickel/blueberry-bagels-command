
/**
 * @author Chance Storey
 */
public class ViewCommand extends Command{
    public ViewCommand(Document doc){
        super(doc);
    }

    @Override
    public String execute(){
        return document.view();
    }
}