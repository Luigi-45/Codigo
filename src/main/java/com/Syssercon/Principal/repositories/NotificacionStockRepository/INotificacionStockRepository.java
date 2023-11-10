
package com.Syssercon.Principal.repositories.NotificacionStockRepository;

import com.Syssercon.Principal.entities.NotificacionStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INotificacionStockRepository extends JpaRepository<NotificacionStock,Integer> {
    
}
