import inquirer from "inquirer";

async function prompt() {
    const candidate = await inquirer.prompt([
        {
            name: 'cmdLine',
            message: '#>'
        }
    ]);
    return candidate.cmdLine;
}

export default prompt;