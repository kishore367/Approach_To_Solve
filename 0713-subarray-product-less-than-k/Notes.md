Approach
Moving pointers r & l with l<=r satisfing prod=nums[l]*nums[l+1]*...*nums[r]<k.
Just dividing by nums[l] for the past l, and multiplying with nums[r] for the current r.
Be careful with overflow, using unsigned for sure.(In fact unsigned is enough thanks to the comments by @Sergei, originally set unsigned long long)

Complexity
Time complexity:
O(n)

Space complexity:
O(1)
