package io.caltamirano.seguridad.adapter.in.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.caltamirano.common.WebAdapter;
import io.caltamirano.seguridad.adapter.in.web.dto.response.VersionResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@WebAdapter
@RestController
@RequiredArgsConstructor
@Api(tags = {"Version"})
public class VersionController {
	
	@ApiOperation(value = "Servicio para obtener la versión del api seguridad", response = VersionResponse.class)
	@GetMapping("/version")
	public ResponseEntity<VersionResponse> obtener() {
		VersionResponse versionResponse = new VersionResponse("1", "2");
		return new ResponseEntity<VersionResponse>(versionResponse, HttpStatus.OK);
	}
	
}
