package factory_method;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class Application {
	Doc d;
	
	public abstract void createFile(String fileName);
	
}

abstract class Doc {
	abstract void openFile(String fileName);
	abstract void writeFile(String token);
	abstract void closeFile();
}

class GameApp extends Application {
	Doc d;
	
	public GameApp() {
		
		d = createFile();
	}

	private Doc createFile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createFile(String fileName) {
		// TODO Auto-generated method stub
		
	}
}