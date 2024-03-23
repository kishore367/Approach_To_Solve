class Solution {
    public int calPoints(String[] operations) {
        //create a new stack 
        Stack<Integer> stack = new Stack<>();
        //iterate thrown once

        for (String s : operations) {
            if (s.equals("+")) {
                //if the operator found it go should and perform operation of last 2
                stack.push(stack.peek() + stack.elementAt(stack.size()-2));
            }
            
            else if (s.equals("D")) {
                //get top most element and perfom the operation
                stack.push(stack.peek() * 2);
            }
            else if (s.equals("C")) {
                //pop the elementt in top stack
                stack.pop();
            }
            else {
                //convertion of string in numbers
                stack.push(Integer.parseInt(s));
            }

            //System.out.println(stack);
        }


        int sum = 0;
        // to print 

        for (int i : stack) {
            sum += i;
        }

        return sum;
    }
}

// en 
//An integer x.
//Record a new score of x.
//'+'.
//Record a new score that is the sum of the previous two scores.
//'D'.
//Record a new score that is the double of the previous score.
//'C'.
//Invalidate the previous score, removing it from the record.


// uz
// '+'. Oldingi ikki ballning yig'indisi bo'lgan yangi ball yozing.
// 'D'. Oldingi ballning ikki barobari bo'lgan yangi ball yozing.
// 'C'. Oldingi ballni rekorddan olib tashlab, bekor qiling.