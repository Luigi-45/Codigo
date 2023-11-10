package com.Syssercon.Principal.BO.ProductoBO;

import com.Syssercon.Principal.entities.Producto;
import java.util.List;

public interface IProductoBO {
    public Producto create(Producto producto);
    public List<Producto> findAll();
    public Producto update(Producto producto);
    public Producto findById(int producto_Id);
    public void delete(int producto_Id);
}
