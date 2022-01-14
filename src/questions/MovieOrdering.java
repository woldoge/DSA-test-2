package questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieOrdering {
	ArrayList<Movie> movies;
	public MovieOrdering() {
		this.movies = new ArrayList<Movie>();
	}
	
	
	public void addMovie(Movie m) {
		this.movies.add(m);
	}
	
	public int currentJoyfulness() {
		int joyfulness = 0;
		String prev_genre = "";
		for(Movie m:this.movies) {
			if(m.genre != prev_genre) {
				joyfulness += m.duration;
			}
			prev_genre = m.genre;
		}
		return joyfulness;
		
	}
	
	public int maxJoyfulness() {
		ArrayList<Movie> movies = this.movies;
		int joyfulness = 0;
		String prev_genre = "";
		for(Movie m:movies) {
			if(m.genre != prev_genre) {
				joyfulness += m.duration;
			}
			else {
				
			}
			prev_genre = m.genre;
		}
		return joyfulness;
	}
	
	ArrayList<Movie> sort_movie(){
		ArrayList<Movie> movies = this.movies;
		return movies;
	}
	
	public static class Movie implements Comparator<Movie>{
		String title;
		String genre;
		double rating;
		int duration;
		public Movie(String title, String genre, double rating, int duration) {
			super();
			this.title = title;
			this.genre = genre;
			this.rating = rating;
			this.duration = duration;
		}
		@Override
		public int compare(Movie o1, Movie o2) {
			return o1.genre.compareToIgnoreCase(o2.genre);
		}
		
	}
}
