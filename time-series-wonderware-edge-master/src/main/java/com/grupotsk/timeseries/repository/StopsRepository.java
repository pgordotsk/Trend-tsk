package com.grupotsk.timeseries.repository;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.grupotsk.timeseries.model.Stops;



public interface StopsRepository extends JpaRepository<Stops, Long> {




	default List<Stops> find(String string){


		List<Stops> val = new ArrayList<>();
		Stops v = null;

		//cambiamos la dirección contra la que consultamos
		String connectionUrl =
				"jdbc:sqlserver://10.5.1.112:1433;"+ "database=HistorianClient;"
						+ "user=sa;"
						+ "password=Aeiou1234;";

		ResultSet resultSet = null;

		try (Connection connection = DriverManager.getConnection(connectionUrl);
				Statement statement = connection.createStatement();) {

			// Create and execute a SELECT SQL statement.

			//String selectSql = "Select * from dbo.CPMMAQUI  left join dbo.VSTPS_MOTIVINCID  on CPMMAQUI.CodMaqui = VSTPS_MOTIVINCID.CodMaqui"
			//	+ "where CPMMAQUI.VARPLC_ESTADO  = '"+string+"'";

			String selectSql = "Select VSTPS_MOTIVINCID.CodMaqui, VSTPS_MOTIVINCID.DesIncid, VSTPS_MOTIVINCID.CodIncid, "
					+ "VSTPS_MOTIVINCID.DesIncGr, VSTPS_MOTIVINCID.CodIncGr, VSTPS_MOTIVINCID.NUMORDERN, VSTPS_MOTIVINCID.CodMqZona, "
					+ "VSTPS_MOTIVINCID.DesMqZona, VSTPS_MOTIVINCID.CodTipIn from CPMMAQUI, VSTPS_MOTIVINCID where CPMMAQUI.CodMaqui = VSTPS_MOTIVINCID.CodMaqui and CPMMAQUI.VARPLC_ESTADO = '"+ string  +"'"; 


			resultSet = statement.executeQuery(selectSql);

			// Print results from select statement
			while (resultSet.next()) {

				v = new Stops(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6), resultSet.getString(7), resultSet.getString(8),resultSet.getString(9));


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