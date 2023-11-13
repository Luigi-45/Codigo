
package com.Syssercon.Principal.controllers.MovimientoController;

import com.Syssercon.Principal.BO.MovimientoBO.IMovimientoBO;
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movimiento")
@CrossOrigin(origins = "*")
public class MovimientoController {
    
    @Autowired
    private IMovimientoBO movimientoBO;
    
    @GetMapping
    public List<Movimiento_inventario> findAll(){
        return (ArrayList<Movimiento_inventario>) movimientoBO.findAll();
    }
    
    @GetMapping("/findById/{id}")
    public ResponseEntity<Movimiento_inventario> findById(@PathVariable int id){
        Movimiento_inventario movimiento = movimientoBO.findById(id);
        return ResponseEntity.ok(movimiento);
    }
    
    @PostMapping("/save")
    public Movimiento_inventario save(@RequestBody Movimiento_inventario movimiento){
        return movimientoBO.create(movimiento);
    }
    
    @PutMapping("/update/{id}")
    public Movimiento_inventario update (@RequestBody Movimiento_inventario movimiento){
        return movimientoBO.update(movimiento);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>> delete (@PathVariable int id){
        movimientoBO.delete(id);
        
        Map<String, Boolean> answer = new HashMap<>();
        answer.put("delete", Boolean.TRUE);
        return ResponseEntity.ok(answer);
    }
    
}
