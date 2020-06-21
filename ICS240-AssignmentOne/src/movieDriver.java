public class movieDriver {
	public static void main(String[] args) {
		Movie movie1 = new Movie("Star Wars Episode IV: A New Hope", "Geroge Lucas", 775500000);
		Movie movie2 = new Movie("Die Hard", "John McTiernan", 141500000);
		Movie movie3 = new Movie("Tremors", "Ron Underwood", 16000000);
		Movie movie4 = new Movie("Lord of the Rings: Fellowship of the Ring", "Peter Jackson", 887800000);
		Movie movie5 = new Movie("Sonic the Hedgehog", "Jeff Fowler", 306800000);
		Movie movie6 = new Movie("Star Trek", "J.J. Abrams", 385700000);
		Movie movie7 = new Movie("Lord of the Rings: The Two Towers", "Peter Jackson", 951200000);
		Movie movie8 = new Movie("Lord of the Rings: Return of the King", "Peter Jackson", 1142000000);
		
		Distributor dist1 = new Distributor("Fantasy Movies Inc", "9th Ave South, St. Cloud MN 56301", "3209820546");
		Distributor dist2 = new Distributor("Cool Movies Inc", "555 Central Ave, Milaca MN 56353", "3202776546");
		
		//Testing to make sure that bool can be both true and false
		Distributor dist3 = new Distributor("Fantasy Movies Inc", "9th Ave South, St. Cloud MN 56301", "3209820546");

//		Movie[] movie22 = null;
		
		
//		dist1.addMovie(movie22);
		dist1.addMovie("life", "Keith", 1, 568425);
//		dist1.addMovie(movie1);
//		dist1.addMovie(movie2);
//		dist1.addMovie(movie3);
//		dist1.addMovie(movie4);
//		dist1.addMovie(movie5);
		System.out.println(dist1.getMovies(dist1)); 		
		
//		dist2.addMovie(movie7);
//		dist2.addMovie(movie8);
//		dist2.addMovie("life", "Keith", 1, 568425);
		System.out.println("total number of movies of Dist2 " + dist2.totalNumMovies());
		System.out.println("total number of movies of Dist1 " + dist2.totalNumMovies());

//		System.out.println(dist2);
//		System.out.println(dist1);
//		
//		for(int i = 0; i < dist2.totalNumMovies(); i++) {
//			System.out.println(dist2.getMovies()); 
//		}
//		
//		for(int i = 0; i < dist1.totalNumMovies(); i++) {
//			System.out.println(dist1.getMovies()); 
//		}
//		
		//System.out.println(dist2.getMovies());		
//		
//		Distributor dist4 = new Distributor(null);
//		for(int i = 0; i < 5; i++) {
//			System.out.println(dist4.getMovies());
//			System.out.println("testing" + null);
//		}
		
	}

}
