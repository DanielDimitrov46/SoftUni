function depositCalculator(input) {
    let deposit = Number(input[0])
    let monthsDeposit = Number(input[1])
    let yearPercent = Number(input[2]/100)
    let lihva = deposit*yearPercent
    let lihvaForMonth = lihva/12
    let sum = deposit+monthsDeposit*lihvaForMonth
    console.log(sum)
}
depositCalculator(["200 ",
    "3 ",
    "5.7 "]
)