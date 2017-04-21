package java.pos.dao;


import java.pos.model.Product;

/**
 * OK
 * Data Access Object
 * odpowiedzialne za komunikację z bazą danych
 */
public interface ProductDao {

    Product getByBarcode(String barcode);
}
