/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentacar.API;

import com.mycompany.rentacar.DTO.ReceiptDTO;
import com.mycompany.rentacar.facede.ReceiptFacede;
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
@RequestMapping(value = "/receipt", produces = MediaType.APPLICATION_JSON_VALUE)
public class ReceiptAPI {
    @Autowired
    private ReceiptFacede receipt;
    
    @PostMapping
    @ResponseBody
    public ReceiptDTO create (@RequestBody ReceiptDTO receiptDTO)
    {
        return receipt.create(receiptDTO);
    }
    
    @PutMapping("/receiptId")
    @ResponseBody
    public ReceiptDTO update (@PathVariable("receiptId") Long vehicleId, @RequestBody ReceiptDTO receiptDTO)
    {
        return receipt.update(vehicleId, receiptDTO);
    }
    
    @GetMapping
    @ResponseBody
    public List<ReceiptDTO> getAll()
    {
        return receipt.getAll();
    }
    
    @DeleteMapping("/receiptId")
    @ResponseBody
    public String delete (@PathVariable("receiptId") Long receiptId)
    {
        return receipt.delete(receiptId);
    }
}
