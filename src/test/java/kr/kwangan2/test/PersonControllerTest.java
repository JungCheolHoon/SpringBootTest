package kr.kwangan2.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
public class PersonControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
//	@Test
//	public void testHello() {
//		try {
//			mockMvc.perform(get("/hello").param("name","홍길동"))
//			.andExpect(status().isOk())
//			.andExpect(content().string("Hello : 홍길동"))
//			.andDo(print());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	@Test
//	public void testGetPerson() throws Exception{
//		mockMvc.perform(get("/getPerson").param("name", "Hong Gil Dong").param("age", "20"))
//		.andExpect(status().isOk())
//		.andExpect(content().string("{\"name\":\"Hong Gil Dong\",\"age\":20}"))
//		.andDo(print());
//	}
	
	@Test
	public void testGetPersonList() throws Exception{
		mockMvc.perform(get("/getPersonList").param("name", "Hong Gil Dong").param("age", "20")
				.param("name", "Kang Gil Dong").param("age", "21"))
		.andExpect(status().isOk())
		.andExpect(content().string("[{\"name\":\"Hong Gil Dong\",\"age\":20},{\"name\":\"Kang Gil Dong\",\"age\":21}]"))
		.andDo(print());
	}

}
