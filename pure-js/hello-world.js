// Node specific object: process
const args = process.argv;

console.table(args);

console.log(`args[3] type=${typeof args[3]}`);

const asInt = parseInt(args[3]);

console.log(asInt);

console.log(`asInt type=${typeof asInt}`);

console.log(`sum=${asInt + 1}`);

// console object provided by Node (execution env)
// console.log etc... outputs in stdout (standard output)

// Declare a variable named greeting, of type string
// Naming a variable: what the variable represents
let greeting = "Hello world"; // Assign value to greeting
// Declare a constant named  exclamation, of type string
const  exclamation = "!";

// Concatenate greeting and exclamation
console.log(greeting + exclamation); // Read variables

// Interpolate variables into template literal
console.log(`${greeting}${exclamation}`);

// Declare a function returning the greeting
// function key word like let and const
// greeting function name, an identifier
// Naming a function: what the function does
function greetings() { // Curly braces = code bloc
	// Read global-scope variables
	return greeting + exclamation;
}

// Strore returned value of function into new
// constant named result
const result = greetings();
console.log(result);

console.log(`${greetings()}`);

// Declare a const as array with square brackets
// Specify values into the array
// Fill array with elements
const students = ["Emir", "Thao", "David", "Emilie"];

// Iterate over the array of students
// Print each student into the console
// for key word
// 3 optional parts seperated by a ";":
// - initialization (optional declaration)
// - condition (continutation/termination
// - incrementation (or decrementation)
// let i = 0; could be declared before loop
// array.length returns the number of elements in the array
// not the maximum index!!!! which is 3
for(let i = 0; i < students.length; i++) { // let i: loop-scope
	console.log(students[i]);
	console.log("**********");
}

let j;
for(j = 0; j < students.length; j++)
	console.log(students[j]); // This LoC only repeated
	console.log("---------------"); // Only once
console.log("j=" + j);

console.table(students);









