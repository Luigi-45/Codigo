
package com.Syssercon.Principal.BO.NotificacionStockBO;

import com.Syssercon.Principal.entities.NotificacionStock;
import com.Syssercon.Principal.repositories.NotificacionStockRepository.INotificacionStockRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificacionStockBO implements INotificacionStockBO{

    @Autowired
    private INotificacionStockRepository notificacionRepository;

    @Override
    public List<NotificacionStock> findAll() {
        return notificacionRepository.findAll();
    }
    
    
    
}
