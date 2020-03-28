# Advanced-Recursive-Methods
Advanced Recursive Methods in Java, second year first semester's first Data Structures project

## Methods
### Question1To3
A recursive method that gets as a parameter a square matrix **A** with *N* columns.  
The method calculates and returns the value of the following expression:  
![image](https://raw.githubusercontent.com/aviasd/Advanced-Recursive-Methods/master/README%20files/expressionForQuestion1To3.PNG)  
That is, the method calculates and returns: the sum of all the main diagonal numbers subtracts the sum of all non-diagonal numbers.  

### Question5
Given a set of *n* symbols that are nested in an array **A** of size *n*.  
Define f(*n*, *k*) as the number of options to choose *k* different symbols from the given set of numbers so that no two characters in array **A** are selected at consecutive locations.  
The method calculates and returns f(*n*, *k*).

### Question6
Define f(*n*, *k*) as the number of options to disperse *n* identical balls in *k* different cells.  
The method calculates and returns f(*n*, *k*).

### Question9To11
Given a natural number *Num*, we would like to express *Num* as a connected sum of natural numbers.  
For example, if the number *Num* is 4 then it can be expressed as an amount in the following ways:  
```
1 + 1 + 1 + 1
1 + 1 + 2
1 + 2 + 1
2 + 1 + 1
2 + 2
1 + 3
3 + 1
4
```
Combinations containing the same interconnected but in a different order are considered to be different.  
For example: `2 + 1 + 1` is different from `1 + 2 + 1` and both are different from `1 + 1 + 2`  

The recursive algorithm accepts a natural number as a parameter and returns the number of options that it can be obtained as a sum of natural interconnected.

### Question12
A recursive method that accepts as parameters: **A** array of integers and *p* position (index) in this array.  
The method returns two integer values:  
1) *m* - The length of the longest ascending sub-series from place *p* to end of array.
2) *x* - The length of the first ascending sub-series from place *p* to end of array.

### Question13
The secondary diagonal of matrix **A** contains the following cells:  
A[0][N-1], A[1][N-2], A[2][N-3],...,A[N-1][0]  
We define:  
* Arrow Matrix - Square Matrix **B** of *M*x*M* order will be called an Arrow Matrix if all cells in its secondary diagonal will contain the character 'b', and the rest of the matrix cells will contain the character 'a'.
Note: if *M* = 1,  the Arrow Matrix will contain only the 'b' character.
* Size - The size of Arrow matrix **B** of *M*x*M*  order is *M*.

The recursive method accepts as a parameter the matrix **A**.  

157/5000
The method checks for an Arrow Matrix in the right top corner of matrix **A**.  
If so then the method returns the maximum size of the Arrow Matrix, otherwise it returns 0.

#### Examples:
For the the next matrix:

|    |    |    |    |    |
|:--:|:--:|:--:|:--:|:--:|
|  f |  d |  a |  a |  a |
|  f |  g |  a |  b |  a |
|  f |  h |  b |  a |  a |
|  s |  k |  n |  b |  s |
|  a |  b |  k |  p |  o |

The method will return 0.

For the the next matrix:

|    |    |    |    |    |
|:--:|:--:|:--:|:--:|:--:|
|  f |  d |  c |  c |  ***b*** |
|  f |  g |  a |  b |  a |
|  f |  h |  b |  c |  a |
|  s |  k |  n |  b |  s |
|  a |  b |  k |  p |  o |

The method will return 1.

For the the next matrix:

|    |    |    |    |    |
|:--:|:--:|:--:|:--:|:--:|
|  f |  d |  f |  ***a*** |  ***b*** |
|  f |  g |  b |  ***b*** |  ***a*** |
|  f |  h |  b |  i |  d |
|  s |  k |  n |  b |  s |
|  a |  b |  k |  p |  o |

The method will return 2.


For the the next matrix:

|    |    |    |    |    |
|:--:|:--:|:--:|:--:|:--:|
|  f |  d |  ***a*** |  ***a*** |  ***b*** |
|  f |  g |  ***a*** |  ***b*** |  ***a*** |
|  f |  h |  ***b*** |  ***a*** |  ***a*** |
|  s |  k |  n |  b |  s |
|  a |  b |  k |  p |  n |

The method will return 3.

For the the next matrix:

|    |    |    |    |    |
|:--:|:--:|:--:|:--:|:--:|
|  f |  d |  a |  ***a*** |  ***b*** |
|  f |  g |  c |  ***b*** |  ***a*** |
|  f |  h |  b |  a |  a |
|  s |  k |  n |  b |  s |
|  a |  b |  k |  p |  m |

The method will return 2.

### Question14
The *i* th order statistic of a set of *n* elements is the *i* th smallest element. For example, the minimum of a set of elements is the first order statistic (i=1), and the maximum is The n th order statistic (i=n). A median is the "halfway point"
of the set  
![image](https://raw.githubusercontent.com/aviasd/Advanced-Recursive-https://raw.githubusercontent.com/aviasd/Advanced-Recursive-Methods/master/README%20files/expressionForQuestion14.PNG)  

#### 2 methods:
1) *findIthSmallestElement* - Suppose we are given an unsorted array **A** of integers. This method is a
Divide and Conquer recursive algorithm that finds the *i* th smallest
element.
The method first select an element x = **A**[*p*] from **A**[*p…r*] as a "pivot" element around which to partition **A**[*p…r*].  
It then grows two regions: **A**[*p…i*] and **A**[*j…r*], such that every element in **A**[*p…i*] is less than x and every element in **A**[*j…r*] is greater than or equal to x.

2) *findMissingElement* - Suppose we are given an unsorted array **A** of integers in the range 0 to *n* except for one integer. This method is a Divide and Conquer recursive algorithm that finds the missing number. We assume  
![image](https://raw.githubusercontent.com/aviasd/Advanced-Recursive-Methods/master/README%20files/expressionForQuestion14b.PNG)  
The method is using previous section and the median.

### Question15
An icecream network plans to establish many branches along a central Street.  
**M**[1], **M**[2],...,**M**[*n*] indicate the house numbers on the street where there is free space for establishing a new branch.  
The network is considering where to set up the new branches:  
From a market survey, the network estimates that in house number **M**[*i*] it's expected profits will be **P**[*i*] (**P**[*i*] is a positive number).  
The network will not establish two branches whose distance apart is less *k* (*k* is a positive whole number)

#### Example:

If *k* = 20 and the network chooses to set up a branch in house number 135, it is not allowed to set up a branch in its number
143, since 143 - 135 < 20.

We define as *mp*(*i*) the most profit you can earn from opening branches taken from the first *i* houses. *mp*(*i*) is monotonic and does not decrease in *i*.

#### 2 methods:
1) *mp* - A recursive method for calculating *mp* (I wrote 2 versions of it).
2) *printMp* - A recursive algorithm that gets as a parameters: The array **M** (with the house numbers), the array **P** (with the expected profits), and the number *k* (indicating the distance limit).  
The method prints the house numbers where branch offices are expected to maximize profitability (I wrote 2 versions of it).

### QuestionBonus
Definition: Decomposing a natural number *n* to the sum of *N* odd numbers is a presentation of this number as the sum of *N* odd natural numbers.  
For example, for - n = 7, N = 6, the decompositions are:  
```
7 = 1 + 1 + 1 + 1 + 3
7 = 1 + 3 + 3
7 = 1 + 1 + 5
7 = 7
```
The method reads a natural number from the input and prints all it's decompositions For a maximum of *N* odd numbers.  
The program also prints the number of decompositions.  
Note: The decompositions `7 = 1 + 3 + 3` and `7 = 3 + 1 + 3` are essentially the same decomposition and is printed and counted only once.
