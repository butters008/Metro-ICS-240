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
	
	
	
}
