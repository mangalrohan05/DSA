#include <iostream>

using namespace std;

void P1(int n)
{
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n; j++)
        {
            cout << "*";
        }
        cout << endl;
    }
}

void P2(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            cout << "*";
        }
        cout << endl;
    }
}

void P3(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            cout << j + 1;
        }
        cout << endl;
    }
}

void P4(int n)
{
    for (int i = 1; i <= n; i++)
    {
        for (int k = 1; k <= i; k++)
        {
            cout << i;
        }
        cout << endl;
    }
}

void P5(int n)
{
    for (int i = n; i > 0; i--)
    {
        for (int j = 0; j < i; j++)
        {
            cout << "*";
        }
        cout << endl;
    }
}

void P6(int n)
{
    for (int i = n; i > 0; i--)
    {
        for (int j = 0; j < i; j++)
        {
            cout << j + 1;
        }
        cout << endl;
    }
}

void P7(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - 1 - i; j++)
        {
            cout << " ";
        }

        for (int k = 0; k <= 2 * i; k++)
        {
            cout << "*";
        }
        cout << endl;
    }
}

void P8(int n)
{
    for (int i = n; i > 0; i--)
    {
        for (int j = 0; j < n - i; j++)
        {
            cout << " ";
        }

        for (int k = 0; k <= 2 * i - 2; k++)
        {
            cout << "*";
        }
        cout << endl;
    }
}

void P9(int n)
{
    P7(n);
    P8(n);
}

void P10(int n)
{
    for (int i = 0; i <= 2 * n; i++)
    {
        int stars = i > n ? 2 * n - i + 1 : i + 1;

        for (int j = 0; j < stars; j++)
        {
            cout << "*";
        }

        cout << endl;
    }
}

void P11(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            if ((i + j) % 2 == 0)
            {
                cout << "1 ";
                continue;
            }
            cout << "0 ";
        }
        cout << endl;
    }
}

void P12(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            cout << (j + 1);
        }

        for (int k = 0; k < 2*(n-i-1); k++)
        {
            cout << " ";
        }

        for (int l = 0; l <= i; l++)
        {
            cout << i - l + 1;
        }

        cout << endl;
    }
}

void P13(int n)
{
    int p = 1;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            cout << p << " ";
            p++;
        }

        cout << endl;
    }
}

void P14(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            cout << char(j + 65);
        }
        cout << endl;
    }
}

void P15(int n)
{
    for (int i = n; i > 0; i--)
    {
        for (int j = 0; j < i; j++)
        {
            cout << char(j + 65);
        }
        cout << endl;
    }
}

void P16(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            cout << char(i + 65);
        }
        cout << endl;
    }
}

void P17(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - 1 - i; j++)
        {
            cout << " ";
        }

        for (int k = 0; k <= 2 * i; k++)
        {
            if (k <= i)
            {
                cout << char(k + 65);
                continue;
            }
            cout << char(2 * i - k + 65);
        }
        cout << endl;
    }
}

void P18(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            cout << char(64 + n - i + j);
        }
        cout << endl;
    }
}

void P19(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = n; j > i; j--)
        {
            cout << "*";
        }

        for (int k = 0; k < 2 * i; k++)
        {
            cout << " ";
        }

        for (int l = n; l > i; l--)
        {
            cout << "*";
        }

        cout << endl;
    }

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            cout << "*";
        }

        for (int k = 0; k < 2*(n-i-1); k++)
        {
            cout << " ";
        }

        for (int l = 0; l <= i; l++)
        {
            cout << "*";
        }

        cout << endl;
    }
}

void P20(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            cout << "*";
        }

        for (int k = 0; k < 2 * (n - i - 1); k++)
        {
            cout << " ";
        }

        for (int l = 0; l <= i; l++)
        {
            cout << "*";
        }

        cout << endl;
    }

    n = n - 1;

    for (int i = n; i > 0; i--)
    {
        for (int j = 0; j < i; j++)
        {
            cout << "*";
        }

        for (int k = 0; k <= 2 * (n - i) + 1; k++)
        {
            cout << " ";
        }

        for (int j = 0; j < i; j++)
        {
            cout << "*";
        }

        cout << endl;
    }
}

void P21(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {

            if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
            {
                cout << "*";
                continue;
            }
            cout << " ";
        }
        cout << endl;
    }
}

void P22(int n)
{
    for (int i = 0; i < 2 * n - 1; i++)
    {

        for (int j = 0; j < 2 * n - 1; j++)
        {

            int top = i;
            int left = j;
            int right = 2 * (n - 1) - j;
            int bottom = 2 * (n - 1) - i;

            cout << (n - min(min(top, bottom), min(left, right))) << " ";
        }
        cout<<endl;
    }
}

int main()
{
    int x = 6;

    cout<<endl<<endl;
    
    P1(x);
    cout<<endl<<endl;
    P2(x);
    cout<<endl<<endl;
    P3(x);
    cout<<endl<<endl;
    P4(x);
    cout<<endl<<endl;
    P5(x);
    cout<<endl<<endl;
    P6(x);
    cout<<endl<<endl;
    P7(x);
    cout<<endl<<endl;
    P8(x);
    cout<<endl<<endl;
    P9(x);
    cout<<endl<<endl;
    P10(x);
    cout<<endl<<endl;
    P11(x);
    cout<<endl<<endl;
    P12(x);
    cout<<endl<<endl;
    P13(x);
    cout<<endl<<endl;
    P14(x);
    cout<<endl<<endl;
    P15(x);
    cout<<endl<<endl;
    P16(x);
    cout<<endl<<endl;
    P17(x);
    cout<<endl<<endl;
    P18(x);
    cout<<endl<<endl;
    P19(x);
    cout<<endl<<endl;
    P20(x);
    cout<<endl<<endl;
    P21(x);
    cout<<endl<<endl;
    P22(x);
    cout<<endl<<endl;

    return 0;
}
