
package com.Syssercon.Principal.Manage.Report;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

@Component
public class JasperReportManagerProducto {
    
    private static final String REPORT_FOLDER = "ReportProducto";

	private static final String JASPER = ".jasper";

	public ByteArrayOutputStream export(String fileName, Map<String, Object> params,
			Connection con) throws JRException, IOException {

		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		ClassPathResource resource = new ClassPathResource(REPORT_FOLDER + File.separator + fileName + JASPER);
		
		InputStream inputStream = resource.getInputStream();
		JasperPrint jasperPrint = JasperFillManager.fillReport(inputStream, params, con);
		
		JasperExportManager.exportReportToPdfStream(jasperPrint, stream);
		return stream;
	}
}
