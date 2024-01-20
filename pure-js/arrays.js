const students = ["Sab","Thao","Em"];
let first = students[0]; // Read at index 0
//console.log(first);
students[0] = "Emir"; // Write at index 0
//console.log(first); // ???
first = students[0]; // Reassign first
//console.log(first); //

const fruits = []; // Empty array
//console.log(fruits[0]);
fruits[0] = "Apple"; // Dynamic sizing
//console.table(fruits);
fruits[1] = "Mel";
fruits[3] = "Toto";
//console.log(fruits);

// Multidimensional arrays (2d, 3d, 4d...)
// An array containing other arrays 
const twoDimArray = [];
twoDimArray[0] = ["Apple", "Peach"];
twoDimArray[1] = ["Fish", "Meat", 1212654];
twoDimArray[2] = ["Fanta", "Coca", true];
twoDimArray[4] = "Boom";
console.log(twoDimArray);
const apple = twoDimArray[0][0];
const meat = twoDimArray[1][1];
console.log(`[0][0]=${apple}`);
console.log(`[1][1]=${meat}`);
