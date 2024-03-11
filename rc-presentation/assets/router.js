let target = null;
const registry = new Map();

function initRouter(routes) {
    target = document.querySelector(routes.target); // #root
    const mappings = routes.mappings; // array of object
    for (let i = 0; i < mappings.length; i++) {
        const mapping = mappings[i]; // {name: '', component :''}
        // HomeComponent = <rc-homecomponent></rc-homecomponent>
        const name = 'rc-' + mapping.component.toLowerCase();
        const element = `<${name}></${name}>`;
        registry.set(mapping.name, element);
    }
    // console.log(registry);
    window.addEventListener('hashchange', (event) => {
        // HomeComponent => rc-homecomponent
        // window.location.hash => #/home, #/contact, #/table
        const hash = window.location.hash;
        const name = hash.split('#/')[1];
        const element = registry.get(name);
        target.innerHTML = element;
    });
}

export default initRouter;