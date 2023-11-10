
package com.Syssercon.Principal.BO.ReporteBO;

import com.Syssercon.Principal.Manage.Report.JasperReportManagerStock;
import com.Syssercon.Principal.entities.Reporte;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReporteStockBO implements IReporteStockBO{
    
    @Autowired
    private JasperReportManagerStock reportManager;

    @Autowired
    private DataSource dataSource;

    @Override
    public Reporte obtenerReporte(Map<String, Object> params) throws Exception {
        
        String fileName = "Reporte_stock";
		Reporte ent = new Reporte();
		String extension = ".pdf";
		ent.setFileName(fileName + extension);

		ByteArrayOutputStream stream = reportManager.export("Reporte_stock", params,
				dataSource.getConnection());

		byte[] bs = stream.toByteArray();
		ent.setStream(new ByteArrayInputStream(bs));
		ent.setLength(bs.length);

		return ent;
    }
    
}
