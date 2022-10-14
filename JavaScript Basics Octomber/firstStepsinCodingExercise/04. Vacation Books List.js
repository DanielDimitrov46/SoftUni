function books(input){
    let numberofpages = Number(input[0]);
    let pagesforHour = Number(input[1]);
    let days = Number(input[2]);
    let totaltime = numberofpages /pagesforHour
    let total = totaltime/days;
    console.log(total);
}