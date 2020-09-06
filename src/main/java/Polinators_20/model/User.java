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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firstName;

    private String name;

    @Column(unique = true)
    private String nickName;

    @Column(unique = true)
    private String emailAddress;

    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private UserAddress userAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private BeeHives beeHives;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private Crops crops;

    private Integer userFunction;


}
