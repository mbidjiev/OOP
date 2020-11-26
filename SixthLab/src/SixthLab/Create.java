package SixthLab;

public class Create {
	int n;
	public Create(int n) {
		this.n = n;
	}
	public void Create() {
		if (n == 1) System.out.println("One line");
		if (n == 2) System.out.println("Two lines");
		if (n == 3) System.out.println ("Three lines");
		if (n == 4) System.out.println("Four lines");
		if (n > 4) System.out.println("Many-many lines");
	}
}
