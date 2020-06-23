public class movieDriver {
	public static void main(String[] args) {
		Movie movie1 = new Movie("Star Wars Episode IV: A New Hope", "Geroge Lucas", 2);
		Movie movie2 = new Movie("Die Hard", "John McTiernan", 1);
		Movie movie3 = new Movie("Tremors", "Ron Underwood", 0);
		Movie movie4 = new Movie("Lord of the Rings: Fellowship of the Ring", "Peter Jackson", 1);
		Movie movie5 = new Movie("Sonic the Hedgehog", "Jeff Fowler", 0);
		
		//has income
		Movie movie6 = new Movie("Star Trek", "J.J. Abrams", 2, 385);
		Movie movie7 = new Movie("Lord of the Rings: The Two Towers", "Peter Jackson", 1, 95.1);
		Movie movie8 = new Movie("Lord of the Rings: Return of the King", "Peter Jackson", 1, 114.2);
		Movie movie9 = new Movie("King Kong", "Peter Jackson", 0, 95.1);
		Movie movie10 = new Movie("The Hobbit", "Peter Jackson", 0, 114.2);
		
		Distributor dist1 = new Distributor("Fantasy Movies Inc", "9th Ave South, St. Cloud MN 56301", "3209820546");
		Distributor dist2 = new Distributor("Cool Movies Inc", "555 Central Ave, Milaca MN 56353", "3202776546");
		
		//Testing to make sure that bool can be both true and false
		Distributor dist3 = new Distributor("Fantasy Movies Inc", "9th Ave South, St. Cloud MN 56301", "3209820546");

		dist1.addMovie("My Life, My Road", "Keith Butterfield", 0, 155);
		dist1.addMovie("Boogie Nights", "The Marky Mark", 1, 334);
		dist1.addMovie("Dragon Age Movie", "Bioware and Other", 2, 110);

		dist2.addMovie(movie1);
		dist2.addMovie(movie2);
		dist2.addMovie(movie3);
		dist2.addMovie(movie4);
		dist2.addMovie(movie5);		
		
		//Testing out if the movies where getting added and then printing the entire array to make sure
		//if there was still some that where null
		//dist1.print();
		//dist2.print();
		
		System.out.println("Testing the Testing the Movie Class\n");
		movie1.addToEarnings(771.5);
		movie2.addToEarnings(165);
		movie3.addToEarnings(77.5);
		movie4.addToEarnings(116.2);
		movie5.addToEarnings(114.9);
		
		System.out.println(movie1.equals(movie2));
		
		System.out.println("Testing the Distributor Class\n");
		System.out.println("How many movies are in Dist1 " + dist1.totalNumMovies());
		System.out.println("Total earnings for Dist1 " + dist1.findTotalEarnings());
		System.out.println("Total earnings for Dist2 " + dist2.findTotalEarnings());
		System.out.println("Total earnings for comedy for Dist2 " + dist2.comedyEarnings());
		System.out.println("Total earnings for comedy for Dist1 " + dist1.comedyEarnings());
		
	}

}
