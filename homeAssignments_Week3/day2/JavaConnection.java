package homeAssignments_Week3.day2;

public class JavaConnection implements DataBaseConnecton{
	@Override
	public void connect() {
		System.out.println("Connect from databaseconnection interfacec");
		
	}

	@Override
	public void disconnect() {
		System.out.println("disConnect from databaseconnection interfacec");
	}

	@Override
	public void executeupdate() {
		System.out.println("Executeupdate from databaseconnection interfacec");
		
	}
	public static void main(String[] args) {
		JavaConnection interfaceconnect = new JavaConnection();
		interfaceconnect.connect();
		interfaceconnect.disconnect();
		interfaceconnect.executeupdate();
	}


}
