void process_data()
{

}

void service_watchdog()
{

}

void action_10()
{

}

void action_20()
{

}

int fn()
{
    return 0;
}

int fake_main()
{
    bool data_available = true;
    bool flag_1 = true, flag_2 = true, flag = true;

    while (data_available)
        process_data();       /* Non-compliant */
    service_watchdog();

    if (flag_1)
        if (flag_2)            /* Non-compliant */
            action_10();         /* Non-compliant */
        else
            action_20();           /* Non-compliant */

    while (flag);           /* Non-compliant */
    {
        flag = fn();
    }
    return 0;
}