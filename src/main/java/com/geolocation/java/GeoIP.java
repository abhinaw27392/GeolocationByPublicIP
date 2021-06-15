package com.geolocation.java;

public class GeoIP {
	private String ipAddress;
	private String city;
	private String countryName;
	private String latitude;
	private String longitude;

	public GeoIP(String ipAddress, String city, String countryName, String latitude, String longitude) {
		super();
		this.ipAddress = ipAddress;
		this.city = city;
		this.countryName = countryName;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
}
