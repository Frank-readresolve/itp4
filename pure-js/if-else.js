let cond = false;
let matches = true;

function isTrue() {
	return cond;
}

// First condition met,
// executes the related code block
// Else executed if no condition met
// && logical operator "AND"
// || logical operator (OR)
if(isTrue() || matches) {
	console.log("So true...");
} else if(cond) {
	console.log("So so true!");
} else { // Sometimes required (it depends)
	console.log("In else clause");
}

console.log("Always the sun!");
