# Simple command line interpreter in JavaScript
Objectives: design and implement sequentially a simple command line interpreter in JavaScript running in a Node.js evironment.

Prerequisites to start:
- Basic algorithmic skills
- Basic knowledge of JavaScript
- Node.js installed

## Constraints
- Allowed built-in functions: `split()`, `slice()`, `parseInt()`, `parseFloat()`. You will be authorized to use new built-in functions from certain commands
- Inputs and outputs are only examples, not a unique use case!
- Test your commands with varied inputs to be sure you meet the requirements
- For all commands, unless otherwise stated, we consider that the user inputs valid parameters, so input validation is not expected in such cases

## Commands to implement
All commands are in this current folder, named with the name of the command to implement, no extension. So what we call here a "command" is a JavaScript file with no extension, which is executed with Node.js. Example: `node echo "Hello wolrd!"`.

### Batch 1
Code structure must be the same as the `bim`, `echo` and `hw` examples in this folder, no other structure. That means:
- On top of file, retrieve Node's arguments then slice the array to exclude the 2 first Node's specific arguments you don't need to implement the commands
- A function named `execute` with or without parameters as required, the function always returns a string, the expected output of the command
- Declare and read required parameters after the function declaration
- Call the functions with required arguments and store the returned value in a result constant
- Print the result in the console. Only one `console.log` in the command's file

#### Command `add`
- Write a command which adds two numbers
- Input: `add 2 2`
- Ouput: `4`

#### Command `square`
- Write a command which calculates the square of one number
- Input: `square 2`
- Output: `4`

#### Command `area`
- Write a command which calculates the area with two parameters
- Input: `area 2 2`
- Output: `4`

#### Command `revstr`
- Write a command which reverses a string
- Input: `revstr "hello toto"`
- Output: `otot olleh`

#### Command `sum`
- Write a command which calculates the sum of `n` numbers
- Input: `sum 3,4,6,2`
- Output: `15`

#### Command `max`
- Write a command which finds the max value from `n` unordered numbers
- Input: `max 3,4,6,1`
- Output: `6`

#### Command `cntocc`
- Write a command which counts the number of occurences of a letter in a string
- Input: `cntocc "Hello world!" l`
- Output: `3`

#### Command `statsn`
- Write a command which calculates the average, the min, the max, and counts the number of values greater than or equal to the average
- Input: `statsn 1,3,2`
- Output: `Avg: 2, min: 1, max: 3, count: 2`

#### Command `cntoe`
- Write a command which counts the number of odds and evens in a list of n integers
- Input: `cntoe 2,5,6,9`
- Output: `Odds: 2, Evens: 2`

#### Command `unqstr`
- Write a command which extracts from a string the characters appearing only once
- Input: `unqstr "Hello world!"`
- Output: `['H','e','w',' ','r','d','!']`

#### Command `pairs`
- Write a command which returns pairs of equal letters from a "shuffled" list of characters, excluding ones appearing once or more than twice. Order of returned pairs is not important
- Input: `pairs a,c,b,a,b,c,h,h,h,o`
- Output: `[['a','a'],['c','c'],['b','b']]`

#### Command `shift`
- Write a command which shifts letters of a text given a number of places and a direction
- The text contains only letters from the latin alphabet, uppercased, unaccented. In other words only letters from `A` to `Z`. Text can contain whitespaces between words, whitespaces are not shifted
- The number of places indicates the number of shifts
- The direction indicates if the shift is to the right (`R`) or to the left (`L`)
- Input: `shift R 3 "HELLO WORLDZ"`
- Output: `KHOOR ZRUOGC`

#### Command `passw`
- Write a command which generates a random text (password)
- Must have `n` characters from these `classes`: `4` x `a-z`, `4` x `A-Z`, `4` x `0-9` and `1` x `@&#";!*=`. A character from one class can appear more than once
- Classes must be "mixed up", each character from any class should appear anywhere in the generated text

> From now, including the `passw` command, you can use `Math.random()` and `Math.floor()` as built-in functions in addition to priviously listed built-in functions

#### Command `invoice`
- Write a command which calculates the details and totals (with and without VAT) for an invoice
- Products, quantities, unit prices and rates are ordered and have the same number of "elements"
- Unit prices are without VAT
- VAT is input in `%`
- Results do not have to be rounded
- Input: `invoice "bread, butter, coca-cola light" 2,1,3 .94,1.88,2.09 5.5,5.5,20.0`
- Output: one line per product with name, quantity, unit price, total without VAT, VAT rate, total with VAT. Then one last line with the total without VAT and total with VAT

#### Command `fmtstrtojson`
- Write a command which formats a string into a json
- Try to infer the conversion rules from the examples below (no more/no less) to handle JS strings, booleans and numbers only
- Input: `fmtstrtojson "firstName='Toto' lastName='MIAOU' happy=true age=16 nickname='false'"`
- Output: `{"firstName": "Toto", "lastName": "MIAOU", "happy": true, "age": 16, "nickname": "false"}`
