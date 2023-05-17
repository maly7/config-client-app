package com.github.maly7.configapp.configapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConfigAppApplication

fun main(args: Array<String>) {
	runApplication<ConfigAppApplication>(*args)
}
