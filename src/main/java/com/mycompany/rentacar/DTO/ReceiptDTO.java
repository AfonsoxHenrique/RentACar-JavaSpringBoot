/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentacar.DTO;



/**
 *
 * @author afons
 */
public class ReceiptDTO {
   
    private ClientDTO clientDTO;
    private VehicleDTO vehicleDTO;
    
    private Long id;
    public ReceiptDTO ()
    {
        this.clientDTO = new ClientDTO();
        this.vehicleDTO = new VehicleDTO();
    }

    /**
     * @return the clientDTO
     */
    public ClientDTO getClientDTO() {
        return clientDTO;
    }

    /**
     * @param clientDTO the clientDTO to set
     */
    public void setClientDTO(ClientDTO clientDTO) {
        this.clientDTO = clientDTO;
    }

    /**
     * @return the vehicleDTO
     */
    public VehicleDTO getVehicleDTO() {
        return vehicleDTO;
    }

    /**
     * @param vehicleDTO the vehicleDTO to set
     */
    public void setVehicleDTO(VehicleDTO vehicleDTO) {
        this.vehicleDTO = vehicleDTO;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    
}
