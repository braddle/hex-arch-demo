package uk.org.markbradley.hexarchdemo.businesslogic

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import uk.org.markbradley.hexarchdemo.rest.product.ProductCreator
import uk.org.markbradley.hexarchdemo.rest.product.ProductFinder
import uk.org.markbradley.hexarchdemo.rest.product.ProductLister

@Service
class ProductListingService(): ProductLister {

    @Autowired
    lateinit var getter: ProductsGetter

    override fun ListProducts(): ArrayList<Product> {
        return getter.getAll()
    }
}