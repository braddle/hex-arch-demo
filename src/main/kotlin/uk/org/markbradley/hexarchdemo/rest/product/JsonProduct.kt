package uk.org.markbradley.hexarchdemo.rest.product

import com.fasterxml.jackson.annotation.JsonCreator

data class JsonProduct @JsonCreator constructor(
        val ean: String,
        val name: String,
        val imageUrl: String,
        val price: Int
) {
    override fun toString(): String {
        return "Product(ean='$ean', name='$name', imageUrl='$imageUrl', PriceInPence=$price)"
    }
}