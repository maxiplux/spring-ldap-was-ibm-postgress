package plus.maxi.ldapsimulator.myldap.models.items;



import lombok.*;
import plus.maxi.ldapsimulator.myldap.models.AuditModel;

import javax.persistence.*;


@Data
@Builder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name="name", unique=true)
    private String name;


    private Category subCategory;


}
