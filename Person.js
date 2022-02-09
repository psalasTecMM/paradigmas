
class Person {
    constructor(n,l){
        this.name = n;
        this.lastName = l;
    }

    get getFullName(){
        return `${this.name} ${this.lastName}`;
    }
}

const p = Person("Jose","Perez");

console.log(p.getFullName);

