package com.grupotsk.timeseries;

import java.time.Duration;

import org.junit.Rule;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.testcontainers.containers.MSSQLServerContainer;
import org.testcontainers.containers.startupcheck.MinimumDurationRunningStartupCheckStrategy;

public class TestEnvironment implements BeforeAllCallback, ExtensionContext.Store.CloseableResource {

	@Rule
	//public MSSQLServerContainer mssqlserver = (MSSQLServerContainer) new MSSQLServerContainer().withInitScript("ScriptBBDD_Pruebas.sql").withExposedPorts(1433)
		
	//public MSSQLServerContainer mssqlserver = (MSSQLServerContainer) new MSSQLServerContainer<>("mcr.microsoft.com/mssql/server:2017-latest")
	//.withUsername("sa").withPassword("Aeiou1234")
//			.withInitScript("ScriptBBDD_Pruebas.sql")
//		      .withStartupCheckStrategy(new MinimumDurationRunningStartupCheckStrategy(Duration.ofSeconds(5)));//.withExposedPorts(1433);
			//.waitingFor(new CassandraQueryWaitStrategy());
			//.withImagePullPolicy(PullPolicy.defaultPolicy());;;

	@Override
	public void close() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeAll(ExtensionContext context) throws Exception {
		// TODO Auto-generated method stub
	//	System.out.println(mssqlserver.getUsername());
		//System.out.println(mssqlserver.getPassword());
	//	System.out.println(mssqlserver.getFirstMappedPort() + mssqlserver.getHost());
		//System.out.println(mssqlserver.getJdbcUrl()+"--");
		
		//mssqlserver.start();
		
	//	System.out.println(mssqlserver.getPassword());
	//	System.out.println(mssqlserver.getFirstMappedPort() + mssqlserver.getHost());
		
	
		
//		System.setProperty("db_url", "jdbc:sqlserver://"+mssqlserver.getHost()+":"+mssqlserver.getFirstMappedPort()+";databaseName=Prueba");
//		System.setProperty("db_username", mssqlserver.getUsername());
//		System.setProperty("db_password", mssqlserver.getPassword());
		


		
	}

}
