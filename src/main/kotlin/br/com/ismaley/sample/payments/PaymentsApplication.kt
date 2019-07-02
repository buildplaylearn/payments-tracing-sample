package br.com.ismaley.sample.payments

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EntityScan("br.com.ismaley.sample.payments.model")
@EnableJpaRepositories("br.com.ismaley.sample.payments.repository")
@SpringBootApplication
class PaymentsApplication

fun main(args: Array<String>) {
	SpringApplication.run(PaymentsApplication::class.java, *args)
}
