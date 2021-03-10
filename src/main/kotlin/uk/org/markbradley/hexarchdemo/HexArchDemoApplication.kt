package uk.org.markbradley.hexarchdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HexArchDemoApplication

fun main(args: Array<String>) {
    runApplication<HexArchDemoApplication>(*args)
}
