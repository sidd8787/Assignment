// Function to reverse every word in a sentence
function reverseWords(sentence) {
    // Split the sentence into words
    const words = sentence.split(" ");

    // Reverse each word and store them in an array
    const reversedWords = words.map(word => {
        return word.split("").reverse().join("");
    });

    // Join the reversed words to form the reversed sentence
    return reversedWords.join(" ");
}

// Input sentence
const inputSentence = "This is a sunny day";

// Reverse every word in the sentence
const reversedSentence = reverseWords(inputSentence);

console.log("Reversed Sentence: " + reversedSentence);

// Sorting an array in descending order
const numbers = [5, 2, 9, 1, 5, 6];
const sortedDescending = numbers.sort((a, b) => b - a);

console.log("Sorted Array in Descending Order: " + sortedDescending);
