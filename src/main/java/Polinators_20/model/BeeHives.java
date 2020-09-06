package Polinators_20.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BeeHives {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer numberOfBeeHives;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "beehivesId")
    private BeehivesAddress beehiveLocation;

}
