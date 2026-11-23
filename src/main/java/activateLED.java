import swiftbot.SwiftBotAPI;
public class activateLED {

	public static void main(String[] args) {

		colorList Blue = new colorList();
        Blue.colorBlue();	

        SwiftBotAPI.INSTANCE.fillUnderlights(Blue);   

        
		
	}

}
