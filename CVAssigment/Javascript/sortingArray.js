function descendingSort(arr) {
    let n = arr.length;
    
    for (let i = 0; i < n - 1; i++) {
        for (let j = 0; j < n - i - 1; j++) {
            // Swap if the element found is less than the next element
            if (arr[j] < arr[j + 1]) {
                let temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    // The array is now sorted in descending order
    return arr;
}

// Example usage:
let unsortedArray = [4, 2, 7, 1, 9, 5];
let sortedArray = descendingSort(unsortedArray);
console.log("Sorted Array in Descending Order:", sortedArray);
