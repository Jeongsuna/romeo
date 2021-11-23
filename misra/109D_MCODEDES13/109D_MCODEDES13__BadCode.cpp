///* These functions are intended to be paired */
//extern mutex_t mutex_lock(void);
//extern void mutex_unlock(mutex_t m);
//extern int16_t x;
//void f(void)
//{
//    mutex_t m = mutex_lock();
//    if (x > 0)
//    {
//        mutex_unlock(m);
//    }
//    else
//    {
//        /* Mutex not unlocked on this path */
//    }
//}