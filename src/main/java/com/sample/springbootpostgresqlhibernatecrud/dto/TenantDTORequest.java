package com.sample.springbootpostgresqlhibernatecrud.dto;

import com.sample.springbootpostgresqlhibernatecrud.entity.Tenant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TenantDTORequest {

    private Tenant tenant;
}
