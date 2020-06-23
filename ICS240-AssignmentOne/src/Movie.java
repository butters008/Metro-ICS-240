
public class Movie {
	private String name;
	private String directorName;
	private double earnings;
	private int genre;
	
	public Movie (String name, String directorName, int genre) {
		this.name = name;
		this.directorName = directorName;
		this.genre = genre;
	}

	//Added this to help with Distributor class
	public Movie(String name2, String directorName2, int genre2, double earnings2) {
		this.name = name2;
		this.directorName = directorName2;
		this.genre = genre2;
		this.earnings = earnings2;
	}
	
	public Movie(Movie m) {
		
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

//	public boolean equals (String name, String directorName, int genre) {
//		if (this.name.equals(name) && this.directorName.equals(directorName) && this.genre == genre) {
//			return true;
//		}
//		return false;
//	}
	
	public boolean equals(Movie m1) {
		if(this.name.equals(m1.getName()) && this.directorName.equals(m1.getDirectorName()) && this.genre == m1.getGenre()) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "The movie " + name + " which was directed by " + directorName + " " + genre + " " + earnings;	
	}
}
