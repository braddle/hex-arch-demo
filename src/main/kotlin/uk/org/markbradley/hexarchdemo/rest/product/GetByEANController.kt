package uk.org.markbradley.hexarchdemo.rest.product

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class GetByEANController {

    @Autowired
    lateinit var finder: ProductFinder

    @GetMapping("/product/{ean}")
    fun getProductByEAN(@PathVariable ean: String): String {
        val p = finder.findBy(ean)
        val jsonProduct = JsonProduct(p.ean, p.name, p.imageUrl, p.priceInPence)
        return "TODO return product with EAN: $ean $jsonProduct"
    }
}