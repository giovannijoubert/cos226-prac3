//Practical assignment 3
//Four Lanes access a single shared Bridge

class Simulator {
	public static void main (String args[]) {
		Bridge B = new Bridge();
		//4 Lanes
		Lane l1 = new Lane(B);
		l1.start();
		 
		Lane l2 = new Lane(B);
		l2.start();

		Lane l3 = new Lane(B);
		l3.start();

		Lane l4 = new Lane(B);
		l4.start();


		
	}
}