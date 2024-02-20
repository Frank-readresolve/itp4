import BaseComponent from "../../assets/BaseComponent.js";
import { msg } from '../../assets/i18n.js';
import { getJson } from "../../assets/api.js";

export default class TableComponent extends BaseComponent {

    constructor() {
        super();
    }

    async beforeRender() {
        //
    }

    template() {
        return /*html*/`
        <main class="container mb-3">
            <h1 class="display-5">${msg('rcTableTitle')}</h1>
        </main>
        `;
    }
}