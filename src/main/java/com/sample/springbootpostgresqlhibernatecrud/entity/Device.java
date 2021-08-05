package com.sample.springbootpostgresqlhibernatecrud.entity;

import javax.persistence.*;

@Entity
@Table(name = "devices")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "mac_address", nullable = false)
    private String mac_address;

    @Column(name = "serial_number", nullable = false)
    private String serial_number;

    public Device() {
    }

    public Device(int id, String name, String description, String mac_address, String serial_number) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.mac_address = mac_address;
        this.serial_number = serial_number;
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

    public String getMac_address() {
        return mac_address;
    }

    public void setMac_address(String mac_address) {
        this.mac_address = mac_address;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", mac_address='" + mac_address + '\'' +
                ", serial_number='" + serial_number + '\'' +
                '}';
    }
}
