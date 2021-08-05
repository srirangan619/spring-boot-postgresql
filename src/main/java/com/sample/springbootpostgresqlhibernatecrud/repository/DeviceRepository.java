package com.sample.springbootpostgresqlhibernatecrud.repository;

import com.sample.springbootpostgresqlhibernatecrud.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer > {
}
