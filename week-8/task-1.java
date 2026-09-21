#include <iostream>
using namespace std;

class FRUIT
{
    string color;
    string taste;
    float price;

public:
    void display()
    {
        cout << "Color: " << color << endl;
        cout << "Taste: " << taste << endl;
        cout << "Price: " << price << endl;
        cout << endl;
    }

    void setData(string c, string t, float p)
    {
        color = c;
        taste = t;
        price = p;
    }
};

int main()
{
    FRUIT f1, f2, f3;

    f1.setData("Red", "Sweet", 80);
    f2.setData("Yellow", "Sweet and Sour", 60);
    f3.setData("Green", "Sour", 50);

    f1.display();
    f2.display();
    f3.display();

    return 0;
}
