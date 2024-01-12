// Slice an array
const fruits = ["Apple","Peach","Pear","Kiwi"];
console.table(fruits);
const slicedFruits = fruits.slice(1, 3);
console.table(slicedFruits);
console.table(fruits); // not modified

// Split a string
const source = "a,b,c,d,e,f";
console.log(source);
const destination = source.split(",");
console.log(destination);
console.log(source); // not modified

// Parse a string to an int (number)
const PI = "3.99";
console.log(typeof PI);
// piAsInt = camelCase
// PI_AS_INT = SNAKE_CASE
const PI_AS_INT = parseInt(PI);
console.log(PI_AS_INT);
console.log(PI);

// Parse a string to a float (number)
const LIGHT_SPEED = "299999.99999";
const LS_AS_FLOAT = parseFloat(LIGHT_SPEED);
console.log(LS_AS_FLOAT);
console.log(typeof LS_AS_FLOAT);





