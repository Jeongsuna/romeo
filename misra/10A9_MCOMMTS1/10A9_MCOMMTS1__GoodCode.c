/* some comment, end comment marker accidentally omitted
<<New Page>>
Perform_Critical_Safety_Function( X );
this comment is compliant */

int x2 = 0;
int y2 = 0;

int fake_main() {
	x2 = y2 /*
		+ z
		*/
		;
	return 0;
}
