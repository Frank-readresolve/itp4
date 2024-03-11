import BaseComponent from "../../assets/BaseComponent.js";
import { getJson } from "../../assets/api.js";
import { msg, fmtNum } from '../../assets/i18n.js';

export default class TableComponent extends BaseComponent {

    constructor() {
        super();
    }

    async beforeRender() {
        const url = 'http://localhost:8080/countries/admin';
        const countries = await getJson(url);
        this.data.countries = countries;
    }

    template() {
        return /*html*/`
        <main class="container mb-3">
            <h1 class="display-5">${msg('rcTableTitle')}</h1>
            <div class="table-responsive">
            <table class="table table-striped">
                <thead class="text-center">
                    <tr>
                        <th scope="col">Flag</th>
                        <th scope="col">Arms</th>
                        <th scope="col">ISO</th>
                        <th scope="col">TLD</th>
                        <th class="w-100" scope="col">Name</th>
                        <th scope="col">Area</th>
                    </tr>
                </thead>
                <tbody class="text-nowrap align-middle">
                    ${this.data.countries.map((country) => { return this.countryRow(country); }).join('')}
                </tbody>
            </table>
        </div>
        </main>
        `;
    }

    countryRow(country) {
        return /*html*/`
        <tr>
            <td class="text-center">
                <a href="${country.googleMapsUrl}" target="_blank"><img src="${country.flagUrl}" class="img-fluid"></a>
            </td>
            <td class="text-center"><img src="${country.coatOfArmsUrl}" class="img-fluid"></td>
            <td class="text-center">${country.isoCode}</td>
            <td class="text-center">${country.tld}</td>
            <td class="fw-bold">${country.countryName}</td>
            <td class="text-end">${fmtNum(country.countryArea)}</td>
        </tr>
        `;
    }
}