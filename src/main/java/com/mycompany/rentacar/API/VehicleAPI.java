/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentacar.API;

import com.mycompany.rentacar.DTO.VehicleDTO;
import com.mycompany.rentacar.facede.VehicleFacede;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author afons
 */
public class VehicleAPI {
    @Autowired
    private VehicleFacede vehicle;
    
    @PostMapping
    @ResponseBody
    public VehicleDTO create (@RequestBody VehicleDTO vehicleDTO)
    {
        return vehicle.create(vehicleDTO);
    }
    
    @PutMapping("/vehicleId")
    @ResponseBody
    public VehicleDTO update (@PathVariable("vehicleId") Long vehicleId, @RequestBody VehicleDTO vehicleDTO)
    {
        return vehicle.update(vehicleId, vehicleDTO);
    }
    
    @GetMapping
    @ResponseBody
    public List<VehicleDTO> getAll()
    {
        return vehicle.getAll();
    }
    
    @DeleteMapping("/vehicleId")
    @ResponseBody
    public String delete (@PathVariable("vehicleId") Long vehicleId)
    {
        return vehicle.delete(vehicleId);
    }
}
