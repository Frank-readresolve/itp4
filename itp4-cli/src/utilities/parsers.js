function parseToFloats(input) {
    const result = input.split(',');
    for (let i = 0; i < result.length; i++) {
        result[i] = parseFloat(result[i]);
    }
    return result;
}

export { parseToFloats };