package com.grupotsk.timeseries.repository;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.grupotsk.timeseries.model.Values;



public interface ValuesRepository extends JpaRepository<Values, Long> {


	List<Values> findByTagnameAndDatetimeBetween(String string,String dateI, String dateF);

	default List<Values> find(String string,String dateI, String dateF,String retrieval,Integer resolution){
		

		List<Values> val = new ArrayList<>();
		Values v = null;

		//cambiamos la dirección contra la que consultamos
		String connectionUrl =
				"jdbc:sqlserver://172.17.0.94:1433;"+ "database=HistorianClient;"
						+ "user=sa;"
						+ "password=Aeiou1234;";

		ResultSet resultSet = null;

		try (Connection connection = DriverManager.getConnection(connectionUrl);
				Statement statement = connection.createStatement();) {

			// Create and execute a SELECT SQL statement.
			
			String selectSql = "SELECT TagName, Value, DateTime, wwRetrievalMode, wwResolution, StateTime, vValue"
					+ "  FROM [Runtime].[dbo].[History] where TagName like '"+ string +"' and (DateTime >= '"+ dateI +"' and DateTime <= '"+ dateF +"')"
							+ "and wwRetrievalMode = '"+retrieval+"'"
									+ "AND wwResolution = "+resolution+"\n"
					+ "";

			
			resultSet = statement.executeQuery(selectSql);
			
			// Print results from select statement
			while (resultSet.next()) {
				
				v = new Values(resultSet.getString(1),resultSet.getFloat(2),resultSet.getString(3),
						resultSet.getString(4),resultSet.getInt(5),resultSet.getInt(6),resultSet.getString(7));
				

				val.add(v);
			}
			
			connection.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	
		return val;

	}

}
