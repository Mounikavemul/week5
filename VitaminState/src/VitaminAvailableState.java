public class VitaminAvailableState implements State{

	@Override
	public void doAction(VitaminContext vitaminContext) {
		System.out.println("Vitamin Stock is available");
		vitaminContext.setState(this); 
	}
	
	public String toString()
	{
		return "Stock Available";
	}
}
