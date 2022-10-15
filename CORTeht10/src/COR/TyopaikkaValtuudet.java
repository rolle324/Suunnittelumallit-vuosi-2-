package COR;

public abstract class TyopaikkaValtuudet {
	private TyopaikkaValtuudet successor;

	public void setSuccessor(TyopaikkaValtuudet successor) {
		this.successor = successor;
	}

	public void processRequest(TyopaikkaPyynto request) {
		if (successor != null)
			successor.processRequest(request);
	}
}
