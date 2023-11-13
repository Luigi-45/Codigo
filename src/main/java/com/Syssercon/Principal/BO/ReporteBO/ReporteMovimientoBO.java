
package com.Syssercon.Principal.BO.ReporteBO;

import com.Syssercon.Principal.Manage.Report.JasperReportManagerMovimiento;
import com.Syssercon.Principal.entities.Reporte;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReporteMovimientoBO implements IReporteMovimientoBO{

    @Autowired
	private JasperReportManagerMovimiento reportManager;

	@Autowired
	private DataSource dataSource;
    
    @Override
    public Reporte obtenerReporte(Map<String, Object> params) throws Exception {
        
        String fileName = "Reporte_movimiento_inventario";
		Reporte ent = new Reporte();
		String extension = ".pdf";
		ent.setFileName(fileName + extension);

		ByteArrayOutputStream stream = reportManager.export(fileName, params,
				dataSource.getConnection());

		byte[] bs = stream.toByteArray();
		ent.setStream(new ByteArrayInputStream(bs));
		ent.setLength(bs.length);

		return ent;
        
    }
    
}
