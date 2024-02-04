function execute(args) {
    const text = args[0];
    const letter = args[1];
    let count = 0;
    for (let i = 0; i < text.length; i++) {
        if (text[i] === letter) {
            count++;
        }
    }
    return count;
}

export default execute;