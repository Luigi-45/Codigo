
package com.Syssercon.Principal.entities;

import java.io.ByteArrayInputStream;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reporte {
   
    private String fileName;
    private ByteArrayInputStream stream;
    private int length;
    
}
