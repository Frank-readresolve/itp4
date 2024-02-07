const FORMATTER = new Intl.NumberFormat('en-US');

function template(country) {
    return `
        <tr>
            <td><a href="${country.maps.googleMaps}" target="_blank"><img src="${country.flags.png}" class="img-fluid"></a></td>
            <td><img src="${country.coatOfArms.png}" class="img-fluid"></td>
            <td class="text-center">${country.cca2}</td>
            <td class="text-center">${country.tld[0] ? country.tld[0] : "<i class=\"bi bi-patch-question text-danger\"></i>"}</td>
            <td class="fw-bold">${country.name.official}</td>
            <td class="text-end">${FORMATTER.format(country.area)}</td>
        </tr>
    `;
}


async function loadCountries() {
    const url = 'https://restcountries.com/v3.1/region/europe?fields=name,flags,coatOfArms,cca2,tld,area,maps';
    const response = await fetch(url);
    const data = await response.json();
    let countries = '';
    for (let i = 0; i < data.length; i++) {
        const country = data[i];
        const line = template(country);
        countries += line;
    }
    const countryCards = document.querySelector('#country-table');
    countryCards.innerHTML = countries;
}

window.addEventListener('load', (event) => {
    loadCountries();
});