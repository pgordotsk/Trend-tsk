package com.grupotsk.timeseries.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.grupotsk.timeseries.TestEnvironment;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ComponentScan({ "com.grupotsk.timeseries.respository" })
@TestPropertySource(locations = "classpath:application-test.properties")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestEnvironment.class)
public class PruebasTest {

	@LocalServerPort
	private int randomServerPort;
	private WebTestClient webTestClient;
	private String baseUri;

//	@Test
//	void post_resource() {
//
//	}
//
//	@BeforeEach
//	void setUp() throws Exception {
//		baseUri = "http://localhost:" + randomServerPort;
//		webTestClient = WebTestClient.bindToServer().baseUrl(baseUri).build();
//	}
//
//	@Test
//	void get_physicalModel() {
//		ArrayList<?> result = this.webTestClient.get().uri("physicalmodel?id=555").exchange().expectStatus().isOk()
//				.expectBody(new ArrayList<String>().getClass()).returnResult().getResponseBody();
//		System.out.println("Size model: "+result.size());
//		assertEquals(1, result.size());
//	}
//
//	@Test
//	void get_atri() { 
//		ArrayList<?> result = this.webTestClient.get().uri("atributes?name=Value").exchange().expectStatus().isOk().expectBody(new ArrayList<String>().getClass()).returnResult().getResponseBody();
//		System.out.println("Size atri: "+result.size());
//		assertEquals(0, result.size());
//	}

	/*
	 * @Test void get_values() { ArrayList<?> result = this.webTestClient.get().
	 * uri("values?name=CombinerBox__001.VoltajeDC1&dateI=2022-05-09 09:10:00.0000000&dateF=2022-05-09 09:11:30.0000000"
	 * ).exchange() .expectStatus().isOk().expectBody(new
	 * ArrayList<String>().getClass()).returnResult().getResponseBody();
	 * System.out.println("Size values: "+result.size());
	 * System.out.println(result); assertEquals(10, result.size());
	 * 
	 * }
	 */
	
}
