word = input("Enter a word: ")

letterCount = 0

for count in range(0, len(word)):
    if "e" == word[count]:
        letterCount += 1

print(letterCount)
