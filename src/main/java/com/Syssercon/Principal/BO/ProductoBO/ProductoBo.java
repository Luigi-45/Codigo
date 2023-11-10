package com.Syssercon.Principal.BO.ProductoBO;
import com.Syssercon.Principal.entities.Producto;
import com.Syssercon.Principal.repositories.ProductoRepository.IProductoRepository;
import com.Syssercon.Principal.util.exceptions.ResourceNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductoBo implements IProductoBO{
    
    @Autowired
    private IProductoRepository productoRepository;
    
    @Override
    public Producto create(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public Producto update(Producto producto) {
        return productoRepository.save(producto);
    }
    
    @Override
    public Producto findById(int producto_Id) {
        return productoRepository.findById(producto_Id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el producto con el id: "+producto_Id));
    }

    @Override
    public void delete(int insumo_Id) {
        productoRepository.deleteById(insumo_Id);
    }
    
    
}
