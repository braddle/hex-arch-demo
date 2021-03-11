package uk.org.markbradley.hexarchdemo.businesslogic

import org.springframework.stereotype.Service
import uk.org.markbradley.hexarchdemo.rest.product.ProductCreator

@Service
class ProductCreationService(): ProductCreator {

   lateinit var persister: ProductPersister

    override fun Create(product: Product): Product {
        if (!product.isValid()) {
            throw ProductInvalidException("We dont like beans")
        }


        persister.save(product)

        return product
    }
}