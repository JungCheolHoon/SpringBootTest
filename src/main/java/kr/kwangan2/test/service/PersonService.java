package kr.kwangan2.test.service;

import java.util.List;

import kr.kwangan2.test.domain.Person;

public interface PersonService {
	public String hello(String name);
	public Person getPerson();
	public List<Person> getPersonList();
}
