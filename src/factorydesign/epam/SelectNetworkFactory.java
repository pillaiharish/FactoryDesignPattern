package factorydesign.epam;

public class SelectNetworkFactory{
	public CellularPlan getPlan(String planType){
		if(planType==null){
			return null;
		}
		if(planType.equalsIgnoreCase("ABCNetwork")){
			return new ABCNetwork();
		}
		else if(planType.equalsIgnoreCase("XYZNetwork")){
			return new XYZNetwork();
		}
		else if(planType.equalsIgnoreCase("PQRNetwork")){
			return new PQRNetwork();
		}
	return null;
	}
}
