import { msg, fmtDt } from '../../assets/i18n.js';

export default class HeaderComponent extends HTMLElement {

    constructor() {
        super();
    }

    connectedCallback() {
        this.render();
    }

    render() {
        const html = this.template();
        this.innerHTML = html;
    }

    template() {
        return /*html*/`
        <header class="sticky-top">
            <nav class="navbar navbar-expand-lg bg-body-tertiary">
                <div class="container">
                    <a class="navbar-brand" href="index.html">${msg('rcBrand')}</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                        data-bs-target="#nav-bar-toggled">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="nav-bar-toggled">
                        <ul class="navbar-nav">
                            <li class="nav-item"><a class="nav-link" href="table.html">${msg('rcMenuTable')}</a></li>
                            <li class="nav-item"><a class="nav-link" href="contact.html">${msg('rcMenuContact')}</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
            <div class="bg-dark shadow-sm">
                <div class="container text-light">${fmtDt(new Date())}</div>
            </div>
        </header>
        `;
    }
}