
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

	public int getGenre() {
		return genre;
	}

	public void setGenre(int genre) {
		this.genre = genre;
	}
	
	public void addToEarnings(double add) {
		this.earnings += add;
	}
	
	public boolean equals(Movie m1) {
		if(this.name.equals(m1.getName()) && this.directorName.equals(m1.getDirectorName()) && this.genre == m1.getGenre()) {
			return true;
		}
		return false;
	}
	
	private String getNumGenre() {
		String g;
		if(this.genre == 0) {
			g = "Comedy";
		}
		else if(this.genre == 1) {
			g = "Action";
		}
		else if(this.genre == 2) {
			g = "Fiction";
		}
		else {
			g = "Not Valid";
		}
		return g;
	}
	
	public String toString() {
	
		return "The movie " + name + " which was directed by " + directorName + 
				" \nand the genre is " + this.getNumGenre() + " which made " + earnings + " million";	
	}


}
