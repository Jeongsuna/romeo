def runMatch(data_input):
    match data_input:
        case["a"]:
            print("The list only contains a and is just a single list")

        case["a", *other_items]:
            print(f"The 'a' is the first element\
			and {other_items} are the rest of the elements !")

        case[*first_items, "d"] | (*first_items, "d"):
            print(f"The 'd' is the last item and\
			{first_items} are the previous elements before it !")

        case _:
            print("No case matches with this one !")


if __name__ == "__main__":
    runMatch(["a"])
    runMatch(("a", "b"))
    runMatch(["a", "b", "c", "d"])
    runMatch(["b", "c", "d"])
