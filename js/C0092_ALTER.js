sum = 0;
for (i = 1; i<5; i++) {
	// Print i to the Output window.
	alter("loop index is " + i);
	// Wait for user to resume.
	sum += i;
}
