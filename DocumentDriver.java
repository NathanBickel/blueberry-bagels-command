<<<<<<< HEAD

=======
>>>>>>> 0bfec8c3348c7ab365faa19687528449b63e5b0c
import java.util.Scanner;

public class DocumentDriver {
	
	public void runDocumentDriver() {
		Scanner in = new Scanner(System.in);

		String docName = getInputLine("Enter document name", in);
		Document document = new Document(docName);
		InputHandler inHandler = new InputHandler(document);

		while(true) {
			String command = getInputLine("Enter Command", in);
			if(command.contentEquals("quit"))break;
			inHandler.inputEntered(command);
		}
		
		System.out.println("Goodbye");
	}
	
	private String getInputLine(String prompt, Scanner in) {
		System.out.print(prompt + ": ");
		return in.nextLine().toLowerCase().trim();
	}
	
	public static void main(String[] args) {
		DocumentDriver dDriver = new DocumentDriver();
		dDriver.runDocumentDriver();
	}
}
