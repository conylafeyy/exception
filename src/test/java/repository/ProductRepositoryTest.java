package repository;

import exception.NotFoundException;
import domain.Product;
import domain.Smartphone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository repository = new ProductRepository();
    private Smartphone firstPhone = new Smartphone(11, 40393, "A243", "Samsung");
    private Smartphone secondPhone = new Smartphone(22, 65000, "IPhone 12", "Apple");

    @BeforeEach
    void setUp() {
        repository.save(firstPhone);
        repository.save(secondPhone);
    }
    @Test
    void shouldRemoveIfExist() {
        Product[] expected = new Product[]{firstPhone};
        repository.removeById(22);
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveIfNotExist() {
        assertThrows(NotFoundException.class, () -> {
            repository.removeById(222);
        });
    }
}