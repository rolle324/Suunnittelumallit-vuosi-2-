package screen;

public class PressDownCommand implements Command {
	private Screen screen;

	public PressDownCommand(Screen screen) {
		this.screen = screen;
	}

	@Override // Command
	public void execute() {
		screen.screenDown();
	}
}