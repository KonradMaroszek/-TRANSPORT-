package Database;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;

public class FetchLogins implements Callable<ArrayList<Map<String, Object>>> 
{

	@Override
	public ArrayList<Map<String, Object>> call() throws Exception {
		// TODO Auto-generated method stub
		String sql = "Select * from adres";
		ArrayList<Map<String, Object>> query = DatabaseConnection.fetch_query_from_database(sql);
		return query;
		
	}
	
}
