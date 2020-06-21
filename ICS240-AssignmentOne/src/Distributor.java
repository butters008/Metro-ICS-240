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
		movies = null;
		for(int i=0;i<5;i++)
		{
		    this.movies[i] = null;
		}
	}
	
//	public Distributor() {
//		movies = null;
//		for(int i=0;i<5;i++)
//		{
//			this.movies[i] = null;
//		}
//	}

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
	
	public Movie[] getMovies(Distributor dist) {
		return Arrays.copyOf(movies, numberOfMovies);
	}
	
	public Movie[] addMovie(Movie m) {
		//this.movies = m;
		return movies;		
	}
	
	public void addMovie(String name, String directorName, int genre, double earnings) {
		//For now we are using 5 since we know how big, 
		//change  to look for array length for future use to avoid bug
		for (int i = 0; i<5; i++) {
			if (movies[i] != null) {
				movies[i] = new Movie(name, directorName, genre, earnings);
				System.out.println("We are in the if");
				System.out.println(i);
				System.out.println("");
			}
			else {
				movies[i] = new Movie(name, directorName, genre, earnings);
				System.out.println("We are in the else");
				System.out.println(i);
				System.out.println(movies[i].toString());
				break;
			}
		}
		
	}
	
	public int totalNumMovies() {
		return this.movies.length;
	}
	//TODO Complete findTotalEarnings
	public void findTotalEarnings() {
		
	}
	//TODO Complete comedyEarnings
	public void comedyEarnings() {
		
	}
	//TODO Complete addEarnings
	public void addEarnings() {
		
	}
	
	public boolean equals(Distributor dist) {
		return this.name.equals(dist.name);
	}
	
	//TODO Finish the toString
	public String toString() {
		return "Distributor's name " + name +
				"\nDistributor address " + address +
				"\nDistributor phone number " + phone +
				"\n\nDistributor Movie count " + movies.length;
	}
	
	
//	public void main (String[] arg) {
//		
//		//Movie[] movies2 = new Movie[5];
//		
//		
//		this.addMovie("life", "sssssss", 1, 568425);
//		this.addMovie("life", "ddd", 1, 568425);
//		this.addMovie("life", "Keith", 1, 568425);
//		
//		for (int i = 0; i < movies.length; i++) {
//			System.out.println(movies[i].toString());
//		}
//		
//		System.out.println(getMovies());
//	}
	
}
