package com.dmdev.oop.lesson19.person;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private int id;
    private String firstName;
    private String lastName;

    public Person(int id, String firstName, String lastName) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
    }

    public int getId() {
	return id;
    }

    public String getFirstName() {
	return firstName;
    }

    public String getLastName() {
	return lastName;

    }

    @Override
    public int hashCode() {
	return Objects.hash(firstName, id, lastName);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Person other = (Person) obj;
	return Objects.equals(firstName, other.firstName) && id == other.id && Objects.equals(lastName, other.lastName);

    }

    @Override
    public String toString() {
	return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    @Override
    public int compareTo(Person o) {
	return Integer.compare(id, o.id);
//      if (id == o.id) {
//      return 0;
//  } else if (id > o.id) {
//      return 1;
//  } else {
//      return -1;
    }
}
