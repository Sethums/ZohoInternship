function starTriangle(limit) {
    let pattern = '';
    for (let i = 0; i <= limit; i++) {
        pattern = '';
        for (let j = 0; j < i; j++)
            pattern += "* ";
            
        console.log(pattern);
    }

}

let limit = 5;
starTriangle(limit);