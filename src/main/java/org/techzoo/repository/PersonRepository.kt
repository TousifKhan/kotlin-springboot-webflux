package org.techzoo.repository

import org.springframework.stereotype.Repository
import org.techzoo.model.Person

@Repository
class PersonRepository {
	
	private val entities = mutableListOf<Person>(
			Person("Tousif","Khan"),
			Person("Asif","Khan")
	)
	
	fun add(person: Person) = entities.add(person)
	fun getPerson(firstname: String):Person = entities.find { it.firstname == firstname } ?: Person("","")
	fun getAll() = entities.toList()
}