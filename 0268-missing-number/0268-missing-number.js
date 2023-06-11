/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = (nums) => {
    const n=nums.length;
  
    let sum = n * (n + 1) / 2;
    console.log( sum);
   
    for(let ele of nums){
        sum-=ele;

    }  

    return sum;
  
    
};