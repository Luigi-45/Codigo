
package com.Syssercon.Principal.BO.ReporteBO;

import com.Syssercon.Principal.entities.Reporte;
import java.util.Map;

public interface IReporteMovimientoBO {
    Reporte obtenerReporte(Map<String, Object> params) throws Exception;
}
