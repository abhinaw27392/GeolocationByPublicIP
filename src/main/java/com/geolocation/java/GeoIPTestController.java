package com.geolocation.java;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeoIPTestController {
	private RawDBDemoGeoIPLocationService locationService;

	@PostMapping("/GeoIPTest")
	public GeoIP getLocation(@RequestParam(value = "ipAddress", required = true) String ipAddress) throws Exception {

		locationService = new RawDBDemoGeoIPLocationService();
		return locationService.getLocation(ipAddress);
	}
}
