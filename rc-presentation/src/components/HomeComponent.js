import BaseComponent from "../../assets/BaseComponent.js";
import { msg, fmtNum } from '../../assets/i18n.js';
import { getJson } from "../../assets/api.js";

export default class HomeComponent extends BaseComponent {

    constructor() {
        super();
    }

    async beforeRender() {
        const url = 'http://localhost:8080/countries';
        const countries = await getJson(url);
        this.data.countries = countries;
        // console.log(countries);
    }

    template() {
        return /*html*/`
        <main class="container mb-3">
            <h1 class="display-5">${msg('rcHomeTitle')}</h1>
            <div class="row row-cols-1 row-cols-md-2 row-cols-lg-4 m-0 g-2">
                ${this.data.countries.map((country) => { return this.countryCard(country); }).join('')}
            </div>
        </main>
        `;
    }

    countryCard(country) {
        return /*html*/`
        <div>
            <div class="card h-100 shadow-sm">
                <a href="${country.googleMapsUrl}" target="_blank"><img src="${country.flagUrl}" class="card-img-top"></a>
                <div class="card-body border-top">
                    <h2 class="card-title fs-3">${country.countryName}</h2>
                    <h3 class="fs-4 display-5">${country.capitalName}</h3>
                    <span class="text-nowrap"><i class="bi bi-person-arms-up"></i> ${fmtNum(country.population)}</span>
                </div>
            </div>
        </div>
        `;
    }

}