package uk.org.markbradley.hexarchdemo.rest.product

import uk.org.markbradley.hexarchdemo.businesslogic.Product

interface ProductFinder {
    fun findBy(ean: String): Product
}