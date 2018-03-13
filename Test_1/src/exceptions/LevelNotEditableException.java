package exceptions;

@SuppressWarnings("serial")
public class LevelNotEditableException extends Exception {
	public LevelNotEditableException() {
	super("This level can't be edited.");
	}
}
