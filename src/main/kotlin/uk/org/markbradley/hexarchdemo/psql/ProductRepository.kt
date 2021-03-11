package uk.org.markbradley.hexarchdemo.psql

import uk.org.markbradley.hexarchdemo.businesslogic.Product
import uk.org.markbradley.hexarchdemo.businesslogic.ProductPersister

// TODO imagine this actually talks to a database
class ProductRepository: ProductPersister {

    var db: ArrayList<Product>

    constructor() {
        db = ArrayList<Product>()
        db.add(Product("123456789", "Biscuits", "biscuits.gif", 99))
        db.add(Product("987654321", "Tea", "tea.gif", 139))
    }

    override fun save(product: Product) {
        for (p in db.iterator()) {
            if (p.ean == product.ean) {
                throw DuplicatePrimaryKeyException("Product with EAN ${product.ean} already exists")
            }
        }
    }
}