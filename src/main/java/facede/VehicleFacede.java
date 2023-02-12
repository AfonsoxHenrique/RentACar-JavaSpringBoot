/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facede;

import com.mycompany.rentacar.DTO.ClientDTO;
import com.mycompany.rentacar.DTO.VehicleDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author afons
 */
public class VehicleFacede {
    
    private static final Map<Long, VehicleDTO> vehicles = new HashMap<>();
    public VehicleDTO create(VehicleDTO vehicleDTO)
    {
       Long nextId = vehicles.keySet().size() + 1L;
       vehicleDTO.setId(nextId);
       vehicles.put(nextId, vehicleDTO);
       return vehicleDTO;
    }
    
    public VehicleDTO update (VehicleDTO vehicleDTO, Long id)
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
    
    public VehicleDTO delete (Long id)
    {
        return vehicles.remove(id);
    }
}
