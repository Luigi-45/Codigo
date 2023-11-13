
package com.Syssercon.Principal.BO.MovimientoBO;

import com.Syssercon.Principal.entities.Movimiento_inventario;
import com.Syssercon.Principal.repositories.MovimientoRepository.IMovimientoRepository;
import com.Syssercon.Principal.util.exceptions.ResourceNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovimientoBO implements IMovimientoBO{

    @Autowired
    private IMovimientoRepository movimientoRepository;
    
    @Override
    public Movimiento_inventario create(Movimiento_inventario movimiento) {
        return movimientoRepository.save(movimiento);
    }

    @Override
    public List<Movimiento_inventario> findAll() {
        return movimientoRepository.findAll();
    }

    @Override
    public Movimiento_inventario update(Movimiento_inventario movimiento) {
        return movimientoRepository.save(movimiento);
    }

    @Override
    public Movimiento_inventario findById(int movimiento_inventario_Id) {
        return movimientoRepository.findById(movimiento_inventario_Id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el movimiento con el id: "+movimiento_inventario_Id));
    }

    @Override
    public void delete(int movimiento_inventario_Id) {
        movimientoRepository.deleteById(movimiento_inventario_Id);
    }
    
}
