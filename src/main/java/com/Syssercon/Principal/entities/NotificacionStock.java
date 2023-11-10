
package com.Syssercon.Principal.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="notificacion_stock")
public class NotificacionStock {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int notificacion_stock_id;
    
    private String tipo_notificacion;
    private Date fecha_hora;
    private String descripcion;
}
