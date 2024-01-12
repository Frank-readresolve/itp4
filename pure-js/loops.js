const fruits = ["Apple","Pear","Peach", "Strawberry"];

for(let i = 0; i < fruits.length; i++) {
	console.log(fruits[i]);
}

console.table(fruits);

// Reverse order in output
// Do not modify or copy fruits

for(let i = fruits.length - 1; i >= 0; i--) {
	console.log(fruits[i]);
}
