import BaseComponent from './BaseComponent.js';

export default class BaseFormComponent extends BaseComponent {

    constructor() {
        super();
    }

    async connectedCallback() {
        await super.connectedCallback();
        const form = this.querySelector('form');
        form.addEventListener('submit', (event) => {
            event.preventDefault();
            // read form (inputs) => bind to data
            const formData = new FormData(form);
            formData.forEach((value, key) => {
                this.data[key] = value.trim();
            });
            const valid = this.validate();
            if(valid) {
                console.log('Form is valid');
            } else {
                this.onValidationErrors();
            }
            
        });
    }

    submit() {
        // formdata
        // json
        // post json to api
        // handle server errors
    }

    validate() {
        return true;
    }

    onValidationErrors() {
        return;
    }
}