const matchesElement = document.querySelector('#matches > span');
const form = document.querySelector('form');
form.addEventListener('submit', (event) => {
    event.preventDefault();
    const input = form.input.value;
    const pattern = form.regexp.value;
    const regexp = new RegExp(pattern);
    const matches = regexp.test(input);
    matchesElement.textContent = matches;
});
