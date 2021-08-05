package com.sample.springbootpostgresqlhibernatecrud.controller;

import com.sample.springbootpostgresqlhibernatecrud.dto.DeviceDTO;
import com.sample.springbootpostgresqlhibernatecrud.dto.TenantDTORequest;
import com.sample.springbootpostgresqlhibernatecrud.dto.TenantDTOResponse;
import com.sample.springbootpostgresqlhibernatecrud.entity.Device;
import com.sample.springbootpostgresqlhibernatecrud.entity.Tenant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sample.springbootpostgresqlhibernatecrud.repository.DeviceRepository;
import com.sample.springbootpostgresqlhibernatecrud.repository.TenantRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class TenantController {
    @Autowired
    private TenantRepository tenantRepository;

    @Autowired
    private DeviceRepository deviceRepository;

    @PostMapping("/create_tenant")
    public Tenant addTenant(@RequestBody TenantDTORequest tenantDTORequest){
        return tenantRepository.save(tenantDTORequest.getTenant());
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Tenant> getAllTenants(){
        return tenantRepository.findAll();
    }

    @PutMapping("/tenant/{id}")
    Tenant replaceTenant(@RequestBody TenantDTORequest tenantDTORequest, @PathVariable int id) {

        return tenantRepository.findById(id)
                .map(tenant -> {
                    tenant.setName(tenantDTORequest.getTenant().getName());
                    tenant.setDescription(tenantDTORequest.getTenant().getDescription());
                    tenant.setAddress(tenantDTORequest.getTenant().getAddress());
                    return tenantRepository.save(tenant);
                })
                .orElseGet(() -> {
                    return tenantRepository.save(tenantDTORequest.getTenant());
                });
    }

    @DeleteMapping("/tenant/{id}")
    void deleteTenant(@PathVariable int id) {
        tenantRepository.deleteById(id);
    }

    @PutMapping("/device/{id}")
    Device replaceDevice(@RequestBody DeviceDTO deviceDTO, @PathVariable int id) {

        return deviceRepository.findById(id)
                .map(device -> {
                    device.setName(deviceDTO.getDevice().getName());
                    device.setDescription(deviceDTO.getDevice().getDescription());
                    device.setMac_address(deviceDTO.getDevice().getMac_address());
                    device.setSerial_number(deviceDTO.getDevice().getSerial_number());
                    return deviceRepository.save(device);
                })
                .orElseGet(() -> {
                    return deviceRepository.save(deviceDTO.getDevice());
                });
    }

    @DeleteMapping("/device/{id}")
    void deleteDevice(@PathVariable int id) {
        deviceRepository.deleteById(id);
    }


    @GetMapping("/getInfo")
    public List<TenantDTOResponse> getJoinInformation(){
        return tenantRepository.getJoinInformation();
    }
}
