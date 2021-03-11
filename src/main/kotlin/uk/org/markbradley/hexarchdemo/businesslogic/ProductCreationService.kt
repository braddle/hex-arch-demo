package uk.org.markbradley.hexarchdemo.businesslogic

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import uk.org.markbradley.hexarchdemo.psql.DatabaseBrokenExpection
import uk.org.markbradley.hexarchdemo.psql.DuplicatePrimaryKeyException
import uk.org.markbradley.hexarchdemo.rest.product.ProductCreator

@Service
class ProductCreationService(): ProductCreator {

    @Autowired
   lateinit var persister: ProductPersister

    override fun Create(product: Product): Product {
        if (!product.isValid()) {
            throw ProductInvalidException("We dont like beans")
        }

        try {
            persister.save(product)
        } catch (e: DatabaseBrokenExpection) {
            throw Exception("Error occurred saving product ${product.ean}")
        } catch (e: DuplicatePrimaryKeyException) {
            throw ProductInvalidException("Product with ean ${product.ean} already exists")
        }

        return product
    }
}