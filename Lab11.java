import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab11 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		char answer = 'y';

		ArrayList<Movie> movies = new ArrayList<>();
		Movie shining = new Movie("The Shining", "horror");
		movies.add(shining);
		Movie country = new Movie("No Country for Old Men", "drama");
		movies.add(country);
		Movie spirited = new Movie("Spirited Away", "animated");
		movies.add(spirited);
		Movie alien = new Movie("Alien", "scifi");
		movies.add(alien);
		Movie full = new Movie("Full Metal Jacket", "drama");
		movies.add(full);
		Movie simpsons = new Movie("The Simpsons Movie", "animated");
		movies.add(simpsons);
		Movie space = new Movie("2001: A Space Odyssey", "scifi");
		movies.add(space);
		Movie howl = new Movie("Howl's Moving Castle", "animated");
		movies.add(howl);
		for(int i = 1; i <= 100; i++) {
			movies.add(Movie.getMovie(i));
		}

		ArrayList<String> animated = new ArrayList<>();
		ArrayList<String> horror = new ArrayList<>();
		ArrayList<String> drama = new ArrayList<>();
		ArrayList<String> scifi = new ArrayList<>();
		ArrayList<String> musical = new ArrayList<>();

		for(Movie movie : movies) {
			if(movie.getCategory().contentEquals("horror")) {
				horror.add(movie.getTitle());
			}
			Collections.sort(horror);
		}
		
		for(Movie movie : movies) {
			if(movie.getCategory().contentEquals("animated")) {
				animated.add(movie.getTitle());
			}
			Collections.sort(animated);
		}
		
		for(Movie movie : movies) {
			if(movie.getCategory().contentEquals("drama")) {
				drama.add(movie.getTitle());
			}
			Collections.sort(drama);
		}
		
		for(Movie movie : movies) {
			if(movie.getCategory().contentEquals("scifi")) {
				scifi.add(movie.getTitle());
			}
			Collections.sort(horror);
		}
		
		for(Movie movie : movies) {
			if(movie.getCategory().contentEquals("musical")) {
				musical.add(movie.getTitle());
			}
			Collections.sort(musical);
		}

		do {
			System.out.println("What type of movie would you like to watch?");
			System.out.println("1. animated");
			System.out.println("2. drama");
			System.out.println("3. horror");
			System.out.println("4. scifi");
			System.out.println("5. musical");
			System.out.println("Please enter a genre:");

			double selection = input.nextDouble();

			if(selection == 3) {
				for(String movie3 : horror) {
					System.out.println(movie3);
				}
			} else if(selection == 2) {
				for(String movie2 : drama) {
					System.out.println(movie2);
				}
			} else if(selection == 1) {
				for(String movie1 : animated) {
					System.out.println(movie1);
				}
			} else if(selection == 4) {
				for(String movie4 : scifi) {
					System.out.println(movie4);
				}

			} else if(selection == 5) {
				for(String movie5 : musical) {
					System.out.println(movie5);
				}
			} else {
				System.out.println("Please enter a valid genre.");
			}

			System.out.println("Would you like to continue? (y/n)");

			answer = input.next().charAt(0);

			input.nextLine();

		} while(answer == 'y' || answer == 'Y');

		input.close();

	}
}
