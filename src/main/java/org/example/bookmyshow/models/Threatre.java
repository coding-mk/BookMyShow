package org.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Threatre extends BaseModel {
    private String name;
    @ManyToOne
    private City city;
    @OneToMany
    private List<Screen> screens;
}
