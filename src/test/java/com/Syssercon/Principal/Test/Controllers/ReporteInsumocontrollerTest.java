
package com.Syssercon.Principal.Test.Controllers;

import com.Syssercon.Principal.controllers.ReportesController.ReporteInsumoController;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
public class ReporteInsumocontrollerTest {
    
    @Autowired
    private MockMvc mockMvs;
    
    @MockBean
    private ReporteInsumoController insumocontroller;
    
    @Autowired
    private ObjectMapper objectMapper;
    
    @Test
    void testDescargarReporte(){
        
        
        
    }
}
