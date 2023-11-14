struct message // Struct is for bit-fields only 
{ 
 signed int little: 4; // Note: use of basic types is required 
 unsigned int x_set: 1; 
 unsigned int y_set: 1; 
} message_chunk;