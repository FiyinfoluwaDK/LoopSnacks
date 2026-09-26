word = input("Enter a word: ")

vowelCount = 0

for count in range(0, len(word)):
    letter = word[count]

    if letter == 'a' or letter == 'e' or letter == 'i' or letter == 'o' or letter == 'u':
        vowelCount += 1

print(vowelCount)
