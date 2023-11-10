package com.Syssercon.Principal.controllers.InsumoController;

import com.Syssercon.Principal.entities.Insumo;
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
import com.Syssercon.Principal.BO.InsumoBO.IInsumoBO;

@RestController
@RequestMapping("/api/insumo")
@CrossOrigin(origins = "*")
public class InsumoController {
    
    @Autowired
    private IInsumoBO insumoBO;
    
    @GetMapping
    public List<Insumo> findAll(){
        return (ArrayList<Insumo>) insumoBO.findAll();
    }
    
    @GetMapping("/findById/{id}")
    public ResponseEntity<Insumo> findById(@PathVariable int id){
        Insumo insumo = insumoBO.findById(id);
        return ResponseEntity.ok(insumo);
    }
    
    @PostMapping("/save")
    public Insumo save(@RequestBody Insumo insumo){
        return insumoBO.create(insumo);
    }
    
    @PutMapping("/update/{id}")
    public Insumo update (@RequestBody Insumo insumo){
        return insumoBO.update(insumo);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>> delete (@PathVariable int id){
        insumoBO.delete(id);
        
        Map<String, Boolean> answer = new HashMap<>();
        answer.put("delete", Boolean.TRUE);
        return ResponseEntity.ok(answer);
    }
    
}
