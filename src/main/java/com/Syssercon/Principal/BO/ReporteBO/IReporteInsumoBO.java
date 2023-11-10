
package com.Syssercon.Principal.BO.ReporteBO;

import com.Syssercon.Principal.entities.Reporte;
import java.util.Map;


public interface IReporteInsumoBO  {
    
    Reporte obtenerReporteInsumo(Map<String, Object> params) throws Exception;
    Reporte obtenerReporteInsumoTipo(Map<String, Object> params) throws Exception;
    Reporte obtenerReporteInsumoUnidad(Map<String, Object> params) throws Exception;
}
