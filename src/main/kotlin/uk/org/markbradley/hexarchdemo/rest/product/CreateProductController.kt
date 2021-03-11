package uk.org.markbradley.hexarchdemo.rest.product

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import uk.org.markbradley.hexarchdemo.businesslogic.Product
import uk.org.markbradley.hexarchdemo.businesslogic.ProductInvalidException

@RestController
class CreateProductController {

    @Autowired
    lateinit var creator: ProductCreator

    @PostMapping("/product")
    fun createProduct(@RequestBody product: JsonProduct): String {
        val p = Product(product.ean, product.name, product.imageUrl, product.price)

        try {
            val out = creator.Create(p)
            val outJson = JsonProduct(out.ean, out.name, out.imageUrl, out.priceInPence)

            return "200: $outJson"
        } catch (e: ProductInvalidException) {
            return "400: ${e.message}"
        } catch (e: Exception) {
            return "500: ${e.message}"
        }
    }
}