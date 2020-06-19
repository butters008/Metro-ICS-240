import java.util.Arrays;

public class Distributor {
	private String name;
	private String address;
	private String phone;
	private Movie[] movies = new Movie[5];
	private int numberOfMovies;
	
	public Distributor(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public Distributor(Movie[] movies) {
		movies = new Movie[] {null, null, null, null, null};
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Movie[] getMovies() {
		return Arrays.copyOf(movies, numberOfMovies);
	}
	
	public Movie[] addMovie(Movie movie) {
		return movies;		
	}
	
	public Movie[] addMovie(String name, String directorName, int genre, int earnings) {
		return movies;
		
	}

}
