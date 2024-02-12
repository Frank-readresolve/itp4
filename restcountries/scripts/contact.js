const emailPattern = /^(?=.{1,64}@)\w+([\.-]?\w+)*@(?=.{4,252}$)\w+([\.-]?\w+)*(\.\w{2,4})+$/;
const form = document.querySelector('#contact-form');

function validate() {
    let validated = true;
    // HTML form inputs default type = string (empty)
    // trim inputs ("best practice")
    const firstname = form.firstname.value.trim();
    const lastname = form.lastname.value.trim();
    const email = form.email.value.trim();
    const comments = form.comments.value.trim();
    // set to false as soon as an input violates a validation constraint
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

async function send() {
    // Form's fields as key/value pairs
    const formData = new FormData(form);
    // Convert form data as JS object
    const object = {};
    formData.forEach((value, key) => object[key] = value);
    // Convert JS object as JSON to send in request body
    const json = JSON.stringify(object);
    // JS object for request options
    // Needs to set method POST (GET is default)
    // Needs to specify request's body content type (expected by server)
    const options = {
        method: 'POST',
        headers: new Headers({ 'content-type': 'application/json' }),
        body: json
    }
    // try-catch to handle potential client/server communication errors
    try {
        const response = await fetch('https://gateway.readresolve.tech:9443/sms', options);
        if (response.status === 202) { // Expected success status code
            form.reset();
            alert('Wow you are lucky mate, everything is okay!');
        } else { // Any other status code
            alert('A client or server error has occured!');
        }
    } catch (err) {
        alert('An unexpected error has occured!');
        console.error(err);
    }
}

form.addEventListener('submit', async (event) => {
    event.preventDefault();
    const validated = validate();
    if (validated) {
        await send();
    } else {
        alert('Validation errors, please check your inputs!');
    }
});