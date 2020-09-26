package Polinators_20.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class BeehiveAddress extends Address{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    private String city;

    private String postalCode;

    private String geolocation;

}
