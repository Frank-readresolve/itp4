import registry from './registry.js';

async function dispatch(cmdName, args) {
	let output = '';
	if (registry.includes(cmdName)) {
		const module = await import(`../commands/${cmdName}.js`);
		const funct = module.default;
		output = funct(args);
	} else {
		// notFound++; // ???
		output = `Command not found: ${cmdName}`;
	}
	return output;
}

export default dispatch;