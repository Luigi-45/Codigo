
package com.Syssercon.Principal.controllers.NotificacionStockController;

import com.Syssercon.Principal.BO.NotificacionStockBO.INotificacionStockBO;
import com.Syssercon.Principal.entities.NotificacionStock;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notificacion")
@CrossOrigin(origins = "*")
public class NotificacionStockController {
    
    @Autowired
    private INotificacionStockBO notificacionBO;
    
    @GetMapping
    public List<NotificacionStock> Notify(){
        return (ArrayList<NotificacionStock>) notificacionBO.findAll();
    }
     
}
