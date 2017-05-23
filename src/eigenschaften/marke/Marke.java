package eigenschaften.marke;

public interface Marke {

	public enum MarkeTyp{
		Auto, Fahrrad, Motorrad;
	}
	
	public MarkeTyp getType();
	public String getMarke();
}
