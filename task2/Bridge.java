//Practical assignment 3
//Shared Bridge

class Bridge {
    int[] carsCrossed = new int[4];
	void cross(){
        System.out.println((Thread.currentThread().getName()) + " waiting to cross");

        boolean notFairAmount = true;
        while(notFairAmount){
            notFairAmount = false;
            for(int i = 0; i < 4; i++){
                if(i!= ((int)Thread.currentThread().getId()-11) && carsCrossed[i] < carsCrossed[(int)Thread.currentThread().getId()-11]){
                    notFairAmount = true;
                }
            }
        }

        synchronized(this){
            System.out.println((Thread.currentThread().getName()) + " crossing the bridge");
            try{
                Thread.currentThread().sleep((long)(Math.random() * 1000));
            } catch (Exception e) {
                //totally handling it
            }
            System.out.println((Thread.currentThread().getName()) + " exiting");
            carsCrossed[(int)Thread.currentThread().getId()-11]++;
            System.out.println("Crossed: " + carsCrossed[0] + " " + carsCrossed[1] + " " + carsCrossed[2] + " " + carsCrossed[3]);
        }
        
    }
}
