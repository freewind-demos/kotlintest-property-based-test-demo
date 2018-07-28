package example

import io.kotlintest.matchers.haveLength
import io.kotlintest.properties.assertAll
import io.kotlintest.should
import io.kotlintest.specs.StringSpec

class HelloTest : StringSpec({

    "length should return the size of string" {
        assertAll { a: String, b: String ->
            (a + b) should haveLength(a.length + b.length)
        }
    }

})