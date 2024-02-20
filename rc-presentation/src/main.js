import messages from './messages/en-US.js';
import { initI18n } from '../assets/i18n.js';
import HeaderComponent from "./components/HeaderComponent.js";
import HomeComponent from "./components/HomeComponent.js";
import ContactComponent from "./components/ContactComponent.js";
import TableComponent from "./components/TableComponent.js";
import routes from './routes/routes.js';
import initRouter from '../assets/router.js';

initI18n(messages);
customElements.define('rc-header', HeaderComponent);
customElements.define('rc-homecomponent', HomeComponent);
customElements.define('rc-contactcomponent', ContactComponent);
customElements.define('rc-tablecomponent', TableComponent);
initRouter(routes);