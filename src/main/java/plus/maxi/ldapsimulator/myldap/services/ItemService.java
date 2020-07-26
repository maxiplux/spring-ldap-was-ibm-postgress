package plus.maxi.ldapsimulator.myldap.services;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;
import plus.maxi.ldapsimulator.myldap.models.items.Item;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface ItemService {


    Page<Item> findAll(Pageable pageable);

    Item createProduct(Item product);

    Item updateProduct(Item product);

    Optional<Item> updateProductById(long id, Item product);

    Boolean deleteProductById(long id);

    Optional<Item> findById(long id);
}
