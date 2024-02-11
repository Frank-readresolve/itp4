const formatter = new Intl.NumberFormat('en-US');
// Logic
function template(country) {
    return `
        <div>
            <div class="card h-100 shadow-sm">
                <img src="${country.flags.png}" class="card-img-top">
                <div class="card-body border-top">
                    <h2 class="card-title fs-3">${country.name.official}</h2>
                    <h3 class="fs-4 display-5">${country.capital[0]}</h3>
                    <span class="text-nowrap"><i class="bi bi-person-arms-up"></i> ${formatter.format(country.population)}</span>
                </div>
            </div>
        </div>
    `;
}


async function loadCountries() {
    // Fetch data (json) from restcountries (only required data)
    const url = 'https://restcountries.com/v3.1/region/europe?fields=name,flags,capital,population';
    const response = await fetch(url);
    const data = await response.json();
    let countries = '';
    for (let i = 0; i < data.length; i++) {
        const country = data[i];
        const card = template(country);
        countries += card;
    }
    const countryCards = document.querySelector('#country-cards');
    countryCards.innerHTML = countries;
}

document.addEventListener('DOMContentLoaded', (event) => {
    loadCountries();
});