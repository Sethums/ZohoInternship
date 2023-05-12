function stringInsertion(String, stringToInsert, position ) {
    position += 1;
    return String.slice(0, position) + stringToInsert + String.slice(position);
}

let String = "C Programming";
let stringToInsert = " and DS  ";
let position = 10;

console.log(stringInsertion(String, stringToInsert, position))


