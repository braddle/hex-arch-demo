package uk.org.markbradley.hexarchdemo.rest.product

import uk.org.markbradley.hexarchdemo.businesslogic.Product

interface ProductCreator {
    fun Create(product: Product) : Product
}