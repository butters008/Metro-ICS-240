public class Line {

	private Point start;
	private Point end;

	public Line(double startX, double startY, double endX, double endY) {

		this.start = new Point(startX, startY);
		this.end = new Point(endX, endY);

	}

	public Line(Point start, Point end) {

		this.start = start;
		this.end = end;
	}

	//Added the getters and setters
	public Point getStart() {
		return start;
	}

	public void setStart(Point start) {
		this.start = start;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}
	
	@Override
	public String toString() {

		String output = "";

		output += this.start;
		output += "\t" + this.end;

		return output;
	}

	
	public double length() {

		double output = Point.distance(this.start, this.end);
		
		return output;

	}

	public Point midPoint() {

		Point output = Point.midPoint(this.start, this.end);

		return output;
	}
	
	//Added startPoints and endPoints for exercise
	public Point startPoints() {
		return start; 
	}
	public Point endPoints() {
		return end; 
	}
	public String  printPoints() {
		return "Starting: " + start + " Ending: " + end;
	}
}
