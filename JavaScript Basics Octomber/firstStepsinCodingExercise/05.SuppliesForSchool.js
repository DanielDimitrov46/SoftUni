function SuppliesForSchool(input) {
    let packetsPencils = Number(input[0])
    let packetsMarkers = Number(input[1])
    let litersClear = Number(input[2])
    let discount = Number(input[3])/100

    let pricePencils = packetsPencils*5.80
    let priceMarkers = packetsMarkers*7.20
    let priceClear = litersClear*1.20
    let allMaterials = pricePencils+priceMarkers+priceClear
    let totalWithDiscount = allMaterials*(1.00-discount)
    console.log(totalWithDiscount)
}