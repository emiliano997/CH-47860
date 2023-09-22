package edu.coderhouse.books.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "publisher")
public class PublisherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id")
    private Long publisherId;

    @Column(nullable = false, length = 250)
    private String name;

    @Column(name = "fundatio_year", nullable = false)
    private Integer foundation_year;

    @Column(nullable = false, length = 250)
    private String country;

    public PublisherEntity() {
    }

    public PublisherEntity(Long publisherId, String name, Integer foundation_year, String country) {
        this.publisherId = publisherId;
        this.name = name;
        this.foundation_year = foundation_year;
        this.country = country;
    }

    public Long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFoundation_year() {
        return foundation_year;
    }

    public void setFoundation_year(Integer foundation_year) {
        this.foundation_year = foundation_year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
