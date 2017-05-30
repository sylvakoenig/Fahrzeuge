
public class Addition extends Operation{

	Integer summand1, summand2;
	
	public Addition(Integer summand1, Integer summand2) {
		this.summand1=summand1;
		this.summand2=summand2;
	}

	@Override
	public Integer evaluate() {
		return (this.summand1 + this.summand2);
	}

	public String toString(){
		return (this.summand1 + " + " + this.summand2 + " = " + this.evaluate());
	}
	
}
