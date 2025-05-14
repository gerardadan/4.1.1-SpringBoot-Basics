package cat.itacademy.s04.t01.n01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class S04T01N01ApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void greetWithoutNameShouldReturnDefaultMessage() {
		String url = "http://localhost:" + port + "/HelloWorld2";
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

		assertThat(response.getBody())
				.isEqualTo("Hello, . You are executing Maven project with method /HelloWorld2");
	}

	@Test
	void greetWithNameShouldReturnPersonalizedMessage() {
		String url = "http://localhost:" + port + "/HelloWorld2?name=Gerard";
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

		assertThat(response.getBody())
				.isEqualTo("Hello, Gerard. You are executing Maven project with method /HelloWorld2");
	}

	@Test
	void greet2WithoutNameShouldReturnDefaultMessage() {
		String url = "http://localhost:" + port + "/HelloWorld2/myname";
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

		assertThat(response.getBody())
				.isEqualTo("Hello, . You are executing Maven project with method /HelloWorld2/myname");
	}

	@Test
	void greet2WithNameShouldReturnPersonalizedMessage() {
		String url = "http://localhost:" + port + "/HelloWorld2/myname?name=Gerard";
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

		assertThat(response.getBody())
				.isEqualTo("Hello, Gerard. You are executing Maven project with method /HelloWorld2/myname");
	}
}
