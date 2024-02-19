import messages from './messages/en-US.js';
import { init } from '../assets/i18n.js';
import HeaderComponent from "./components/HeaderComponent.js";

init(messages);
customElements.define('rc-header', HeaderComponent);
