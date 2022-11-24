package screen;

public class Main {

	public static void main(String[] args) {
		Screen screen = new Screen();
		Command pressDown = new PressDownCommand(screen);
		Command pressUp = new PressUpCommand(screen);
		Remote button1 = new Remote(pressDown);
		Remote button2 = new Remote(pressUp);
		button1.push();
		button2.push();

	}

}
