function f() {
    eval = 17; // Noncompliant
    arguments++; // Noncompliant
    ++eval; // Noncompliant
    var obj = { set p(arguments) { } }; // Noncompliant
    var eval; // Noncompliant
    try { } catch (arguments) { } // Noncompliant
    function x(eval) { } // Noncompliant
    function arguments() { } // Noncompliant
    var y = function eval() { }; // Noncompliant
    var f = new Function("arguments", "return 17;"); // Noncompliant
}