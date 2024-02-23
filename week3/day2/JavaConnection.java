package week3.day2;

public class JavaConnection extends MySqlConnection{

	@Override
	public void executeQuery() {
		// TODO Auto-generated method stub
		super.executeQuery();
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connect method from implement");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnect method from implement");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("ExecuteUpdate method from implement");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaConnection obj = new JavaConnection();
		obj.executeQuery();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
		
	}

}
