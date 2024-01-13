# Simple command line interpreter in JavaScript
**Objectives**: design and implement, step by step, a simple "command line interpreter" and some commands (small programs) in JavaScript running in a Node.js evironment.

**Prerequisites**:
- Basic usage of a "terminal" (having fiddled with some command lines)
- Basic algorithmic skills
- Basic knowledge of a computer program execution
- Basic knowledge of writing code in JavaScript
- Node.js installed and usage of `node` command from a "terminal"

**Pay attention to**:
- Allowed built-in functions: `split()`, `slice()`, `parseInt()`, `parseFloat()`. You will be authorized to use new built-in functions from certain commands, this information is highlighted where it's needed the first time
- Inputs and outputs are only examples, not a unique use cases!
- Test your commands with varied inputs to be sure you meet the requirements

## Advices
- [Keep It Simple Stupid](https://fr.wikipedia.org/wiki/Principe_KISS)
- Read carefully and understand the requirements! Just like any manual ([RTFM](https://fr.wikipedia.org/wiki/RTFM_(expression)))

![rtfm](https://github.com/Frank-readresolve/itp4/assets/32057169/e1cf18d4-7804-41ca-b094-2502f5cf6c01)
© [Yann Forget](https://commons.wikimedia.org/wiki/User:Yann) / [Wikimedia Commons](https://commons.wikimedia.org/)

## Commands to implement
All commands must be in the `commands` folder, named with the name of the command to implement, lowercase, no extension. So what we call here a "command" is a JavaScript file with no extension, which is executed with Node.js. Example: `node echo "Hello wolrd!"`.

> [!NOTE]
> **Break commands**. You'll find notes like this one. They indicate a **break command** you can start and try to implement whenever you want, you are free, no need to finish previous ones. These commands bring you joy and fun but remain serious problems to resolve.

### Batch 1
Code structure must be the same as the `bim`, `echo` and `hw` examples in this folder, no other structure. That means:
- On top of file, retrieve Node's arguments then slice the array to exclude the 2 first Node's specific arguments you don't need to implement the commands
- A function named `execute` with or without parameters as required, the function returns the expected type as required (string, number, boolean&hellip;)
- Declare and read required parameters after the function declaration
- Call the functions with required arguments and store the returned value in a result constant
- Print the result in the console. Only one `console.log` in the command's file
- Note: for all commands in this batch we consider that the user inputs valid parameters, so input validation is not expected

#### Command `add`
- Write a command which adds two numbers as command line arguments
- Input: `add 2 2`
- Ouput: `4`

#### Command `square`
- Write a command which calculates the square of one number as command line argument
- Input: `square 2`
- Output: `4`

#### Command `area`
- Write a command which calculates the area with two numbers as command line arguments
- Input: `area 2 2`
- Output: `4`

#### Command `revstr`
- Write a command which reverses a string as command line single argument
- Input: `revstr "hello toto"`
- Output: `otot olleh`

#### Command `sum`
- Write a command which calculates the sum of `n` numbers separeted by a comma as command line single argument
- Input: `sum "3,4,6,2"`
- Output: `15`

#### Command `max`
- Write a command which finds the max value from `n` unordered numbers separeted by a comma as command line single argument
- Input: `max "3,4,6,1"`
- Output: `6`

#### Command `cntocc`
- Write a command which counts the number of occurences of a letter in a string as command line arguments
- Input: `cntocc "Hello world!" l`
- Output: `3`

#### Command `statsn`
- Write a command which calculates the average, the min, the max, and counts the number of values greater than or equal to the average of numbers separeted by a comma as command line single argument
- Input: `statsn "1,3,2"`
- Output: `Avg: 2, min: 1, max: 3, count: 2`

#### Command `cntoe`
- Write a command which counts the number of odds and evens in a list of `n` integers separeted by a comma as command line single argument
- Input: `cntoe "2,5,6,9"`
- Output: `Odds: 2, Evens: 2`

#### Command `unqstr`
- Write a command which extracts from a string the characters appearing only once as command line single argument
- Input: `unqstr "Hello world!"`
- Output: `['H','e','w',' ','r','d','!']`

#### Command `pairs`
- Write a command which returns pairs of equal letters from a "shuffled" list of letters as command line single argument, excluding letters appearing once or more than twice. Order of returned pairs is not important
- Input: `pairs "a,c,b,a,b,c,h,h,h,o"`
- Output: `[['a','a'],['c','c'],['b','b']]`

#### Command `shift`
- Write a command which shifts letters of a text given a number of places and a direction as command line arguments
- The text contains only letters from the latin alphabet, uppercased, unaccented. In other words only letters from `A` to `Z`. Text can contain whitespaces between words, whitespaces are not shifted
- The number of places indicates the number of shifts
- The direction indicates if the shift is to the right (`R`) or to the left (`L`)
- Input: `shift R 3 "HELLO WORLDZ"`
- Output: `KHOOR ZRUOGC`

#### Command `passw`
- Write a command which generates a random text (password), no arguments
- Must have `n` characters from these `classes`: `4` x `a-z`, `4` x `A-Z`, `4` x `0-9` and `1` x `@&#";!*=`. A character from one class can appear more than once
- Classes must be "mixed up", each character from any class should appear anywhere in the generated text
- Input: `passw`
- Output: `aX12bS8dY9*p`

> [!IMPORTANT]
> From now, including the `passw` command, you can use `Math.random()` and `Math.floor()` as built-in functions in addition to priviously listed built-in functions.

#### Command `invoice`
- Write a command which calculates the details and totals (with and without VAT) for an invoice, that's three arguments
- Products, quantities, unit prices and rates are ordered and have the same number of "elements"
- Unit prices are without VAT
- VAT is input in `%`
- Results do not have to be rounded
- Input: `invoice "bread, butter, soda light" "2,1,3" ".94,1.88,2.09 5.5,5.5,20.0"`
- Expected output description: one line per product with name, quantity, unit price, total without VAT, VAT rate, total with VAT. Then one last line with the total without VAT and total with VAT

#### Command `fmtstrtojson`
- Write a command which formats a string into a json as a command line single argument
- Try to infer the conversion rules from the examples below (no more/no less) to handle JS strings, booleans and numbers only
- Input: `fmtstrtojson "firstName='Toto' lastName='MIAOU' happy=true age=16 nickname='false'"`
- Output: `{"firstName": "Toto", "lastName": "MIAOU", "happy": true, "age": 16, "nickname": "false"}`

#### Command `pokestats` (break)
> [!NOTE]
> **Break command**. You're tired of serious commands above, have a break! This command offers a moment of peace and serenity. Enjoy!
- Write a command which prints some statistics related to a Pokemon given its name as a command line argument
- In case of any HTTP error or if the Pokemon is not found the output should be `Pokemon with name 'xxx' not found` where `xxx` is the argument of the command (unknown name)
- API to fetch from: [Pokebuild](https://pokebuildapi.fr/api/v1)
- Find out, reading the API docs, the endpoint to call and the required data to keep in the returned JSON in order to build the output string (see example here after)
- Tech tip: as you need to `await` the call to `fetch`, the `execute` function needs to be marked as `async`. In consequences the call to `execute` needs to be in an `async` context also but the call is not within a method which we can mark `async`. Solution: [IIFE (Immediately Invoked Function Expression)](https://developer.mozilla.org/en-US/docs/Glossary/IIFE), for this command you can declare the call to `execute` and the `console.log` into an IIFE:
```javascript
(async () => {
      // Your code (execute + console.log)
})();
```
- Input: `pokestats "Luxray"`
- Output:
```
!!! Stats for Pokemon 'Luxray', identifier 405 !!!
-> Hit points: 80
-> Attack: 120
-> Defense: 79
-> Special attack: 95
-> Special defense: 79
-> Speed: 70
-> Image: https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/405.png
```
> [!IMPORTANT]
> From now, including the `pokestats` command, you can use `fetch()` and `json()` as built-in functions in addition to priviously listed built-in functions.
