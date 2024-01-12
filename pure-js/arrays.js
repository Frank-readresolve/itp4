const students = ["Sab","Thao","Em"];
let first = students[0]; // Read at index 0
console.log(first);
students[0] = "Emir"; // Write at index 0
console.log(first); // ???
first = students[0]; // Reassign first
console.log(first); //

const fruits = []; // Empty array
console.log(fruits[0]);
fruits[0] = "Apple"; // Dynamic sizing
console.table(fruits);

