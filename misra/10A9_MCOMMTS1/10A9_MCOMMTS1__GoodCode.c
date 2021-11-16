/* some comment, end comment marker accidentally omitted
<<New Page>>
Perform_Critical_Safety_Function( X );
this comment is compliant */

int x = 0;
int y = 0;

int main() {
	x = y /*
		+ z
		*/
		;
	return 0;
}
