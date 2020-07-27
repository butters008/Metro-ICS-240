import java.util.Stack;

//This is for lecture 5 and driver is code that I wrote for exercise
//Rest of code was pre-written
public class driver {
	
	public static Integer returnMiddle(Stack<Integer> s1) {
		int count = 5;
		Integer middle = null;
		count = count / 2;
		
		while(!s1.isEmpty()) {
			if(count == 3) {
				middle = s1.peek();
				System.out.println(middle);
			}
		}
		
		return middle;
	}
	public static void main(String[] args) {
		/*
		 * Answering the first question: Reverse. It should take a stack and return it
		 * with all of the items reversed. You may create a temporary stack in the
		 * method to help make this process easier
		 */
		
		Stack<Integer> s1 = new Stack();
		Stack<Integer> tempStack = new Stack();
		
		Stack<Integer> middleStack = new Stack();
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		
		System.out.println(((driver) middleStack).returnMiddle(s1));
		
		System.out.println("Oringal Stack Order:\n" + s1 + "\n");
		
		while(!s1.isEmpty()) {
			tempStack.push(s1.pop());
		}
		
		System.out.println("REVERSED Stack Order:\n" + tempStack + "\n");
		s1 = tempStack; //Assigning original stack with no values to temp stack with all of it's values
		System.out.println("s1 is equal to tempStack: \n" + s1 + "\n");
		System.out.println("size of s1: " + s1.size() + "\n");
		
		/*
		 * We are answering the second question: empty. This method should empty the
		 * stack. What’s the easiest way to do this
		 */		
		
		Stack<Integer> s2 = new Stack();
		
		s2.push(10);
		s2.push(20);
		s2.push(30);
		s2.push(40);
		s2.push(50);
		
		System.out.println("Here is the stack s2: " + s2);
		s2.clear();//easiest way to clear it all out
		System.out.println("Here is stack s2 emptied out: " + s2);
	}

}
