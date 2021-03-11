package uk.org.markbradley.hexarchdemo.businesslogic

interface ProductsGetter {
    fun getAll(): ArrayList<Product>
}