function vacationBooksList(input) {
    let pages = Number(input[0])
    let pagesForHour = Number(input[1])
    let days = Number(input[2])

    let totalTimeForRead = pages/pagesForHour
    let forDay = totalTimeForRead/days
    console.log(forDay)
}
