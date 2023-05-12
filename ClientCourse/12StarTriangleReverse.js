function starTriangleReverse(limit) {
    let pattern = '';

    for (let i = 0; i < limit; i++) {
        pattern = ''
        for (let j = limit; j > i; j--)
            pattern += '* ';
        console.log(pattern);
    }
}

let limit = 5;
starTriangleReverse(limit);