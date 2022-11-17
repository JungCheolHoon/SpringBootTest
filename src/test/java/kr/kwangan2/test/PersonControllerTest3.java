package kr.kwangan2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import kr.kwangan2.test.domain.Person;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@Log4j2
public class PersonControllerTest3 {
	
	@Autowired
	private TestRestTemplate restTemplate;

//	@Test
//	public void testHello() throws Exception {
//		String result = restTemplate.getForObject("/hello?name=둘리", String.class);
//		assertEquals("Hello : 둘리", result);
//	}

	@Test
	public void testGetPerson() throws Exception{
		Person person = restTemplate.getForObject("/getPerson?name=홍길동&age=20", Person.class);
		
		Person person2 = new Person();
		person2.setAge(10);
		person2.setName("홍길동");
		log.info("@@1@@=>"+person.hashCode());
		log.info("@@2@@=>"+person2.hashCode());
		assertEquals(person2, person);
	}
	
}