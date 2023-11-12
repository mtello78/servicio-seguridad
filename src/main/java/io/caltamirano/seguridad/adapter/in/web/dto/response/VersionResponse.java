package io.caltamirano.seguridad.adapter.in.web.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VersionResponse {

	private String minor;
	
	private String major;
	
}
