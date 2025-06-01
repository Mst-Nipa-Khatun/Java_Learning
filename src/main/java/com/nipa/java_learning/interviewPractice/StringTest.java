package com.nipa.java_learning.interviewPractice;

public class StringTest {

    public static void main(String[] args) {
        String s1 = "Nipa loves you";
        System.out.println("s1  = " + s1);

        String s2 = s1.replace("i","e");
        System.out.println("s1 value replace = " + s2);

        String[] s3 = s1.split(" ");
        for (String x : s3) {
            System.out.println(x);
        }
        String B = s1.trim();
        System.out.println(B);

        char ch = s1.charAt(7);
        System.out.println("char is   : "+ch);

        int value = s1.codePointAt(5);
        System.out.println("value is : "+value);

        int position = s1.indexOf("you");
        System.out.println("Position is : "+position);

        position = s1.lastIndexOf('y');
        System.out.println("Last Position is : "+position);

    }

    /*# Data
courseA = {"rakib": 85, "miraz": 85, "sajib": 80, "harun": 77, "roton": 80}
courseB = {"ronju": 90, "jashim": 82, "rajib": 77, "imran": 80}
courseC = {"milon": 80, "rabbi": 80, "aminul": 75, "reza": 81, "imran": 85}

# Combine all students
all_students = {**courseA, **courseB, **courseC}  # second imran will override first

# Separate passed and failed
passed = []
failed = []

for name, mark in all_students.items():
    if mark >= 80:
        passed.append(name)
    else:
        failed.append(name)

print("Passed:", ", ".join(passed))
print("Failed:", ", ".join(failed))



arr = [2, 4, 4, 5, 8, 9, 12]
n = 15
found = [0] * (n + 1)

for num in arr:
    if num <= n:
        found[num] += 1

missing = []
repeating = []

for i in range(n + 1):
    if found[i] == 0:
        missing.append(i)
    elif found[i] > 1:
        repeating.append(i)

print("Missing numbers:", missing)
print("Repeating numbers:", repeating)

a = 10
b = 20
c = 15

# Using basic comparison logic
if (a > b and a < c) or (a < b and a > c):
    middle = a
elif (b > a and b < c) or (b < a and b > c):
    middle = b
else:
    middle = c

print("Middle value:", middle)



# Series: 5, 10, 15, ..., 105
total = 0
for i in range(5, 106, 5):
    total += i

print("Sum of series:", total)
*/
}
