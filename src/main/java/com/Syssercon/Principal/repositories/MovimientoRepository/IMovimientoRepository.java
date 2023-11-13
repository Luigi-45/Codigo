
package com.Syssercon.Principal.repositories.MovimientoRepository;

import com.Syssercon.Principal.entities.Movimiento_inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMovimientoRepository extends JpaRepository<Movimiento_inventario,Integer>{
    
}
