//This is going to be a redo of assignment two, instead of working on a checkbook app,
//I am going to be working on this and in-hopes to make this a mobile app
public class Project {
	private String projectName;
	private int projectCost;
	
	public Project(String name, int cost) {
		projectName = name;
		projectCost = cost;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getProjectCost() {
		return projectCost;
	}

	public void setProjectCost(int projectCost) {
		this.projectCost = projectCost;
	}
	
	public String toString() {
		return "Project [Project Name " + this.projectName + ", Project Costs " + this.projectCost + "]";
	}
	
	public boolean equals(String s1) {
		if(this.getProjectName().equalsIgnoreCase(s1)) {
			return true;
		}
		return false;
	}
	public boolean equals(Project p1) {
		if(this.getProjectName().equalsIgnoreCase(p1.getProjectName()) && this.getProjectCost() == this.getProjectCost()) {
			return true;
		}
		
		return false;
	}
	
	public int compareTo(Project p1) {
		
		return 1;
	}
	
}
