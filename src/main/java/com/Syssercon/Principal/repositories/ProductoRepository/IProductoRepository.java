package com.Syssercon.Principal.repositories.ProductoRepository;

import com.Syssercon.Principal.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository<Producto,Integer>{
    
}
