package com.codewithrutu.student;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class StudentRepositoryTest {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private StudentRepository repository;

	@Test
	public void testFindByName() {

		entityManager.persist(new Student("Jeet"));

		List<Student> students = repository.findByName("Jeet");
		assertEquals(1, students.size());

		assertThat(students).extracting(Student::getName).containsOnly("Jeet");

	}

}
