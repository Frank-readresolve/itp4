function parseToInt(input) {
    return parseInt(input, 10);
}

function parseCommandLine(input) {
    const tokens = input.split(' ');
    const cmdName = tokens[0];
    const args = tokens.slice(1);
    return { commandName: cmdName, arguments: args };
}

function parseToFloats(input) {
    const result = input.split(',');
    for (let i = 0; i < result.length; i++) {
        result[i] = parseFloat(result[i]);
    }
    return result;
}

export { parseToFloats, parseCommandLine, parseToInt };