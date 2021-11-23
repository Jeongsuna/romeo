void action_1()
{

}

void action_2()
{

}

int main()
{
    bool data_available = true;
    bool flag_1 = true, flag_2 = true, flag = true;

    if (flag_1)
    {
        if (flag_2)
        {
            action_1();
        }
        else
        {
            action_2();
        }
    }

    if (flag_1)
    {
        action_1();
    }
    else if (flag_2)        /* Compliant by exception */
    {
        action_2();
    }
    else
    {
        ;                       /* no action */
    }

    while (!data_available)
    {
    }
    return 0;
}