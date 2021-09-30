
public class VitaminSoldOutState implements State{

	@Override
	public void doAction(VitaminContext vitaminContext)
	{
		System.out.println("Vitamin Stock not available");
		vitaminContext.setState(this);

	}
	
	public String toString()
	{
		return "Stock not available";
	}

}