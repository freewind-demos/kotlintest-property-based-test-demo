package example

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class HelloTest : StringSpec({

    "length should return the size of string" {
        hello("KotlinTest") shouldBe "Hello, KotlinTest!"
    }

})