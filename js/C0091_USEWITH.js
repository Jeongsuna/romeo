var x = 'a';

var foo = {
  y: 1
}

with (foo) {  // Noncompliant
  y = 4;  // updates foo.x
  x = 3;  // does NOT add a foo.x property; updates x var in outer scope
}
console.log(foo.x + " " + x); // shows: undefined 3