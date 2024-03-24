//Approach 2

class Solution
{
    public int countStudents(int[] students, int[] sandwiches) 
    {//T -> O(n) S ->O(1)
        int[] a ={0, 0};//acts as a database to keep track of number of sandwich consumed vs expected 
        
        for(int i=0;i<students.length;i++)
        {
            a[students[i]]+=1;//counting number of 0s and 1s (which sandwich is required)
        }
        
        int k = 0;///traversing the index of the the sandwitchs //acctuallly eating the sandwich 
        
        while(k < sandwiches.length)
        {
            if(a[sandwiches[k]] > 0)
            {//students eated the desired sandwich from top to bottom 
                a[sandwiches[k]]-=1;//consumed sandwich 
            }
            else
            {//demand and supply not met 
                break;//we have but they want some other sandwitch 
            }
            k+=1;//moving the index 
        }
        return sandwiches.length-k;//number of people has not eaten the sandwitch 
    }
}//Please do vote me, It helps a lot