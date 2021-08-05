package com.sample.springbootpostgresqlhibernatecrud.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tenant")
public class Tenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "address", nullable = false)
    private String address;

    @OneToMany(targetEntity = Device.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "td_fk", referencedColumnName = "id")
    private List<Device> devices;

    public Tenant() {
    }

    public Tenant(int id, String name, String description, String address, List<Device> devices) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.address = address;
        this.devices = devices;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    @Override
    public String toString() {
        return "Tenant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", address='" + address + '\'' +
                ", devices=" + devices +
                '}';
    }
}
