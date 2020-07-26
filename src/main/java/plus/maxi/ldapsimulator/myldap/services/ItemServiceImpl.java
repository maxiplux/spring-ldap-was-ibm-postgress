package plus.maxi.ldapsimulator.myldap.services;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import plus.maxi.ldapsimulator.myldap.models.items.Item;
import plus.maxi.ldapsimulator.myldap.repositories.ItemRepository;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository productRepository;









    @Override
    @Cacheable(value = "ItemServicesCachefindAll", key = "#pageable")
    public Page<Item> findAll(Pageable pageable) {

        return productRepository.findAll(pageable);
    }

    @Override
    public Item createProduct(Item product) {
        return this.productRepository.save(product);
    }

    @Override
    public Item updateProduct(Item product) {
        return this.productRepository.save(product);
    }


    @Override
    public Optional<Item> updateProductById(long id, Item item) {

        int resultDummyOperation = this.suma(id, id * 2);

        if (resultDummyOperation == 9) {
            System.out.println("Operation only to understand PowerMockito");
        } else {
            System.out.println("!!!!!  Code Coverage : Operation only to understand PowerMockito");

        }

        Optional<Item> optionalCurrentProduct = this.productRepository.findById(id);
        if (optionalCurrentProduct.isPresent()) {
            Item currentItem = optionalCurrentProduct.get();

            if (item.getName() != null) {
                currentItem.setName(item.getName());
            }

            if (item.getPrice() != null) {
                currentItem.setPrice(item.getPrice());
            }

            if (item.getCategory() != null) {
                currentItem.setCategory(item.getCategory());
            }



            if (item.getPicture() != null) {
                currentItem.setPicture(item.getPicture());
            }

            if (item.getQuality() != null) {
                currentItem.setQuality(item.getQuality());
            }


            return Optional.of(this.productRepository.save(currentItem));
        }
        return Optional.empty();


    }

    private int suma(Long id, Long l) {
        return (int) (id + l);
    }


    @Override
    public Boolean deleteProductById(long id) {
        return this.productRepository.deleteById(id);
    }

    @Override
    @Cacheable(value = "ItemServicesCache", key = "#id")
    public Optional<Item> findById(long id) {
        return this.productRepository.findById(id);
    }
}
