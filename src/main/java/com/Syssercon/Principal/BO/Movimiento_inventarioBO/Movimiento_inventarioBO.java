
package com.Syssercon.Principal.BO.Movimiento_inventarioBO;

import com.Syssercon.Principal.entities.Movimiento_inventario;
import com.Syssercon.Principal.repositories.Movimiento_inventarioRepository.IMovimiento_inventarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movimiento_inventarioBO implements IMovimiento_inventarioBO{

    @Autowired
    private IMovimiento_inventarioRepository movimiento_inventarioRepository;
    
    @Override
    public List<Movimiento_inventario> findAll() {
        return movimiento_inventarioRepository.findAll();
    }

    @Override
    public void delete(int movimiento_inventario_id) {
        movimiento_inventarioRepository.deleteById(movimiento_inventario_id);
    }
    
}
