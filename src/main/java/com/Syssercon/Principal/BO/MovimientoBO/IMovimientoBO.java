
package com.Syssercon.Principal.BO.MovimientoBO;

import com.Syssercon.Principal.entities.Movimiento_inventario;
import java.util.List;

public interface IMovimientoBO {
    public Movimiento_inventario create(Movimiento_inventario movimiento);
    public List<Movimiento_inventario> findAll();
    public Movimiento_inventario update(Movimiento_inventario movimiento);
    public Movimiento_inventario findById(int movimiento_inventario_Id);
    public void delete(int movimiento_inventario_Id);
}
