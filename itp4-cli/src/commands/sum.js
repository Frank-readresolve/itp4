import { parseToFloats } from '../utilities/parsers.js';

function execute(args) {
	const input = args[0];
	const numbers = parseToFloats(input);
	let sum = 0;
	for (let i = 0; i < numbers.length; i++) {
		sum += numbers[i];
	}
	return sum;
}

export default execute;
