package uk.org.markbradley.hexarchdemo.rest.product

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import uk.org.markbradley.hexarchdemo.businesslogic.Product

@RestController
class CreateProductController {

    @Autowired
    lateinit var creator: ProductCreator

    @PostMapping("/product")
    fun createProduct(@RequestBody product: JsonProduct): String {
        val p = Product(product.ean, product.name, product.imageUrl, product.price)
        val out = creator.Create(p)
        val outJson = JsonProduct(out.ean, out.name, out.imageUrl, out.priceInPence)

        return "TODO create a product and return it: $outJson"
    }
}