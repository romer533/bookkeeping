package ru.bookkeeping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bookkeeping.domain.Person;

import java.util.ArrayList;
import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    List<Person> persons = new ArrayList<>();
}
