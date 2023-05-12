function propertiesOfObject(myObject) {
    let keyObjects = [];
    for (let key in myObject)
        keyObjects.push(key);

    return keyObjects;
}

let myObject = { 
    rollNo: 23, 
    name: "Sethu",
     age: 23};
console.log(propertiesOfObject(myObject));