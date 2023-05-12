function arrayCheck(input){
    return Array.isArray(input);
}

let input = [1,2,3];
console.log(arrayCheck(input));
let input1 = {1:"rollNo",2:"name"};
console.log(arrayCheck(input1));
let input2 = [1,"sethu",3];
console.log(arrayCheck(input2));