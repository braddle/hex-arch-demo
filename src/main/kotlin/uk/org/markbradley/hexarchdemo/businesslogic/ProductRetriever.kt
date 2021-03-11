package uk.org.markbradley.hexarchdemo.businesslogic

interface ProductRetriever {
    fun RetrieveBy(ean: String) : Product
}