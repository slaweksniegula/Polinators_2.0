//package Polinators_20.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Builder
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Table(name = "Crops")
//public class Crops {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Integer id;
//
//    private CropType cropType;
//
//    private double howManyHectares;
//
//    private Date floweringTime;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "field")
//    private FieldAddress localization;
//
//    private Integer percentOfFieldUsed;
//}
