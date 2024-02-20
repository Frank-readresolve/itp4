let dateFormatter = null;
let numberFormatter = null;

let dictionary = null;

function initI18n(messages) { // JS object
    dictionary = messages;
    const html = document.querySelector('html');
    html.setAttribute('lang', dictionary.locale.split('-')[0]);
    html.setAttribute('dir', dictionary.dir);
    const title = document.querySelector('title');
    title.innerText = dictionary.rcDocumentTitle;
    dateFormatter = new Intl.DateTimeFormat(dictionary.locale);
    numberFormatter = new Intl.NumberFormat(dictionary.locale);
}

function msg(key) { // msg = message
    return dictionary[key];
}

function fmtDt(date) {
    return dateFormatter.format(date);
}

function fmtNum(number) {
    return numberFormatter.format(number);
}

export { initI18n, msg, fmtDt, fmtNum };