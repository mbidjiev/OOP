package SixthLab;

public class Geometry<Point> {
	private Point type;
	private int line;
	
	Geometry(int line){
		this.line = line;
	}
	
	public Point getType() {return type;}
	public void drawLine() {
		for (int i = 0; i < line; i++) System.out.print("_");
	}
}
