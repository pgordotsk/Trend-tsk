package com.grupotsk.timeseries.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.grupotsk.timeseries.model.NewStop;

@RestController

public interface NewStopRespository extends JpaRepository<NewStop, Long> {



	default  boolean insert(String tagname,String dateTime,String codParada,String fechaProd,String codMaqui,String desMaqui,String codTurno,String fechaIni,
			String fechaFin,String motivo,String desMotivo,String minutosPriParada, String motivoSegPar) {
		//cambiamos la dirección contra la que consultamos
		String connectionUrl =
				"jdbc:sqlserver://172.17.0.94:1433;"+ "database=HistorianClient;"
						+ "user=sa;"
						+ "password=Aeiou1234;";

		try (Connection connection = DriverManager.getConnection(connectionUrl);
				Statement statement = connection.createStatement();) {

			// Create and execute an insert SQL statement.
			String selectSql = "INSERT INTO [dbo].[Stop]\n"
					+ "           ([tag_name]\n"
					+ "           ,[date_time]\n"
					+ "           ,[cod_parada]\n"
					+ "           ,[fecha_prod]\n"
					+ "           ,[cod_maqui]\n"
					+ "           ,[des_maqui]\n"
					+ "           ,[cod_turno]\n"
					+ "           ,[fecha_ini]\n"
					+ "           ,[fecha_fin]\n"
					+ "           ,[motivo]\n"
					+ "           ,[des_motivo]\n"
					+ "			  ,[minutos_parada_primera]\n"
					+ "           ,[motivo_parada_segunda])\n"
					+ "     VALUES\n"
					+ "          ( '"+tagname+"',\n"
					+ "           '"+dateTime+"',\n"
					+ "           '"+codParada+"',\n"
					+ "           '"+fechaProd+"',\n"
					+ "           '"+codMaqui+"',\n"
					+ "		   	  '"+desMaqui+"',\n"
					+ "           '"+codTurno+"',\n"
					+ "           '"+fechaIni+"',\n"
					+ "           '"+fechaFin+"',\n"
					+ "           '"+motivo+"',\n"
					+ "           '"+desMotivo+"',\n"
					+ "           '"+minutosPriParada+"',\n"
					+ "   '"+motivoSegPar+"')\n"
					+ "";


			statement.executeQuery(selectSql);


			connection.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}


		return true;
	}

	default List<NewStop> viewStops(String name, String date){

		List<NewStop> val = new ArrayList<>();
		NewStop v = null;

		//cambiamos la dirección contra la que consultamos
		String connectionUrl =
				"jdbc:sqlserver://172.17.0.94:1433;"+ "database=HistorianClient;"
						+ "user=sa;"
						+ "password=Aeiou1234;";

		ResultSet resultSet = null;

		try (Connection connection = DriverManager.getConnection(connectionUrl);
				Statement statement = connection.createStatement();) {

			// Create and execute a SELECT SQL statement.

			String selectSql = "Select * from dbo.Stop  where (tag_name like '"+name+"' AND date_time like '"+date+"')";
				

		

			resultSet = statement.executeQuery(selectSql);

			// Print results from select statement
			while (resultSet.next()) {

				v = new NewStop(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),
						resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),
						resultSet.getString(7),resultSet.getString(8),resultSet.getString(9),
						resultSet.getString(10),resultSet.getString(11),resultSet.getString(12), resultSet.getString(13),resultSet.getString(14));


				val.add(v);
			}

			connection.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

		return val;

	}


	
	default  boolean insert2(String tagname,String dateTime,String codParada,String fechaProd,String codMaqui,String desMaqui,String codTurno,String fechaIni,
			String fechaFin,String motivo,String desMotivo,String minutosPriParada, String motivoSegPar, String tiempoParada){

		
		//cambiamos la dirección contra la que consultamos
		String connectionUrl =
				"jdbc:sqlserver://172.17.0.94:1433;"+ "database=HistorianClient;"
						+ "user=sa;"
						+ "password=Aeiou1234;";

		try (Connection connection = DriverManager.getConnection(connectionUrl);
				Statement statement = connection.createStatement();) {

			// Create and execute a SELECT SQL statement.

			String selectSql = "If exists (Select tag_name, date_time from dbo.Stop where tag_name like '"+tagname+"' and date_time like '"+dateTime+"')\n"
					+ "	begin \n"
					+ "		update dbo.Stop set\n"
					+ "		cod_parada = '"+codParada+"',\n"
					+ "		fecha_prod = '"+fechaProd+"',\n"
					+ "		cod_maqui = '"+codMaqui+"',\n"
					+ "		des_maqui = '"+desMaqui+"',\n"
					+ "		cod_turno = '"+codTurno+"',\n"
					+ "		fecha_ini = '"+fechaIni+"',\n"
					+ "		fecha_fin = '"+fechaFin+"',\n"
					+ "		motivo = '"+motivo+"',\n"
					+ "		des_motivo = '"+desMotivo+"',\n"
					+ "		minutos_parada_primera = '"+minutosPriParada+"',\n"
					+ "		motivo_parada_segunda = '"+motivoSegPar+"',\n"
					+ "     tiempo_parada = '"+tiempoParada+"'\n"
					+ "		where tag_name like '"+tagname+"' and date_time like '"+dateTime+"'\n"
					+ "	end\n"
					+ "else\n"
					+ "	begin\n"
					+ "		INSERT INTO dbo.Stop\n"
					+ "           ([tag_name]\n"
					+ "           ,[date_time]\n"
					+ "           ,[cod_parada]\n"
					+ "           ,[fecha_prod]\n"
					+ "           ,[cod_maqui]\n"
					+ "           ,[des_maqui]\n"
					+ "           ,[cod_turno]\n"
					+ "           ,[fecha_ini]\n"
					+ "           ,[fecha_fin]\n"
					+ "           ,[motivo]\n"
					+ "           ,[des_motivo]\n"
					+ "           ,[minutos_parada_primera]\n"
					+ "           ,[motivo_parada_segunda]\n"
					+ "			  ,[tiempo_parada])\n"
					+ "     VALUES\n"
					+ "          ( '"+tagname+"',\n"
					+ "           '"+dateTime+"',\n"
					+ "           '"+codParada+"',\n"
					+ "           '"+fechaProd+"',\n"
					+ "           '"+codMaqui+"',\n"
					+ "		   	  '"+desMaqui+"',\n"
					+ "           '"+codTurno+"',\n"
					+ "           '"+fechaIni+"',\n"
					+ "           '"+fechaFin+"',\n"
					+ "           '"+motivo+"',\n"
					+ "           '"+desMotivo+"',\n"
					+ "           '"+minutosPriParada+"',\n"
					+ "           '"+motivoSegPar+"',\n"
					+ "           '"+tiempoParada+"')\n"
					+ "end";
				

		

			statement.executeQuery(selectSql);

			
			

			connection.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

		return true;

	}





}










