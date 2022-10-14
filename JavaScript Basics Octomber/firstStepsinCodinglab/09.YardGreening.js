function yardGreening(input){
    let area = Number(input[0]);
    let priceWithoutDiscount = area*7.61;
    let discount = priceWithoutDiscount*0.18;
    console.log(`The final price is: ${priceWithoutDiscount-discount} lv.`);
    console.log(`The discount is: ${discount} lv.`);
}
