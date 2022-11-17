package kr.kwangan2.test;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import kr.kwangan2.test.domain.Person;
import kr.kwangan2.test.service.LoggingRunner;
import kr.kwangan2.test.service.PersonService;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class PersonControllerTest4 {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private PersonService personService;
	
//	@Test
//	public void testHello() throws Exception {
//		
//		when(personService.hello("둘리")).thenReturn("Hello : 둘리");
//		
//		mockMvc.perform(get("/hello").param("name", "둘리"))
//		.andExpect(status().isOk())
//		.andExpect(content().string("Hello : 둘리"))
//		.andDo(print());
//	}

//	@Test
//	public void testHello2() throws Exception {
//		
//		Person person = new Person("hong",20);
//		
//		when(personService.getPerson()).thenReturn(person);
//		
//		mockMvc.perform(get("/getPerson"))
//		.andExpect(status().isOk())
//		.andExpect(content().string("{\"name\":\"hong\",\"age\":20}"))
//		.andDo(print());
//	}
	@Test
	public void testHello2() throws Exception {

		Person person1 = new Person("Hong",20);
		Person person2 = new Person("Aong",21);
		List<Person> list= new ArrayList<Person>();
		list.add(person1);
		list.add(person2);
		
		when(personService.getPersonList()).thenReturn(list);
		
		mockMvc.perform(get("/getPersonList"))
		.andExpect(status().isOk())
		.andExpect(content().string("[{\"name\":\"Hong\",\"age\":20},{\"name\":\"Aong\",\"age\":21}]"))
		.andDo(print());
	}
	
//	@Test
//	public void logging() throws Exception {
//		logging.run(null);
//	}
	
}