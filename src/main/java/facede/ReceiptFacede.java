/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facede;

import com.mycompany.rentacar.DTO.ReceiptDTO;
import com.mycompany.rentacar.DTO.VehicleDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author afons
 */
public class ReceiptFacede {
    private static final Map<Long, ReceiptDTO> receipts = new HashMap<>();
    public ReceiptDTO create(ReceiptDTO receiptDTO)
    {
       Long nextId = receipts.keySet().size() + 1L;
       receiptDTO.setId(nextId);
       receipts.put(nextId, receiptDTO);
       return receiptDTO;
    }
    
    public ReceiptDTO update (ReceiptDTO receiptDTO, Long id)
    {
        receipts.put(id, receiptDTO);
        return receiptDTO;
    }
    
    public ReceiptDTO getById(Long id)
    {
        return receipts.get(id);
    }
    
    public List<ReceiptDTO> getAll ()
    {
        return new ArrayList<>(receipts.values());
    }
    
    public ReceiptDTO delete (Long id)
    {
        return receipts.remove(id);
    }
}
