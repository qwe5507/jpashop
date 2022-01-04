package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Delivery {
    @Id @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;
    private String city;   //배송지 주소
    private String street; //배송지 주소
    private String zipcode;//배송지 주소
    private DeliveryStatus status;

    @OneToOne(mappedBy = "delivery")
    private Order order;

}