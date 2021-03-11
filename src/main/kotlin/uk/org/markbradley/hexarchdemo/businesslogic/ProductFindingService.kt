package uk.org.markbradley.hexarchdemo.businesslogic

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import uk.org.markbradley.hexarchdemo.psql.NoRowException
import uk.org.markbradley.hexarchdemo.rest.product.ProductFinder

@Service
class ProductFindingService(): ProductFinder {

    @Autowired
    lateinit var retriever: ProductRetriever

    override fun findBy(ean: String): Product {
        try {
            return retriever.RetrieveBy(ean)
        } catch (e: NoRowException) {
            throw ProductNotFoundException("Could not find product with EAN $ean")
        }
    }
}