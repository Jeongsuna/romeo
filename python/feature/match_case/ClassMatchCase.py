from dataclasses import dataclass

@dataclass
class Person:
    name: str
    age: int
    salary: int


@dataclass
class Programmer:
    name: str
    language: str
    framework: str


def runMatch(instance):
    match instance:
        case Programmer("Om", language="Python",
                        framework="Django"):
            print("He is Om and he is a Python programmer and \
			uses Django Framework!")

        case Programmer("Rishabh", "C++"):
            print("He is Rishabh and is a C++ programmer !")

        case Person("Vishal", age=5, salary=100):
            print("He is vishal and he is a kid !")

        case Programmer(name, language, framework):
            print(f"He is programmer , his name is {name} ,\
			he works in {language} and uses {framework} !")

        case Person():
            print("He is just a person !")

        case _:
            print("This person is nothiing !")


if __name__ == "__main__":
    programmer1 = Programmer("Om", "Python", "Django")
    programmer2 = Programmer("Rishabh", "C++", None)
    programmer3 = Programmer("Sankalp", "Javascript", "React")
    person1 = Person("Vishal", 5, 100)
    runMatch(programmer1)
    runMatch(programmer2)
    runMatch(person1)
    runMatch(programmer3)
