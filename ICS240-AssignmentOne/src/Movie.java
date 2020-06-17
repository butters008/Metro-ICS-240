
public class Movie {
	private String name;
	private String directorName;
	private double earnings;
	private int genre;
	
	public Movie (String name, String directorName, double earnings) {
		this.name = name;
		this.directorName = directorName;
		this.earnings = earnings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public double getEarnings() {
		return earnings;
	}

	//Does not need this in project
//	public void setEarnings(double earnings) {
//		this.earnings = earnings;
//	}

	public int getGenre() {
		return genre;
	}

	public void setGenre(int genre) {
		this.genre = genre;
	}
	
	public void addToEarnings(double add) {
		this.earnings += add;
	}

	public boolean equals (String name, String directorName, int genre) {
		if (this.name.equals(name) && this.directorName.equals(directorName) && this.genre == genre) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "The movie " + name + " which was directed by " + directorName + " " + genre + " " + earnings;	
	}
}
