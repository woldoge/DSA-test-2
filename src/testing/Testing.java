package testing;

import java.util.ArrayList;

import questions.CovidVariant;
import questions.MovieOrdering;
import questions.MovieOrdering.Movie;
import questions.RoadSystem;
import questions.RoadSystem.Lab;
import questions.TaskCollection;
import questions.TaskCollection.Task;
 

class Testing{
	public static void main(String[] args) {
		
		//Q1 (copied from tset description)
		Task t1 = new Task("GET DI", true);
		Task t2 = new Task("GET HD", false);
		TaskCollection taskCol = new TaskCollection();
		taskCol.calcLocation(t1);  // return 40
		taskCol.calcLocation(t2);  // return 39
		taskCol.calcLocation(new Task("GET D I", false));  // return 40
		taskCol.addTask(t1);  // return 40
		taskCol.addTask(new Task("GET D I", false)); // return 41, due to collision at 40-th location
		taskCol.getTask("GET DI");  // return Task t1
		taskCol.getTask("G E T D I"); // return null
		taskCol.getTask("GET HD");  // return null
		
		
		//Q2 (copied from test description)
		
		Movie a = new Movie("Squid Game", "Thriller", 7.6, 120);
		Movie b = new Movie("Spider-Man", "Action", 8.5, 110);
		Movie c = new Movie("The Matrix Resurrections", "Action", 6.2, 140);
		MovieOrdering mo = new MovieOrdering();
		mo.addMovie(a);
		mo.addMovie(b);
		mo.addMovie(c);
		mo.currentJoyfulness(); // return 230
		mo.maxJoyfulness(); // return 370
		
		//Q3 (copied from test description)
		Lab l1 = new Lab("Advanced AI", 0.0, 0.0);
		Lab l2 = new Lab("Cyber Security", 10, 0);
		Lab l3 = new Lab("IoT", 0, 10);
		RoadSystem rs = new RoadSystem();
		rs.addLab(l1);
		rs.addLab(l2);
		rs.addLab(l3);
		rs.simpleLength();  // return 24.142
		rs.optimalLength();  // return 20
		
		//Q4 (copied from test description)
		CovidVariant v1 = new CovidVariant("DELTA", "HELLOFROMDELTA");
		v1.evenSequence();  // return true
		v1.isSubsequence("HLOFRDLA"); // return true
		CovidVariant v2 = new CovidVariant("BETA", "HELLOFROMBETA");
		v2.evenSequence(); // return false
		v2.isSubsequence("HLOFRDLA"); // return false
		v1.longestCommonSubsequence(v2);  // return 12, the longest common subsequence is "HELLOFROMETA"
	}
}