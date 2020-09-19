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
@Table(name = "BeeHives")
public class BeeHives {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer numberOfBeeHives;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "beeHives_Id")
    private BeehiveAddress beehiveLocation;

    @ManyToOne
    private User user;
}
