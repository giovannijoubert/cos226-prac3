//Practical assignment 3
//Lane being simulator by thread

class Lane extends Thread {
    Bridge b;
    Lane(Bridge Br){
        b = Br;
    }
	public void run() {
		for (int i = 0; i < 3; i++) { //3 cars
		try {
            
            sleep((long)(Math.random() * 1000));
            b.cross();
            sleep((long)(Math.random() * 2000));
		} catch (Exception e) {
			//totally handling it
		}
		
		}
	}
}