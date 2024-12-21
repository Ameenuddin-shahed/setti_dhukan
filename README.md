Retail shop
Given you are running a retail shop, write a program that can take read the products customers have bought and generate bill
First line of input will be the number of tax categories(N) present example essential items, luxury items etc.
Next N lines will be the tax prices on each tax category in order
For example essentials category with 2% tax, luxory category with 7% etc.
Next line will contain number of type of products(M) present in the shop.
Next M lines will be input of each product. Each input contains
product name, product tax category and unit price.
After this input, read the number of customers waiting(C) in the queue for the bill
Next line will be the number of products present(B1) in first customers basket
Then next B1 lines will be product_name followed by the number of units purchased

Price for each product is computed as : unit_price_of_item * quantity + tax amount(% of tax applied on the product category)
Example:
3 tomato units will cost
3*10 + 2% = 30 + (2 * 30/ 100) = 30.6

Input order
// number of categories present
// c1 gst%
// c2 gst%
// c3 gst%
// number of products
// product_name, category, unit_price
// product_name, category, unit_price
// number of customers
// items in first customer basket
// item_name,number of units
// item_name,number of units
Example input:
3
2
5
7
3
tomato, 1, 10
powder, 2, 12
ornament, 3, 40
2
2
tomato, 3
ornament, 4
3
tomato, 4
ornament, 5
powder, 3

output:
201.8
292.6
