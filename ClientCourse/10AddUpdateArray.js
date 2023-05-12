let myObject = {
    list: [
        {name: "Sethu"},
        {name: "Anu"},
        {name: "Keerthi"}
    ]
}


console.log(myObject.list);
myObject.list.push({name: "Krishna"});
console.log(myObject.list);
myObject.list[2].name = "Eldhose";
console.log(myObject.list);
myObject.list.push({name: "Arya"});
console.log(myObject.list);
