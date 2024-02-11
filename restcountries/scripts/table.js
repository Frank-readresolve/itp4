// Single formatter:
const formatter = new Intl.NumberFormat('en-US');

// Separate function, same icon for any missing data
function missingData() {
    return "<i class=\"bi bi-patch-question text-danger\"></i>";
}

// Separate functions for tld and coat of arms
// for readability in the template function
function tld(tlds) {
    if (tlds.length > 0) {
        return tlds[0];
    }
    return missingData();
}

function coatOfArms(url) {
    if (url !== '') {
        return `<img src="${url}" class="img-fluid">`;
    }
    return missingData(); // Only if url is empty string
}

function template(country) {
    return `
        <tr>
            <td class="text-center">
                <a href="${country.maps.googleMaps}" target="_blank"><img src="${country.flags.png}" class="img-fluid"></a>
            </td>
            <td class="text-center">${coatOfArms(country.coatOfArms.png)}</td>
            <td class="text-center">${country.cca2}</td>
            <td class="text-center">${tld(country.tld)}</td>
            <td class="fw-bold">${country.name.official}</td>
            <td class="text-end">${formatter.format(country.area)}</td>
        </tr>
    `;
}


async function loadCountries() {
    // Filter only required fieds
    const url = 'https://restcountries.com/v3.1/region/europe?fields=name,flags,coatOfArms,cca2,tld,area,maps';
    const response = await fetch(url);
    const data = await response.json();
    let rows = '';
    for (const country of data) { // for-of loop (when index is not needed)
        rows += template(country);
    }
    // Target DOM node:
    const tableBody = document.querySelector('#country-table-body');
    tableBody.innerHTML = rows; // Update DOM once
}

// loadCountries function called as soon as DOM is ready:
document.addEventListener('DOMContentLoaded', (event) => {
    loadCountries();
});
