
// BULLY ALGORITHM MAIN FILE
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Prompt one to enter no of processes
		System.out.println("Hey, please enter the amount of processes to start:");
		//store no of processes
		int processes = in.nextInt();
		//Create an array of threads for processes
		MyThread[] t = new MyThread[processes];

		for (int i = 0; i < processes; i++)
			//Create object of class Mythread
			t[i] = new MyThread(new Process(i+1), processes);
		
		
		Election.initialElection(t);

		for (int i = 0; i < processes; i++)
			new Thread(t[i]).start();
	}
}
