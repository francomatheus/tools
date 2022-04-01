package br.com.training.tracing.appa

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}

@RestController
@RequestMapping("/app-a")
class ExampleController{

	val logger = LoggerFactory.getLogger(javaClass)

	@GetMapping()
	fun example(): String {
		logger.info("message=Teste com Zipkin e Sleuth")

		return "Testando"
	}
}
