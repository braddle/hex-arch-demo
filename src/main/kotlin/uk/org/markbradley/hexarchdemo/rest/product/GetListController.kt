package uk.org.markbradley.hexarchdemo.rest.product

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GetListController {

    @Autowired
    lateinit var lister: ProductLister

    @GetMapping("/product")
    fun getProducts(): String {
        val p = lister.ListProducts()
        return "TODO return a list of products $p"
    }
}