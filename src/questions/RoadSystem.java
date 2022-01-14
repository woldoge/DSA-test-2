package questions;

import java.util.ArrayList;

public class RoadSystem {
	ArrayList<Lab> labs;
	
	
	
	public RoadSystem() {
		super();
		this.labs = new ArrayList<Lab>();
	}

	public static class Lab{
		String name;
		double x;
		double y;
		public Lab(String name, double x, double y) {
			super();
			this.name = name;
			this.x = x;
			this.y = y;
		}
		
		
	}
	
	public void addLab(Lab l) {
		this.labs.add(l);
	}
	
	public double simpleLength() {
		double last_x = labs.get(0).x;
		double last_y = labs.get(0).y;
		double length = 0;
		for (Lab lab:this.labs) {
			length += Math.sqrt((lab.x - last_x)*(lab.x - last_x) + (lab.y -last_y)*(lab.y -last_y));
			last_x = lab.x;
			last_y = lab.y;
		}
		return length;
	}
	
	public double optimalLength() {
		return 0;
		
	
	}
}
