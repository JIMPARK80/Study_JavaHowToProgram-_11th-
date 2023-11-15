// Course: COMP228, Java Programming
// Title: Assignment4
// Name: Jinsung Park (301241866)

package Assignment;

import java.util.Stack;

public class Assignment4 {
	// method to transfer elements from one "initial" stack to another "transfer"
	public static void transfer(Stack<String> initial, Stack<String> transfer)
	// this line declares a method named 'transfer'. it takes two parameters
	{
		while (!initial.isEmpty()) // start while loop that continues as long as the 'initial' stack is not empty 
		{ 
			String data = initial.pop(); 
			transfer.push(data);
		}
	}
	// method to reverse the elements of stack
	public static void reverseStack(Stack<String> stack) {
		Stack<String> storeTransferStack = new Stack<>();
		Stack<String> storeStackT = new Stack<>();
		
		// transfer elements from the initial stack to storeTransferStack
		transfer(stack, storeTransferStack);
		
		// transfer elements from the storeTransferStack to storeStackT
		transfer(storeTransferStack, storeStackT);
		
		// transfer elements from the storeStackT to stack
		transfer(storeStackT, stack);
	}
	
	public static void main(String[] args) {
		Stack<String> transferStack = new Stack<>();
		
		// create stacks and push elements onto them
		transferStack.push("C");
		transferStack.push("A");
		transferStack.push("N");
		transferStack.push("A");
		transferStack.push("D");
		transferStack.push("A");
		
		// display the initial data on transferStack
		System.out.println("First Stored Stack: " + transferStack);
		
		// do reverseStack
		reverseStack(transferStack);
		
		// display the reverse and stored stack
		System.out.println("Reversed and Stored Stack: " + transferStack);
	}
}
