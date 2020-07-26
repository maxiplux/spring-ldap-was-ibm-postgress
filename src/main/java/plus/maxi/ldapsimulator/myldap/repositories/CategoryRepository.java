package plus.maxi.ldapsimulator.myldap.repositories;



import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import plus.maxi.ldapsimulator.myldap.models.items.Category;


@Repository
public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {


}
