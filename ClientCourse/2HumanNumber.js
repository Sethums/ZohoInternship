function humanizedNumber(number) {
    number = Number(number);
    let unitPlace = number % 10;
    let suffix = "";

    
    if ((unitPlace > 3 && unitPlace < 10) || unitPlace==0)
        suffix = "th";
    else
        switch (unitPlace) {
            case 1:
                suffix = "st";
                break;
            case 2:
                suffix = "nd";
                break;
            case 3:
                suffix = "rd";
                break;
        }
   

    humanizedString = number + suffix;
    return humanizedString;
}

let number = 1002;
console.log(humanizedNumber(number))



