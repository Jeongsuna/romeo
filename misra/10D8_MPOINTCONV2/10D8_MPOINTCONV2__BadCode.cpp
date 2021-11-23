//struct s;       /* Incomplete type */
//struct t;       /* A different incomplete type */
//struct s* sp;
//struct t* tp;
//int16_t* ip;
//
//#include <stdlib.h>
//
//ip = (int16_t*)sp;    /* Non-compliant */
//sp = (struct s*)1234; /* Non-compliant */
//tp = (struct t*)sp;   /* Non-compliant - casting pointer into a
//                            * different incomplete type */