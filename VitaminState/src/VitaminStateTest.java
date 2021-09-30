
public class VitaminStateTest {

	public static void main(String[] args) {
		VitaminContext vc=new VitaminContext();
		VitaminAvailableState astate = new VitaminAvailableState();
		astate.doAction(vc);
		System.out.println(vc.getState().toString());
		
		VitaminSoldOutState sSold = new VitaminSoldOutState();
		sSold.doAction(vc);
		System.out.println(vc.getState().toString());
	}
}
