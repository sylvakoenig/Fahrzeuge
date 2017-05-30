
public class Differenz extends Operation{

	private Integer minuend, subtrahend;
	
	public Differenz(Integer minuend, Integer subtrahend) {
		this.minuend = minuend;
		this.subtrahend = subtrahend;
	}

	@Override
	public Integer evaluate() {
		return (this.minuend-this.subtrahend);
	}

	public String toString(){
		return (this.minuend + " - " + this.subtrahend + " = " + this.evaluate());
	}
}
