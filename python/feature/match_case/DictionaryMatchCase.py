def runMatch(dictionary):
    match dictionary:
        case {"name": "Om"}:
            print("This matches only for one key ,\
			that is if they key exists with the pair \
			value then this block will be selected !")

        case {"framework": "Django", "language": "Python"}:
            print("This one matches multiple keys and values . !")

        case {"name": name, "language": language,
              "framework": framework}:
            print(f"The person's name is {name} , \
			the language he uses is {language}\
			and the framework he uses is {framework} !")

        case _:
            print("Matches anything !")


if __name__ == "__main__":
    a = {
        "name": "Om",
        "language": "Python",
        "framework": "Django",
    }
    runMatch(a)
    a["name"] = "Rishabh"
    runMatch(a)
    a["language"] = "C++"
    runMatch(a)
