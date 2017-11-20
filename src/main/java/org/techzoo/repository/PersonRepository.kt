package org.techzoo.repository

import org.springframework.stereotype.Repository

@Repository
class PersonRepository {
	private val entities = mutableListOf<String>()
	fun add(name: String) = entities.add(name)
	fun get(name: String) = entities.find { it == name } ?: "person not found!"
	fun getAll() = listOf(entities)
}