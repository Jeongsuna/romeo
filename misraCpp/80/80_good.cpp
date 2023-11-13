#include <iostream>

class Colour {
public:
    Colour(int r, int g, int b) : r_(r), g_(g), b_(b) {}
    // ...
private:
    int r_, g_, b_;
};

void setColour(Colour const & colour) {
    std::cout << "Setting colour: " << &colour << std::endl;
}

class Obj {
public:
    virtual bool hasColour() const = 0;
    virtual Colour getColour() const = 0;
};

class ObjWithColour : public Obj {
public:
    ObjWithColour(Colour colour) : m_colour(colour) {}

    virtual bool hasColour() const {
        return true;
    }

    virtual Colour getColour() const {
        return m_colour;
    }

private:
    Colour m_colour;
};

void printObject(Obj const & obj) { // Revised function
    if (obj.hasColour()) { // Check if the object has a colour
        setColour(obj.getColour()); // Get the colour
    }
}

int main() {
    Colour red(255, 0, 0);
    ObjWithColour obj(red);

    std::cout << "Print object: " << std::endl;
    printObject(obj);

    return 0;
}
