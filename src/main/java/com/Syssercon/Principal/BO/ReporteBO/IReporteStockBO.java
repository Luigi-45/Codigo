
package com.Syssercon.Principal.BO.ReporteBO;

import com.Syssercon.Principal.entities.Reporte;
import java.util.Map;

public interface IReporteStockBO {
    
    Reporte obtenerReporte(Map<String, Object> params) throws Exception;
}
