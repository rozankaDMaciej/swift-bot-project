import swiftbot.SwiftBotAPI;

public class TEST {

	public static void main(String[] args) {
		   try {
			   
			   for (int i = 3; i >= 1; i--) {
				   System.out.println(i);
				   Thread.sleep(1000);
			   }
			   Thread.sleep(1000);
			   System.out.println("GO!");
			   
			   // move forward for 1000ms (1s)
	           SwiftBotAPI.INSTANCE.move(100,100,1000);
	           
	           
	           
	           // set underlights to purple
	           int[] colour = {158, 52, 235};
	           SwiftBotAPI.INSTANCE.fillUnderlights(colour);   
	           
	           // wait 3000ms (3s)
	           Thread.sleep(3000);
	           
	           // disable underlights
	           SwiftBotAPI.INSTANCE.disableUnderlights();
	       } catch (Exception e) {
	           e.printStackTrace();
	       }
		   
		   
		   
		   
		   
	}

}
