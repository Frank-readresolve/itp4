import { parseToInt } from '../utilities/parsers.js';
import os from 'os';

function execute(args) {
    const max = parseToInt(args[0]);
    let result = '';
    for (let i = 1; i <= max; i++) {
        if (i % 15 === 0) { // 15 = 3 * 5
            result += 'FizzBuzz' + os.EOL;
        } else if (i % 3 === 0) {
            result += 'Fizz' + os.EOL;
        } else if (i % 5 === 0) {
            result += 'Buzz' + os.EOL
        } else {
            result += i + os.EOL;
        }
    }
    return result;
}

export default execute;