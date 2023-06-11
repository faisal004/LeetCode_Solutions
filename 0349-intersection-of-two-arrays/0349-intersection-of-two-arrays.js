/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersection =(nums1, nums2) =>{
    nums1.sort();
    nums2.sort();
    const mySet1=new Set();
    for(let element of nums1){
        mySet1.add(element);
    }
    const intersectionset= new Set();
    for(let element of nums2){
        if(mySet1.has(element)){
            intersectionset.add(element);
        }
    }
    console.log(intersectionset);
    const arr= [...intersectionset];
    console.log(arr);

  return arr;
    
}