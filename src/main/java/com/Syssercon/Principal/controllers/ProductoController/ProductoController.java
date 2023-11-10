package com.Syssercon.Principal.controllers.ProductoController;

import com.Syssercon.Principal.entities.Producto;
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
import com.Syssercon.Principal.BO.ProductoBO.IProductoBO;

@RestController
@RequestMapping("/api/producto")
@CrossOrigin(origins = "*")
public class ProductoController {
    
    @Autowired
    private IProductoBO productoBO;
    
    @GetMapping
    public List<Producto> findAll(){
        return (ArrayList<Producto>) productoBO.findAll();
    }
    
    @GetMapping("/findById/{id}")
    public ResponseEntity<Producto> findById(@PathVariable int id){
        Producto producto = productoBO.findById(id);
        return ResponseEntity.ok(producto);
    }
    
    @PostMapping("/save")
    public Producto save(@RequestBody Producto producto){
        return productoBO.create(producto);
    }
    
    @PutMapping("/update/{id}")
    public Producto update (@RequestBody Producto producto){
        return productoBO.update(producto);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>> delete (@PathVariable int id){
        productoBO.delete(id);
        
        Map<String, Boolean> answer = new HashMap<>();
        answer.put("delete", Boolean.TRUE);
        return ResponseEntity.ok(answer);
    }
    
}
