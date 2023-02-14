/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentacar.API;

import com.mycompany.rentacar.DTO.ClientDTO;
import com.mycompany.rentacar.facede.ClientFacede;
import java.awt.PageAttributes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author afons
 */

@Controller
@RequestMapping(value = "/client", produces = MediaType.APPLICATION_JSON_VALUE)
public class ClientAPI {
    @Autowired
    private ClientFacede client;
    
    
    @PostMapping
    @ResponseBody
    public ClientDTO create (@RequestBody ClientDTO clientDTO)
    {
        return client.create(clientDTO);
    }
    
    @PutMapping("/clientId")
    @ResponseBody
    public ClientDTO update (@PathVariable("clientId") Long clientId,@RequestBody ClientDTO clientDTO)
    {
        return client.update(clientId, clientDTO);
    }
    
    @GetMapping
    @ResponseBody
    public List<ClientDTO> getAll()
    {
        return client.getAll();
    }
    
    @DeleteMapping("/clientId")
    @ResponseBody
    public String delete (@PathVariable("clientId") Long clientId)
    {
        return client.delete(clientId);
    }
}
