
// sum of '1,2,3,8,9'
function execute(input) {
	// args[0] = '1' BUG
	const numbers = parse(input);
	let sum = 0;
	for(let i = 0; i < numbers.length; i++) {
		sum += numbers[i];
	}
	return sum;
}

function parse(input) {
	const result = input.split(',');
	for(let i = 0; i < result.length; i++) {
		result[i] = parseFloat(result[i]);
	}
	return result;
}

export default execute;
