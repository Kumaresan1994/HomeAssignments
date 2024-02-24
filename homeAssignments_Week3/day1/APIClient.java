package homeAssignments_Week3.day1;

public class APIClient {
	public void sendRequest(String endPoint) {
			
			System.out.println("Sendrequest "+endPoint);
			}
		
		public void sendRequest(String endPoint,String requestBody,Boolean requestStatus) {
			
			System.out.println("Sendrequest "+endPoint+" : "+requestBody+" : "+requestStatus);
			}
		
		public static void main(String[] args) {
			APIClient client = new APIClient();
			client.sendRequest("https://platform.testleaf.com/#/");
			
			client.sendRequest("https://platform.testleaf.com/#/", "Userlist", true);
		}

	}


