// Function is a kind of routine
// Routine reeats same instructions
function doSomething() { // No params
	return "Doing something";
}

const result = doSomething(); // Call
// Store returned value into result
console.log(result);

function hello(name) { // Single param
	return "hello " + name;
}
console.log(hello("Toto"));
console.log(hello()); // undefined

function goodbye(text, name) {
	if(name) { // test if present
		return text + name;
	}
	return text;
}
console.log(goodbye("bye ", "Toto"));
console.log(goodbye("bye"));

// a and b : variables local to function
// b = 1: default value if undefined
function multiply(a, b = 1) {
	return a * b;
}

console.log(multiply(2, 2));


