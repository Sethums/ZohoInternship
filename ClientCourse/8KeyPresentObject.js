function keyPresentObject(myObject, searchKey) {
    return myObject[searchKey] ? true : false;
}

let myObject = { rollNo: 23, name: "Sethu", age: 23};
let searchKey = "name";

console.log(keyPresentObject(myObject, searchKey));
let searchKey1 = "id";
console.log(keyPresentObject(myObject, searchKey1));