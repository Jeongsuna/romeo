#define LIMIT 10

int ExitNow(int x)
{
    return 0;
}

int main()
{
    for (int x = 0; x < LIMIT; ++x)
    {
        if (ExitNow(x))
        {
            break;
        }

        for (int y = 0; y < x; ++y)
        {
            if (ExitNow(LIMIT - y))
            {
                break;
            }
        }
    }
    
    return 0;
}