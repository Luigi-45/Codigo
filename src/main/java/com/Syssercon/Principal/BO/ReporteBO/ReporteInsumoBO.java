
package com.Syssercon.Principal.BO.ReporteBO;

import com.Syssercon.Principal.Manage.Report.JasperReportManagerInsumo;
import com.Syssercon.Principal.entities.Reporte;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReporteInsumoBO implements IReporteInsumoBO{

        @Autowired
	private JasperReportManagerInsumo reportManager;

	@Autowired
	private DataSource dataSource;
    
    @Override
    public Reporte obtenerReporteInsumo(Map<String, Object> params) throws Exception{
        
        String fileName = "Reporte_insumos";
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
    
    @Override
    public Reporte obtenerReporteInsumoTipo(Map<String, Object> params) throws Exception{
        
        String fileName = "Reporte_insumoTipo";
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
    
    @Override
    public Reporte obtenerReporteInsumoUnidad(Map<String, Object> params) throws Exception{
        
        String fileName = "Reporte_insumoUnidadMedida";
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
