import inquirer from 'inquirer';
import {default as hw} from './src/commands/hw.js';
import {default as sum} from './src/commands/sum.js';

async function run() {
	let found = 0, notFound = 0;
	program: while(true) { // Infinite loop
		const candidate = await inquirer.prompt([
			{ name: 'cmdLine', 
			message: '#>'} // JS object
		]);
		// cmdLine = sum 1,2,3,5,9
		const cmdLine = candidate.cmdLine; // read JS object
		const tokens = cmdLine.split(' ');
		// ['sum', '1,2,3,5,9']
		const cmdName = tokens[0]; // sum
		// ternary operator:
		// tokens[1] = '1,2,3,5,9'
		const cmdArg = tokens.length > 1 ? tokens[1] : undefined;
		if(cmdName === 'exit' || cmdName === 'logout') {
			found++;
			console.log(`f=${found}, nf=${notFound}, h=${found + notFound}`);
			break program;
		} else if(cmdName === 'hw') {
			found++;
			// call execute in module hw.js
 			const result = hw();
			console.log(result);
		} else if(cmdName === 'sum') {
			found++;
			const result = sum(cmdArg);
			console.log(result);
		} else { // Toto
			notFound++;
			console.log(`Command not found: ${cmdName}`);
		}
	}
}
run();
