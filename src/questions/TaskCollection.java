package questions;


public class TaskCollection{
	Task[] tasks;
	int index;
	public TaskCollection(){
		this.tasks = new Task[2027];
		this.index = -1;
	}

	
	
	public int calcLocation(Task t) {
		int index = 0;
		for (int i = 0; i < t.name.length(); i++){
		    char c = t.name.charAt(i);
		    if (c == ' ') {
		    	continue;
		    }
		    index += (int) c - 65;
		}

		return index;
	}
	
	public int addTask(Task t) {
		int index = this.calcLocation(t);
		while(true) {
			if (this.tasks[index] == null) {
				this.tasks[index] = t;

				return index;
			}
			index+=1;
		}
	}
	
	public Task getTask(String name) {
		int index = 0;
		for (int i = 0; i < name.length(); i++){
		    char c = name.charAt(i);
		    if (c == ' ') {
		    	continue;
		    }
		    index += (int) c - 65;
		}
		if (this.tasks[index] != null){
			
			if (this.tasks[index].name != name) {

				return null;
			}

			return this.tasks[index];
		}
		else {

			return null;
		}
	}
	public static class Task{
		String name;
		boolean status;
		public Task(String name, boolean status) {
			super();
			this.name = name;
			this.status = status;
		}
		
	}
}

