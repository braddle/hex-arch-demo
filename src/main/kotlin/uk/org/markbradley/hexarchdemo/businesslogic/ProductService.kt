package uk.org.markbradley.hexarchdemo.businesslogic

import org.springframework.stereotype.Service
import uk.org.markbradley.hexarchdemo.rest.product.ProductCreator
import uk.org.markbradley.hexarchdemo.rest.product.ProductFinder
import uk.org.markbradley.hexarchdemo.rest.product.ProductLister

@Service
class ProductService(): ProductLister, ProductFinder {

    override fun findBy(ean: String): Product {
        return Product(ean, "Biscuits", "biscuits.gif", 99)
    }

    override fun ListProducts(): ArrayList<Product> {
        val a = ArrayList<Product>()
        a.add(Product("123456789", "Biscuits", "biscuits.gif", 99), )
        a.add(Product("123456789", "Biscuits", "biscuits.gif", 99),)

        return a
    }

}