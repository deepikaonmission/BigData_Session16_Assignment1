//<<<<<<<<---------- TASKS ----------->>>>>>>>

/*
Given a list of numbers - List[Int] (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
- find the sum of all numbers
- find the total elements in the list
- calculate the average of the numbers in the list
- find the sum of all the even numbers in the list
- find the total number of elements in the list divisible by both 5 and 3
*/

//*******************************************
//Creating List[Int](1,2,3,4,5,6,7,8,9,10)
val lst = List[Int](1,2,3,4,5,6,7,8,9,10)

//Output---->>>>>
//lst: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//*******************************************


//<<<<<<<<------ Problem 1 Starts -------->>>>>>>
//find the sum of all numbers

println("Sum of all elements : "+ lst.reduce((x,y) => x+y))

//Output-------->>>>
//Sum of all elements : 55
//res0: Unit = ()

//Explanation----->>>>>
//lst.reduce((x,y) => x+y)
//how reduce works here?
//reduce takes two elements (x,y) of list lst at a time and using x+y does sum of x and y
//reduce does this processing iteratively until last element is reached and at the end results total sum
//println() prints the given String and computed result

//************** Problem 1 Ends *********************


//<<<<<<<<------ Problem 2 Starts -------->>>>>>>
//find the total elements in the list

println("Total elements in the list : "+lst.length)

//Output------->>>>>
//Total elements in the list : 10
//res1: Unit = ()

//Explanation----->>>>>>
//lst.length computes and returns the length of elements present inside the list
//println() prints the given String and computed result

//************** Problem 2 Ends *********************


//<<<<<<<<------ Problem 3 Starts -------->>>>>>>
//calculate the average of the numbers in the list

println("Average of the numbers in the list : "+lst.reduce((x,y) => x+y)./(lst.length))

//Output----->>>>>>
//Average of the numbers in the list : 5
//res2: Unit = ()

//Explanation------->>>>>>
//lst.reduce((x,y) => x+y))./(lst.length)
//here,
//1. lst.reduce((x,y) => x+y))
//here, reduce takes two elements of the list at a time and does sum of them and iteratively does the same processing until last element is reached and at the end results total sum

//2. lst.length takes input from list

//3. / performs integer division on the total sum received from reduce and divides the sum by length of the list
//so at the end average of numbers is returned

//println prints the given String and computed result

//************** Problem 3 Ends *********************


//<<<<<<<<------ Problem 4 Starts -------->>>>>>>
//find the sum of all the even numbers in the list

println("Sum of all the even numbers in the list : "+lst.filter(x => x%2==0).reduce(_+_))

//Output------->>>>>>>>>
//Sum of all the even numbers in the list : 30
//res3: Unit = ()

//Explanation-------->>>>>
//lst.filter(x => x%2==0).reduce(_+_)
//here, two operators are associated
//1. first operator: filter(x => x%2==0)
//filter takes each element of the list iteratively and filters even numbers based on (x%2==0) condition

//2. second operator: reduce(_+_)
//it takes input from first operator (filter) i.e. list of even numbers
//and does sum of elements by taking two elements at a time from the list
//reduce(_+_) is equivalent to reduce((x,y) => x+y)

//println prints the given String and computed result

//************** Problem 4 Ends *********************


//<<<<<<<<------ Problem 5 Starts -------->>>>>>>
//find the total number of elements in the list divisible by both 5 and 3

println("Total number of elements in the list divisible by both 5 & 3 : "+lst.filter(x => (x%5==0 && x%3==0)).length)

//Output----->>>>>
//Total number of elements in the list divisible by both 5 & 3 : 0
//res4: Unit = ()
//here output is 0 as there is no element inside the list which is divisible by both 5 & 3

//Explanation----->>>>>
//lst.filter(x => (x%5==0 && x%3==0)).length
//here two operators are associated
//1. first operator: filter(x=> (x%5==0 && x%3==0))
//filter takes each element of list and filters only those elements which are divisible by both 5 and 3 based on (x%5==0 && x%3==0) condition
//and results the list of filterd numbers

//2. second operator: length
//it takes input from filter operator i.e. list of filtered numbers
//and returns the length of the list of filtered numbers

//Another example
println("Total number of elements in the list divisible by both 2 & 3 : "+lst.filter(x => (x%2==0 && x%3==0)).length)

//Output------>>>>>>>
//Total number of elements in the list divisible by both 2 & 3 : 1
//res5: Unit = ()
//here output is 1 because 6 is the element which is divisible by both 2 & 3,
//therefore, filtered list contains 1 element i.e. 6 so length operator results 1

//************** Problem 5 Ends *********************





