package uk.org.markbradley.hexarchdemo.psql

import org.springframework.stereotype.Service
import uk.org.markbradley.hexarchdemo.businesslogic.Product
import uk.org.markbradley.hexarchdemo.businesslogic.ProductPersister
import uk.org.markbradley.hexarchdemo.businesslogic.ProductRetriever
import uk.org.markbradley.hexarchdemo.businesslogic.ProductsGetter

// TODO imagine this actually talks to a database
@Service
class ProductRepository: ProductPersister, ProductRetriever, ProductsGetter {

    var db: ArrayList<Product>

    constructor() {
        db = ArrayList<Product>()
        db.add(Product("123456789", "Biscuits", "biscuits.gif", 99))
        db.add(Product("987654321", "Tea", "tea.gif", 139))
    }

    override fun save(product: Product) {
        if (product.name.equals("chocolate")) {
            throw DatabaseBrokenExpection("Could not connect to the database SORRY")
        }

        for (p in db.iterator()) {
            if (p.ean == product.ean) {
                throw DuplicatePrimaryKeyException("Product with EAN ${product.ean} already exists")
            }
        }

        db.add(product)
    }

    override fun RetrieveBy(ean: String): Product {
        for (p in db.iterator()) {
            if (p.ean == ean) {
                return p
            }
        }

        throw NoRowException("No DB row with PK $ean")
    }

    override fun getAll(): ArrayList<Product> {
        return db
    }


}