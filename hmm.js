
var numbers = [345, 2345, 2345, 2345, 2345, 34523]

for(let i = 0; i < numbers.length; i++){
    console.log(numbers[i])
}


class Jeremiah{
    constructor(age, programminglanguage){
        this.age = age
        this.programminglanguage = programminglanguage
    }

    isevil(){
        if(this.programminglanguage === "Java"){
            return true
        }
        else return false
    }
}