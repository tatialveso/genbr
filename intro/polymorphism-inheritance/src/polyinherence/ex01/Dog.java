package polyinherence.ex01;

public class Dog extends Animal {
	private boolean run;

	public boolean isRun() {
		if(run) {
			System.out.println("corre");
		} else {
			System.out.println("n�o corre");
		}
		return run;
	}

	public void setRun(boolean run) {
		this.run = run;
	}
}
