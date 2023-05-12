let counterObj = {
    value: 0,
    increment() {
        this.value++;
    },
    decrement() {
        this.value--;
    },
    reset() {
        this.value = 1;
    },
}

console.log(counterObj.value);
counterObj.decrement();
console.log(counterObj.value);
counterObj.increment();
console.log(counterObj.value);
counterObj.reset();
console.log(counterObj.value);