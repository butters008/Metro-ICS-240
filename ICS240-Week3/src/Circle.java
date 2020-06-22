
public class Circle {

	private String color;
	private int radius;

	public Circle(String c, int r) {
		this.color = c;
		this.radius = r;
	}

	public void setRadius(int r) {
		this.radius = r;
	}

	public int getRadius() {
		return this.radius;
	}

	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}

	@Override
	public String toString() {
		String output = this.color + "\t" + this.radius;
		return output;
	}
	
}
