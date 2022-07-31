import re
number_of_barcodes = int(input())

for _ in range(number_of_barcodes):
    barcodes = input()
    pattern = r'(\@\#{1,})([A-Z][A-Za-z0-9]{4,}[A-Z])(\@\#{1,})'
    result = re.match(pattern,barcodes)

    if not result:
        print('Invalid barcode')
    else:
        result2 = re.findall(r'\d',barcodes)
        if not result2:
            print("Product group: 00")
        else:
            print(f"Product group: {''.join(result2)}")