
function wordMatchList(array, word) {
    let filteredArray = array.filter(function(arrElement) {
        return arrElement.includes(word);
    });
    return filteredArray;
}
let array = ["ProGram", "teleGram", "Agra", "kilogram","gram"];
let word = "Gram";
console.log(wordMatchList(array, word));