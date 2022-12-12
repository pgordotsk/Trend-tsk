package com.grupotsk.timeseries.repository;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.grupotsk.timeseries.model.Atributes;




public interface AtributesRepository extends JpaRepository<Atributes, Long> {
	
	List<Atributes> findBytagnameStartingWith(String string);
	
	
	default List<Atributes> find(String string){
		

		List<Atributes> val = new ArrayList<>();
		Atributes v = null;

			//cambiamos la dirección contra la que consultamos
		String connectionUrl =
				"jdbc:sqlserver://10.5.1.112:1433;"+ "database=HistoryClient;"
						+ "user=sa;"
						+ "password=Aeiou1234;";

		ResultSet resultSet = null;

		try (Connection connection = DriverManager.getConnection(connectionUrl);
				Statement statement = connection.createStatement();) {

			// Create and execute a SELECT SQL statement.
			
			String selectSql = "SELECT TagName"
					+ "  FROM [Runtime].[dbo].[Tag] where TagName like '"+ string +".%'";

			
			resultSet = statement.executeQuery(selectSql);
			
			// Print results from select statement
			while (resultSet.next()) {
				
				v = new Atributes(resultSet.getString(1));
				

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