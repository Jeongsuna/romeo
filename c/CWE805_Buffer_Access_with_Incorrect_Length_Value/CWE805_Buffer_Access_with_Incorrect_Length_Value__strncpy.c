
void CWE805_Buffer_Access_with_Incorrect_Length_Value__strncpy_bad() {
	char source[21] = "the character string";
	char dest[12];
	strncpy(dest, source, sizeof(source)-1);
}	

void CWE805_Buffer_Access_with_Incorrect_Length_Value__strncpy_good() {
	char source[21] = "the character string";
	char dest[12];
	strncpy(dest, source, sizeof(dest)-1);
}
