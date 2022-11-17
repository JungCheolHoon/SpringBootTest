package kr.kwangan2.test.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kr.kwangan2.test.domain.Person;
import kr.kwangan2.test.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Override
	public String hello(String name) {
		return "Hello : " + name;
	}

	@Override
	public Person getPerson() {
		Person person = new Person();
		person.setName("Hong");
		person.setAge(20);
		return person;
	}

	@Override
	public List<Person> getPersonList() {
		List<Person> list = new ArrayList<Person>();
		Person person1 = new Person("Hong",20);
		Person person2 = new Person("Aong",21);
		list.add(person1);
		list.add(person2);
		return list;
	}

}
