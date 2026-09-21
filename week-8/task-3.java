#include <iostream>
using namespace std;

class FRUIT
{
    string color;
    string taste;
    float price;

public:
    void setDetails(string c, string t, float p)
    {
        color = c;
        taste = t;
        price = p;
    }

    void display()
    {
        cout << "Color: " << color << endl;
        cout << "Taste: " << taste << endl;
        cout << "Price: " << price << endl;
    }
};

int main()
{
    FRUIT f;

    f.setDetails("Red", "Sweet", 80);
    f.display();

    return 0;
}
