package org.techzoo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.SpringApplication


@SpringBootApplication
class KotlinWebfluxApplication 

fun main(args: Array<String>){
	SpringApplication.run(KotlinWebfluxApplication::class.java, *args)
}
