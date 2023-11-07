package blankproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BlankProjectApplication

fun main(args: Array<String>) {
    runApplication<BlankProjectApplication>(*args)
}
