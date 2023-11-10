package com.Syssercon.Principal.BO.InsumoBO;

import com.Syssercon.Principal.entities.Insumo;
import java.util.List;

public interface IInsumoBO {
    public Insumo create(Insumo insumo);
    public List<Insumo> findAll();
    public Insumo update(Insumo insumo);
    public Insumo findById(int insumo_Id);
    public void delete(int insumo_Id);
}
