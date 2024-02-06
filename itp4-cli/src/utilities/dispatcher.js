import registry from './registry.js';
import stats from './stats.js';

async function dispatch(commandLine) {
	const cmdName = commandLine.commandName;
	let output = '';
	if (registry.includes(cmdName)) {
		stats.hitFound();
		const module = await import(`../commands/${cmdName}.js`);
		const funct = module.default;
		output = funct(commandLine.arguments);
	} else {
		stats.hitNotFound();
		output = `Command not found: ${cmdName}`;
	}
	return output;
}

export default dispatch;