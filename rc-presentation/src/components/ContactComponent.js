import BaseFormComponent from "../../assets/BaseFormComponent.js";
import { msg } from '../../assets/i18n.js';
import { getJson } from "../../assets/api.js";

export default class ContactComponent extends BaseFormComponent {

    constructor() {
        super();
    }

    onValidationErrors() {
        alert('Please review you inputs!');
    }

    validate() {
        const emailPattern = /^(?=.{1,64}@)\w+([\.-]?\w+)*@(?=.{4,252}$)\w+([\.-]?\w+)*(\.\w{2,4})+$/;
        let validated = true;
        const firstname = this.data.firstname;
        const lastname = this.data.lastname;
        const email = this.data.email;
        const comments = this.data.comments;
        if (firstname.length === 0 || firstname.length > 100) {
            validated = false;
        } else if (lastname.length === 0 || lastname.length > 100) {
            validated = false;
        } else if (!emailPattern.test(email)) {
            validated = false;
        } else if (comments.length >= 1000) {
            validated = false;
        }
        return validated;
    }

    template() {
        return /*html*/`
        <main class="container mb-3">
            <h1 class="display-5">${msg('rcContactTitle')}</h1>
            <div class="row row-cols-lg-2 g-3">
            <div class="order-1 order-lg-0">
                <img src="public/world.jpeg" class="img-fluid rounded-3 shadow-sm">
            </div>
            <div>
                <form novalidate>
                    <div class="mb-3">
                        <label for="firstname" class="form-label fw-medium">${msg('rcContactFirstname')} <span
                                class="text-danger">*</span></label>
                        <input name="firstname" type="text" class="form-control" id="firstname">
                        <div class="form-text">${msg('rcContactFirstnameHelp')}</div>
                    </div>
                    <div class="mb-3">
                        <label for="lastname" class="form-label fw-medium">${msg('rcContactLastname')} <span
                                class="text-danger">*</span></label>
                        <input name="lastname" type="text" class="form-control" id="lastname">
                        <div class="form-text">${msg('rcContactLastnameHelp')}</div>
                    </div>
                    <div class="mb-3">
                        <label for="email" class="form-label fw-medium">${msg('rcContactEmail')} <span class="text-danger">*</span></label>
                        <div class="input-group">
                            <span class="input-group-text">@</span>
                            <input name="email" type="email" class="form-control" id="email">
                        </div>
                        <div class="form-text">${msg('rcContactEmailHelp')}</div>
                    </div>
                    <div class="mb-3">
                        <label for="comments" class="form-label fw-medium">${msg('rcContactComments')}</label>
                        <textarea name="comments" id="comments" class="form-control" rows="5"></textarea>
                        <div class="form-text">${msg('rcContactCommentsHelp')}</div>
                    </div>
                    <div class="d-grid d-lg-flex justify-content-lg-end">
                        <button class="btn btn-primary" type="submit">${msg('rcContactSubmit')}</button>
                    </div>
                </form>
            </div>
        </div>
        </main>
        `;
    }
}