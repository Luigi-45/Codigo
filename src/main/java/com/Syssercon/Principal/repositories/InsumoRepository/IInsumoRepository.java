package com.Syssercon.Principal.repositories.InsumoRepository;

import com.Syssercon.Principal.entities.Insumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInsumoRepository extends JpaRepository<Insumo,Integer>{
}
