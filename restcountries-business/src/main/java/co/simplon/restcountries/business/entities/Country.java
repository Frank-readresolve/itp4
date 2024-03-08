package co.simplon.restcountries.business.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "country_iso_code")
    private String isoCode;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "country_population")
    private int countryPopulation;

    @Column(name = "country_area")
    private double countryArea;

    @Column(name = "capital_name")
    private String capitalName;

    @Column(name = "tld")
    private String tld;

    @Column(name = "flag_url")
    private String flagUrl;

    @Column(name = "coat_of_arms_url")
    private String coatOfArmsUrl;

    @Column(name = "google_maps_url")
    private String googleMapsUrl;

    public Country() {
	// Required by ORM
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getIsoCode() {
	return isoCode;
    }

    public void setIsoCode(String isoCode) {
	this.isoCode = isoCode;
    }

    public String getCountryName() {
	return countryName;
    }

    public void setCountryName(String countryName) {
	this.countryName = countryName;
    }

    public int getCountryPopulation() {
	return countryPopulation;
    }

    public void setCountryPopulation(int countryPopulation) {
	this.countryPopulation = countryPopulation;
    }

    public double getCountryArea() {
	return countryArea;
    }

    public void setCountryArea(double countryArea) {
	this.countryArea = countryArea;
    }

    public String getCapitalName() {
	return capitalName;
    }

    public void setCapitalName(String capitalName) {
	this.capitalName = capitalName;
    }

    public String getTld() {
	return tld;
    }

    public void setTld(String tld) {
	this.tld = tld;
    }

    public String getFlagUrl() {
	return flagUrl;
    }

    public void setFlagUrl(String flagUrl) {
	this.flagUrl = flagUrl;
    }

    public String getCoatOfArmsUrl() {
	return coatOfArmsUrl;
    }

    public void setCoatOfArmsUrl(String coatOfArmsUrl) {
	this.coatOfArmsUrl = coatOfArmsUrl;
    }

    public String getGoogleMapsUrl() {
	return googleMapsUrl;
    }

    public void setGoogleMapsUrl(String googleMapsUrl) {
	this.googleMapsUrl = googleMapsUrl;
    }

    @Override
    public String toString() {
	return "{id=" + id + ", isoCode=" + isoCode + ", countryName=" + countryName + ", countryPopulation="
		+ countryPopulation + ", countryArea=" + countryArea + ", capitalName=" + capitalName + ", tld=" + tld
		+ ", flagUrl=" + flagUrl + ", coatOfArmsUrl=" + coatOfArmsUrl + ", googleMapsUrl=" + googleMapsUrl
		+ "}";
    }

}
