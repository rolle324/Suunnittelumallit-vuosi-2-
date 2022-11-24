package screen;

public class PressUpCommand implements Command {
	private Screen screen;

	public PressUpCommand(Screen screen) {
		this.screen = screen;
	}

	@Override // Command
	public void execute() {
		screen.screenUp();
	}
}