package org.techzoo.repository

import org.springframework.stereotype.Component
import org.springframework.beans.factory.annotation.Autowired
import reactor.core.publisher.Mono

import org.techzoo.model.Person
import reactor.core.publisher.Flux

@Component
class PersonReactiveRepository {
	
	@Autowired
	lateinit var repo: PersonRepository
	
	fun getPerson(firstname: String): Mono<Person> = Mono.just(repo.getPerson(firstname))
	
	fun getAllPersons(): Flux<Person> =  Flux.fromIterable(repo.getAll())

	//fun addPerson(person: Person): Mono<Person> = repo.add(person)
	
}