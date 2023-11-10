
package com.Syssercon.Principal.Repository;

import static org.assertj.core.api.Assertions.assertThat;
import com.Syssercon.Principal.entities.NotificacionStock;
import com.Syssercon.Principal.repositories.NotificacionStockRepository.INotificacionStockRepository;
import java.sql.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class NotificacionStockRepositoryTests {
    
    @Autowired
    private INotificacionStockRepository notificacionstockRepository;
    
    @Test
    void testListNotificacion(){
        //given  dado o condicion previa
        long miliseconds = System.currentTimeMillis();
        Date date = new Date(miliseconds);
        NotificacionStock notificacion = NotificacionStock.builder()
                .tipo_notificacion("stock")
                .fecha_hora(date)
                .descripcion("lana").build();
        notificacionstockRepository.save(notificacion);
        //when accion o comportamiento
        
        List<NotificacionStock> listaNotificacion = notificacionstockRepository.findAll();
        //then verificar la salida
        
        assertThat(listaNotificacion).isNotNull();
        assertThat(listaNotificacion.size()).isEqualTo(1);
    }
    
}
