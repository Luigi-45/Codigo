
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
@Table(name="movimiento_inventario")
public class Movimiento_inventario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movimiento_inventario_id;
    
    private String tipo_movimiento;
    private int cantidad;
    private Date fecha_hora;
    private int insumo_id;
    private int producto_id;
    
}
