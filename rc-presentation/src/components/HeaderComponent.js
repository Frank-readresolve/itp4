import BaseComponent from '../../assets/BaseComponent.js';
import { msg, fmtDt } from '../../assets/i18n.js';

export default class HeaderComponent extends BaseComponent {

    constructor() {
        super();
    }

    beforeRender() {
        this.data.user = 'Frank MARSHALL';
        this.data.now = new Date();
    }

    template() {
        return /*html*/`
        <header class="sticky-top">
            <nav class="navbar navbar-expand-lg bg-body-tertiary">
                <div class="container">
                    <a class="navbar-brand" href="/#/home">${msg('rcBrand')}</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                        data-bs-target="#nav-bar-toggled">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="nav-bar-toggled">
                        <ul class="navbar-nav">
                            <li class="nav-item"><a class="nav-link" href="/#/table">${msg('rcMenuTable')}</a></li>
                            <li class="nav-item"><a class="nav-link" href="/#/contact">${msg('rcMenuContact')}</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
            <div class="bg-dark shadow-sm">
                <div class="container text-light">${this.data.user}, ${fmtDt(this.data.now)}</div>
            </div>
        </header>
        `;
    }
}