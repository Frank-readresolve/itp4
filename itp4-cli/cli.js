import inquirer from 'inquirer';
import dispatch from './src/utilities/dispatcher.js'

async function run() {
	let hits = 0, notFound = 0;
	program: while (true) {
		const candidate = await inquirer.prompt([
			{
				name: 'cmdLine',
				message: '#>'
			}
		]);
		const cmdLine = candidate.cmdLine;
		const tokens = cmdLine.split(' ');
		const cmdName = tokens[0];
		const args = tokens.slice(1);
		hits++;
		if (cmdName === 'exit' || cmdName === 'logout') {
			break program;
		}
		const output = await dispatch(cmdName, args);
		console.log(output);
	}
	console.log(`f=${hits - notFound}, nf=${notFound}, h=${hits}`);
}
run();
