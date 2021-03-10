package uk.org.markbradley.hexarchdemo.rest.product

import uk.org.markbradley.hexarchdemo.businesslogic.Product

interface ProductLister {
    fun ListProducts(): ArrayList<Product>
}