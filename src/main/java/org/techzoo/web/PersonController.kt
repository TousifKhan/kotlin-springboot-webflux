package org.techzoo.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.techzoo.model.Person
import org.techzoo.repository.PersonRepository

@RestController
@RequestMapping("/api/v1")
class PersonController(private val repository: PersonRepository) {

	@GetMapping("/")
	fun findAll() = repository.getAll()

	@GetMapping("/{firstname}")
	fun findPerson(@PathVariable firstname: String) = repository.get(firstname)
	
	@PutMapping("/person")
	fun addPerson(@RequestBody person: Person) = repository.add(person)
	
}