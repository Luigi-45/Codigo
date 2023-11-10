
package com.Syssercon.Principal.BO.ReporteBO;

import com.Syssercon.Principal.Manage.Report.JasperReportManagerProducto;
import com.Syssercon.Principal.entities.Reporte;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReporteProductoBO implements IReporteProductoBO{
    
    @Autowired
	private JasperReportManagerProducto reportManager;

	@Autowired
	private DataSource dataSource;
    
    @Override
    public Reporte obtenerReporte(Map<String, Object> params) throws Exception{
        
        String fileName = "Reporte_productos";
		Reporte ent = new Reporte();
		String extension = ".pdf";
		ent.setFileName(fileName + extension);

		ByteArrayOutputStream stream = reportManager.export("Reporte_productos", params,
				dataSource.getConnection());

		byte[] bs = stream.toByteArray();
		ent.setStream(new ByteArrayInputStream(bs));
		ent.setLength(bs.length);

		return ent;
    }
    
    @Override
    public Reporte obtenerReporteTipo(Map<String, Object> params) throws Exception{
        
        String fileName = "Reporte_productoTipo";
		Reporte ent = new Reporte();
		String extension = ".pdf";
		ent.setFileName(fileName + extension);

		ByteArrayOutputStream stream = reportManager.export("Reporte_productos", params,
				dataSource.getConnection());

		byte[] bs = stream.toByteArray();
		ent.setStream(new ByteArrayInputStream(bs));
		ent.setLength(bs.length);

		return ent;
    }
}
