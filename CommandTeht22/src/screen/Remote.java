package screen;

public class Remote {
	Command cmd;

	public Remote(Command cmd) {
		this.cmd = cmd;
	}

	public void push() {
		cmd.execute();
	}
}
