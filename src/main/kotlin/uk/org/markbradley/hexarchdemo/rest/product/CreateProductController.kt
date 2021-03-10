package uk.org.markbradley.hexarchdemo.rest.product

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CreateProductController {
    @PostMapping("/product")
    fun createProduct(@RequestBody product: JsonProduct): String {
        return "TODO create a product and return it: $product"
    }
}