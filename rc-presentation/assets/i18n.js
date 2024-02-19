let dateFormatter = null;

let dictionary = null;

function init(messages) { // JS object
    dictionary = messages;
    const html = document.querySelector('html');
    html.setAttribute('lang', dictionary.locale.split('-')[0]);
    const title = document.querySelector('title');
    title.innerText = dictionary.rcDocumentTitle;
    dateFormatter = new Intl.DateTimeFormat(dictionary.locale);
}

function msg(key) { // msg = message
    return dictionary[key];
}

function fmtDt(date) {
    return dateFormatter.format(date);
}

export { init, msg, fmtDt };