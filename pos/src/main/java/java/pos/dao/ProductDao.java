package java.pos.dao;


import java.pos.model.Product;

public interface ProductDao {

    Product getByBarcode(String barcode);
}
