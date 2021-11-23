#define LIMIT 10

int ExitNow2(int x)
{
    return 0;
}

int GotoNow(int x)
{
    return 0;
}

int KeepGoing(int x)
{
    return 0;
}

int calc_new_x()
{
    return 0;
}

int calc_new_y()
{
    return 0;
}

int fake_main()
{
    for (int x = 0; x < LIMIT; ++x)
    {
        if (ExitNow2(x))
        {
            break;
        }
        else if (GotoNow(x))
        {
            goto EXIT;
        }
        else
        {
            KeepGoing(x);
        }
    }

EXIT:
    ;

    int x = 0, y = 0, z = 0;

    while (x != 0u)
    {
        x = calc_new_x();

        if (x == 1u)
        {
            break;
        }

        while (y != 0u)
        {
            y = calc_new_y();

            if (y == 1u)
            {
                goto L1;
            }
        }
    }

L1:
    z = x + y;
    
    return 0;
}