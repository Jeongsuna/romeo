function foo1() {
    try {
        return doSomething(); // We expect 1 to be returned
    } catch(err) {
        return 2; // Or 2 in cases of error
    } finally {
        return 3; // Noncompliant: 3 is returned before 1, or 2, which we did not expect
    }
}

function foo2() {
     while(true) {
         try {

             doSomething(); // We expect 1 to be returned

         } catch(err) {
             return 2; // Or 2 in cases of error
         } finally {
             break; // Noncompliant: 3 is returned before 1, or 2, which we did not expect
         }
     }
     return 1;
 }

function foo3() {
     while(true) {
         try {
             doSomething(); // We expect 1 to be returned
         } catch(err) {
             return 2; // Or 2 in cases of error
         } finally {
             continue; // Noncompliant: 3 is returned before 1, or 2, which we did not expect
         }
     }
     return 1;
}

function foo3() {
     while(true) {
         try {

             doSomething(); // We expect 1 to be returned
         } catch(err) {
             return 2; // Or 2 in cases of error
         } finally {
             throw "good"; // Noncompliant: 3 is returned before 1, or 2, which we did not expect
         }
     }
     return 1;
}