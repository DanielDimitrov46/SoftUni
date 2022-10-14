function calculator(input){
    let deposit = Number(input[0]);
    let months = Number(input[1]);
    let yearPercent = Number(input[2]);
    let sum = deposit  + months * ((deposit * (yearPercent/100) ) / 12)
    console.log(sum);   
}