
public class TaskMain {

	public static void main(String[] args) {

		Integer a = 5, b = 234, c=1501, d=7;
		
		Addition addition = new Addition(a, b);
		System.out.println(addition.toString());
		
		Differenz differenz = new Differenz(c,b);
		System.out.println(differenz.toString());
	}

}
