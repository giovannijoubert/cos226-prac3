//Practical assignment 3
//Shared Bridge

class Bridge {
  //  int[] carsCrossed = new int[4];
	void cross(){
        System.out.println((Thread.currentThread().getName()) + " waiting to cross");
        synchronized(this){
            System.out.println((Thread.currentThread().getName()) + " crossing the bridge");
            try{
               Thread.currentThread().sleep((long)(Math.random() * 1000));
            } catch (Exception e) {
                //totally handling it
            }
            System.out.println((Thread.currentThread().getName()) + " exiting");
           // carsCrossed[(int)Thread.currentThread().getId()-11]++;
            //System.out.println("Crossed: " + carsCrossed[0] + " " + carsCrossed[1] + " " + carsCrossed[2] + " " + carsCrossed[3]);
        }
        
    }
}