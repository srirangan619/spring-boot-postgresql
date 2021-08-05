package com.sample.springbootpostgresqlhibernatecrud.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class TenantDTOResponse {

    private String name;
    private String deviceName;

//    public TenantDTOResponse(String name, String deviceName) {
//        this.name = name;
//        this.deviceName = deviceName;
//    }

}