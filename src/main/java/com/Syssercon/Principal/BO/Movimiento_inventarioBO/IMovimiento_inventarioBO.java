
package com.Syssercon.Principal.BO.Movimiento_inventarioBO;

import com.Syssercon.Principal.entities.Movimiento_inventario;
import java.util.List;

public interface IMovimiento_inventarioBO {
    public List<Movimiento_inventario> findAll();
    public void delete(int movimiento_inventario_Id);
}
