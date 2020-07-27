
public class ProjectSortedArrayBag {
	private int numProjects;
	private Project[] projects;
	
	public ProjectSortedArrayBag(int capacity) {
		this.projects = new Project[capacity];
		numProjects = 0;
	}
	
	public void add(String name, int amount) {
		Project p1 = new Project(name, amount);
		projects[numProjects] = p1;
		numProjects++;
		System.out.println(p1.toString()); //delete this for final
	}
	public int indexOf(Project p1) {
		int index = 0;
		for (int i = 0; i < numProjects; i++) {
			index++;
			if (projects[i].toString().equals(p1.toString())) {
				System.out.println("found it");
			}
		}
		return index;
	}
	
	public boolean remove(Project p1) {

		boolean found = false;
		p1.toString();

		for (int i = 0; i < numProjects; i++) {
			System.out.println(projects[i].toString());
			if (projects[i].toString().equals(p1.toString())) {
				System.out.println("found it");
			}
			//proceed to remove
		}
//			if (projects[i] == p1) {
//				projects[i] = projects[numProjects - 1];
//				this.numProjects--;
//				found = true;
//				System.out.println("found it!");
//				break;
//			}

		return found;
	}

}
