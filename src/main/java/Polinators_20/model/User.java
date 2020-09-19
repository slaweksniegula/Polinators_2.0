package Polinators_20.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

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
    private String userName;

    @Column(unique = true)
    private String emailAddress;

    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fc_User")
    private UserAddress userAddress;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="user_id")
    private List<BeeHives> beeHives;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user")
//    private Crops crops;

    private Integer userFunction;


    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(name, user.name) &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(emailAddress, user.emailAddress) &&
                Objects.equals(password, user.password) &&
                Objects.equals(userAddress, user.userAddress) &&
//                Objects.equals(beeHives, user.beeHives) &&
//                Objects.equals(crops, user.crops) &&
                Objects.equals(userFunction, user.userFunction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, name, userName, emailAddress, password, userAddress,
                // beeHives, crops,
                userFunction);
    }
}
