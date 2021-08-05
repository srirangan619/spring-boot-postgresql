package com.sample.springbootpostgresqlhibernatecrud.repository;

import com.sample.springbootpostgresqlhibernatecrud.dto.TenantDTOResponse;
import com.sample.springbootpostgresqlhibernatecrud.entity.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, Integer> {
    @Query("SELECT new com.sample.springbootpostgresqlhibernatecrud.dto.TenantDTOResponse(t.name , d.name) FROM Tenant t JOIN t.devices d")
    public List<TenantDTOResponse> getJoinInformation();
}
