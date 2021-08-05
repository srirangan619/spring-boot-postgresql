package com.sample.springbootpostgresqlhibernatecrud.dto;

import com.sample.springbootpostgresqlhibernatecrud.entity.Device;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DeviceDTO {
    private Device device;
}
