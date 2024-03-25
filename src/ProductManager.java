import models.Product;

public class ProductManager {
    Product[] products;
    Product[] foundProducts;
    int dbCounter = 0;

    public ProductManager() {
        this.products = new Product[100];
        this.foundProducts = new Product[100];
    }

    public void addProduct(Product product) throws Exception {
        if (dbCounter >= this.products.length) {
            throw new Exception("CSDL đã đầy");
        }
        this.products[dbCounter] = product;
        dbCounter++;
    }

    public Product getHighestPriceProduct() {
        int id = 0;
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i] == null) {
                break;
            }
            if (this.products[id].getPrice() < this.products[i].getPrice()) {
                id = i;
            }
        }
        return this.products[id];
    }

    public Product getLowestPriceProduct() {
        int id = 0;
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i] == null) {
                break;
            }
            if (this.products[id].getPrice() > this.products[i].getPrice()) {
                id = i;
            }
        }
        return this.products[id];
    }

    public Product[] searchProduct(String keyword) {
        //reset lại
       this.foundProducts = new Product[100];
        int i = 0;
        for (Product product : this.products) {
            if (this.products[i] == null) {
                break;
            }
            if (product.getName().contains(keyword)) {
                foundProducts[i] = product;
            }
            i++;
        }
        return this.foundProducts;
    }
}

