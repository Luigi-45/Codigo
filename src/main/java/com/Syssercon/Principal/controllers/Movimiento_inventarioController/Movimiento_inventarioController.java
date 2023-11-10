
package com.Syssercon.Principal.controllers.Movimiento_inventarioController;

import com.Syssercon.Principal.BO.Movimiento_inventarioBO.IMovimiento_inventarioBO;
import com.Syssercon.Principal.entities.Movimiento_inventario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movimiento_inventario")
@CrossOrigin(origins = "*")
public class Movimiento_inventarioController {
    
    @Autowired
    private IMovimiento_inventarioBO movimiento_inventarioBO;
    
    @GetMapping
    public List<Movimiento_inventario> findAll(){
        return (ArrayList<Movimiento_inventario>) movimiento_inventarioBO.findAll();
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>> delete (@PathVariable int id){
        movimiento_inventarioBO.delete(id);
        
        Map<String, Boolean> answer = new HashMap<>();
        answer.put("delete", Boolean.TRUE);
        return ResponseEntity.ok(answer);
    }
    
}
