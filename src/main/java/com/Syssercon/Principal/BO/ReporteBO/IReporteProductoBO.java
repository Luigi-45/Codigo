
package com.Syssercon.Principal.BO.ReporteBO;

import com.Syssercon.Principal.entities.Reporte;
import java.util.Map;


public interface IReporteProductoBO {
    
    Reporte obtenerReporte(Map<String, Object> params) throws Exception;
    Reporte obtenerReporteTipo(Map<String, Object> params) throws Exception;
}
