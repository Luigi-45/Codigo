
package com.Syssercon.Principal.controllers.ReportesController;

import com.Syssercon.Principal.entities.Reporte;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Syssercon.Principal.BO.ReporteBO.IReporteProductoBO;

@RestController
@RequestMapping("/report/producto")
@CrossOrigin(origins = "*")
public class ReporteProductoController {
    
    @Autowired
    private IReporteProductoBO reporteProductoBO;

	@GetMapping(path = "/download")
	public ResponseEntity<Resource> download(@RequestParam Map<String, Object> params)
			throws  Exception {
		Reporte ent = reporteProductoBO.obtenerReporte(params);

		InputStreamResource streamResource = new InputStreamResource(ent.getStream());
		MediaType mediaType = MediaType.APPLICATION_PDF;
		

		return ResponseEntity.ok().header("Content-Disposition", "inline; filename=\"" + ent.getFileName() + "\"")
				.contentLength(ent.getLength()).contentType(mediaType).body(streamResource);
	}
        
        @GetMapping(path = "/downloadTipo")
	public ResponseEntity<Resource> downloadTipo(@RequestParam Map<String, Object> params)
			throws  Exception {
		Reporte ent = reporteProductoBO.obtenerReporte(params);

		InputStreamResource streamResource = new InputStreamResource(ent.getStream());
		MediaType mediaType = MediaType.APPLICATION_PDF;
		

		return ResponseEntity.ok().header("Content-Disposition", "inline; filename=\"" + ent.getFileName() + "\"")
				.contentLength(ent.getLength()).contentType(mediaType).body(streamResource);
	}
    
}
