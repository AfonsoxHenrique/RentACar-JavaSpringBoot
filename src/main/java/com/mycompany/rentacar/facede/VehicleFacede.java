/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentacar.facede;

import com.mycompany.rentacar.DTO.VehicleDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 *
 * @author afons
 */
@Service
public class VehicleFacede {
    
    private static final Map<Long, VehicleDTO> vehicles = new HashMap<>();
    public VehicleDTO create(VehicleDTO vehicleDTO)
    {
       Long nextId = vehicles.keySet().size() + 1L;
       vehicleDTO.setId(nextId);
       vehicles.put(nextId, vehicleDTO);
       return vehicleDTO;
    }
    
    public VehicleDTO update (Long id, VehicleDTO vehicleDTO)
    {
        vehicles.put(id, vehicleDTO);
        return vehicleDTO;
    }
    
    public VehicleDTO getById(Long id)
    {
        return vehicles.get(id);
    }
    
    public List<VehicleDTO> getAll ()
    {
        return new ArrayList<>(vehicles.values());
    }
    
    public String delete (Long id)
    {
        vehicles.remove(id);
        return "Deleted";
    }
}
