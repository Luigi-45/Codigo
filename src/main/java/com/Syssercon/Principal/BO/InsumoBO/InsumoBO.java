package com.Syssercon.Principal.BO.InsumoBO;
import com.Syssercon.Principal.entities.Insumo;
import com.Syssercon.Principal.repositories.InsumoRepository.IInsumoRepository;
import com.Syssercon.Principal.util.exceptions.ResourceNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsumoBO implements IInsumoBO{

    @Autowired
    private IInsumoRepository insumoRepository;
    
    @Override
    public Insumo create(Insumo insumo) {
        return insumoRepository.save(insumo);
    }

    @Override
    public List<Insumo> findAll() {
        return insumoRepository.findAll();
    }
    
    @Override
    public Insumo update(Insumo insumo) {
        return insumoRepository.save(insumo);
    }

    @Override
    public Insumo findById(int insumo_Id) {
        return insumoRepository.findById(insumo_Id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el insumo con el id: "+insumo_Id));
    }

    @Override
    public void delete(int insumo_Id) {
        insumoRepository.deleteById(insumo_Id);
    }

    
    
}
