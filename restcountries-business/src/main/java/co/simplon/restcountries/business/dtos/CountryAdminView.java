package co.simplon.restcountries.business.dtos;

public interface CountryAdminView {
    String getCountryName();

    String getCoatOfArmsUrl();

    String getTld();

    String getIsoCode();

    double getCountryArea();

    String getFlagUrl();
}
