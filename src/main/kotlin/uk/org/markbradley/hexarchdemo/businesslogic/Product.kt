package uk.org.markbradley.hexarchdemo.businesslogic

data class Product(
        val ean: String,
        val name: String,
        val imageUrl: String,
        val priceInPence: Int
) {
    fun isValid(): Boolean {
        return !name.equals("beans")
    }
}
