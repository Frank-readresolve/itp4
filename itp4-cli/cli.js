import prompt from './src/utilities/prompt.js';
import dispatch from './src/utilities/dispatcher.js';
import stats from './src/utilities/stats.js';
import { parseCommandLine } from './src/utilities/parsers.js';

async function run() {
	program: while (true) {
		const input = await prompt();
		const commandLine = parseCommandLine(input);
		const cmdName = commandLine.commandName;
		if (cmdName === 'exit' || cmdName === 'logout') {
			stats.hitFound();
			break program;
		}
		const output = await dispatch(commandLine);
		console.log(output);
	}
	console.log(`f=${stats.found}, nf=${stats.notFound}, h=${stats.hits}`);
}
run();
