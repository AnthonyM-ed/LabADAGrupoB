# 1. Convert from O(n^2) to O(n)
def greatestNumber(array):
    for i in array:
        isIValTheGreatest = True
        for j in array:
            if j > i:
                isIValTheGreatest = False
        if isIValTheGreatest:
            return i

















for i in array:
    print(i)

for (auto e : array) {
    
}

array.each { |e| puts e }
array.each_with_index { |e, i| }

# 2. What is the time complexity of this code?
def every_other(array)
    array.each_with_index do |number, index|
        if index.even?
            array.each do |other_number|
                puts number + other_number
            end
        end
    end
end















# 3. What is the time complexity in terms of O()?
function twoSum(array) {
    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array.length; j++) {
            if (i !== j && array[i] + array[j] === 10) {
                return true;
            }
        }
    }
    return false;
}


for e in array:
    pass

for i, e in enumerate(array, 1):
    pass

#Complejidad de O(n^2)







# 4. What is the time complexity in terms of O()?
# O(n * m)
# n : 
# m :
"fgh" "abcdefghi"
def find_needle(needle, haystack)
    needle_index = 0
    haystack_index = 0
    
    while haystack_index < haystack.length
        if needle[needle_index] == haystack[haystack_index]
            found_needle = true
            while needle_index < needle.length
                if needle[needle_index] != haystack[haystack_index + needle_index]
                    found_needle = false
                break
            end
            needle_index += 1
            end
        return true if found_needle
        needle_index = 0
        end
        haystack_index += 1
    end
    return false
end






# 5. What is the time complexity in terms of O()?
# O(log_2(n))
# resumes is an array
def pick_resume(resumes):
    eliminate = "top"
    
    while resumes.length > 1:
        if eliminate == "top":
            resumes = resumes[resumes.length / 2, resumes.length - 1]
            eliminate = "bottom"
        elif eliminate == "bottom":
            resumes = resumes[0, resumes.length / 2]
            eliminate = "top"
        end
    end
    return resumes[0]
end









# Review of Time Complexity
# Q1: What is the time complexity of
for (i = 0; i < n; i++) {
    statement;
}

# A1: O(n)
for (i = 0; i < n; i++) {   # n + 1 
    statement;              # n
}










# Q2: What is the time complexity of
for (i = n; i > 0; i--) {
    statement;
}

# A2: O(n)
for (i = n; i > 0; i--) { #n+1
    statement;            #n
}








# Q3: What is the time complexity of
for (i = 0; i < n; i=i+5) {
    statement;
}

0 2 4 6 ... n - 2

# A3: O(n)
# It can be 2, 20, etc
for (i = 0; i < n; i=i+2) {
    statement;              # n/2
}











# Q4: What is the time complexity of
for (i = 0; i < n; i++) {
    for (j = 0; j < n; j++) {
        statement;
    }
}

# A4: O(n^2)
for (i = 0; i < n; i++) {       # n + 1
    for (j = 0; j < n; j++) {   # n * (n + 1)
        statement;              # n * n
        cout << "i" << '\n';
    }
}









// Q5: What is the time complexity of
for (i = 0; i < n; i++) {
    for (j = 0; j < i; j++) {
        statement;
    }
}

# A5: 
# Tracing the values of the variables
#  i   j      no of times
# ------------------------
#  0   0 ❌     0
# ------------------------
#  1   0 ✔️     1
#      1 ❌     
# ------------------------
#  2   0 ✔️     2
#      1 ✔️  
#      2 ❌ 
# ------------------------
  .    
  .    
  .    
# ------------------------
#  n             n

# 1 + 2 + 3 + ... + n = n * (n + 1) / 2    
# O(n^2)











# Q6: What is the time complexity of
p = 0
for (i = 1; p <= n; i++) {
    p = p + i;
}

# A6:
#  i       p
# ------------------------
#  1       0 + 1 = 1
#  2       1 + 2
#  3       1 + 2 + 3
#  4       1 + 2 + 3 + 4
#  .    
#  .    
#  .    
#  k       1 + 2 + 3 + 4 + ... + k

# Assume k > n
# p = k * (k + 1) / 2
#/               p > n
#/ k * (k + 1) / 2 > n
#/ k^2 > n
#/ k > sqrt(n)
#/ O(n^(1/2))






# Q7: What is the time complexity of
for (i = 1; i < n; i = i*2) {
    statement;
}

# A7:
#  i       
# ------------------------
#  1       
#  1 * 2 = 2
#  2 * 2 = 2^2
#  2 * 2^2 = 2^3
#  .    
#  .    
#  .    
#  2^k

# Assume i >= n
''' Therefore i = 2^k
//      2^k >= n
//       2^k = n
//         k = log_2(n)
// O(log_2(n))'''





# Comparing
for (i = 1; i <= n; i++) {
    statement;
}

''' i = 1 + 1 + 1 + ... + 1 = n
//     -------------------
//           k = n
'''
for (i = 1; i < n; i = i*2) {
    statement;
}

''' i = 1 * 2 * 2 * ... * 2 = n
//     -------------------
//           2^k = n
//             k = log_2(n)
'''




for (i = 1; i < n; i = i*2) {
    statement;          # log(n)
}
'''
//  n = 8       
//  i       
// ------------------------
//  1
//  2
//  4
//  8 ❌ 
// It is repeated 3 times






//  n = 10
//  i       
// ------------------------
//   1
//   2
//   4
//   8 
//  16 ❌ 
// It is repeated 4 times






// log_2(8) = 3
// log_2(10) = 3.322
// So we must apply the ceil to log_2(n)
'''














# Q8: What is the time complexity of
for (i = n; i >= 1; i = i/2) {
    statement;
}
'''
//  i       
// ------------------------
//  n
//  n / 2
//  n / 2^2
//  n / 2^3
//  .
//  .
//  .
//  n / 2^k


// Assume that i < 1
// Therefore n / 2^k < 1
//           n / 2^k = 1
//                 n = 2^k
//                 k = log_2(n)
// A8: O(log_2(n))
'''















# Q9: What is the time complexity of
for (i = 0; i * i < n; i++) {
    statement;
}
'''
// Condition       i * i < n
// To finish       i * i >= n
// We assume that     i^2 = n
//                      i = sqrt(n)
// A9: O(sqrt(n))
'''









# Q10: What is the time complexity of
for (i = 0; i < n; i++) {
    statement;
}

for (j = 0; j < n; j++) {
    statement;
}

# A10: O(n)
for (i = 0; i < n; i++) {
    statement;          # n
}

for (j = 0; j < n; j++) {
    statement;          # n
}
                        # 2 * n












# Q11: What is the time complexity of
p = 0
for (i = 1; i < n; i = i * 2) {
    p++;
}

for (j = 1; j < p; j = j * 2) {
    statement;
}


# A11:
p = 0
# (2)
for (i = 1; i < n; i = i * 2) {
    p++;                    # p = log(n)
}

# (1)
for (j = 1; j < p; j = j * 2) {
    statement;              # log(p)
}
'''
// So, we have log(p) and p = log(n)
// replacing log log(n)
// O(log log(n))
'''











# Q12: What is the time complexity of
for (i = 0; i < n; i++) {
    for (j = 1; j < n; j = j * 2) {
        statement;
    }
}

# A12: 
for (i = 0; i < n; i++) {            # (1)
    for (j = 1; j < n; j = j * 2) {  # (2)
        statement;                   # (3)
    }
}

'''
// (1) This repeats n times
// (2) and this inner loop n times * log(n)
// (3) and this statement n times * log(n) 
// Adding them together n + 2 n * log(n)
// O(n log(n))
'''





// Review
for (i = 0; i < n; i++)       // O(n)


for (i = 0; i < n; i=i+2)     // O(n)


for (i = n; i >= 1; i--)      // O(n)


for (i = 1; i < n; i=i*2)     // O(log_2(n))


for (i = 1; i < n; i=i*3)     // O(log_3(n))


for (i = n; i >= 1; i=i/2)    // O(log_2(n))
