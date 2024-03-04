function reverseWords(sentence) {
    let charArray = sentence.split('');
    let start = 0;

    for (let i = 0; i < charArray.length; i++) {
        if (charArray[i] === ' ' || i === charArray.length - 1) {
            let end = (i === charArray.length - 1) ? i : i - 1;

            // Reverse the word
            while (start < end) {
                let temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }

            start = i + 1; // Move to the next word
        }
    }

    return charArray.join('');
}

// Example usage
let inputSentence = "This is a sunny day";
let reversedSentence = reverseWords(inputSentence);
console.log("Reversed Words in the Sentence: " + reversedSentence);
