char* MD5HashAlgorithm(char* data, char *hasedData, char* NULL) {
	return "PASSWORD";
}
void GenerateHash(char* data) {
	char* NULL = "NULL";
	char hashedData[512] = { 0 };
	//솔트 값 부분이 NULL로 되어있어 들어가지 않는다.
	MD5HashAlgorithm(data, hashedData, NULL);
}
