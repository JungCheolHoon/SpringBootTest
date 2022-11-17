package kr.kwangan2.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class PersonControllerTest2 {
	@Autowired
	private MockMvc mockMvc;
	
//	@Test
//	public void getViewName1() throws Exception {
//		mockMvc.perform(get("/getViewName1"))
//		.andExpect(view().name("testView"));
//
//	}
//	@Test
//	public void getViewName2() throws Exception {
//		mockMvc.perform(get("/getViewName2"))
//		.andExpect(view().name("/getViewName2"));
//	}
//	@Test
//	public void getViewName3() throws Exception {
//		mockMvc.perform(get("/getViewName3"))
//		.andExpect(view().name("/getViewName3"));
//	}
	
//	@Test
//	public void getRedirectURL() throws Exception {
//		mockMvc.perform(get("/getRedirectURL"))
//		.andExpect(redirectedUrl("/"));
//	}
	
	@Test
	public void getModel() throws Exception {
		mockMvc.perform(get("/getModel"))
		.andExpect(model().attributeExists("name"));
	}


}